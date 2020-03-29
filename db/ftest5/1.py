import re
import json
import csv

verbose = True
check_source = None  # Ground truth source function
check_data = {}      # Ground truth data: (check_source, head, nodeId, nodeType) -> sons

with open('ftest5.json') as f:
    funcdata = json.load(f)  # list of functions ground truth ("source" and "control splits" fields)
    if isinstance(funcdata, dict):  # fix only one func; cause of json.load
        funcdata = [funcdata]
        for data in funcdata:
            check_source = data['source']  # Source Function name
            if verbose:
                print('Validating function {}.'.format(check_source))
                for cs in data['control splits']: # Go through its Control Splits
                    node = cs['node']
                    node = re.split("\|", node)
                    assert len(node)==2
                    nodeId = node[0]
                    nodeType = node[1]
                    head = cs['head']
                    sons = set()
                    sonsPattern = re.compile("^\s+|\s*,\s*|\s+$")
                    for son in cs['sons']:  # For every Control Split branching paths add it to the sons set
                        tmp = son.split('|')
                        assert len(tmp)==2, "path tail information not provided"
                        print(tmp)
                        son, tail = tmp[0], tmp[1]
                        sons.add((frozenset(sonsPattern.split(son)), frozenset(sonsPattern.split(tail))))
                    check_data[(check_source, head, nodeId, nodeType)]=sons
print(check_data)

print('scv parse')
with open('importantFeatures.csv', mode='r') as csv_read:
    csv_reader = csv.DictReader(csv_read)
    
    for elem in csv_reader:  # Go through input .csv file (Control Splits information)
        _id = elem['Graph Id']
        _source = elem['Source Function']
        _head = elem['head']
        _nodeId = elem['Node Id']
        _nodeType = re.split("\|", elem['Node Description'])[1]
        _nodeBCI = elem['Node BCI']
        print('Validating Control Split: {:7s} {:7s} {:7s} {:30s}:'.format(_source, _id, _head, str(nodeId)+"|"+_nodeType))
            
        orign = None
        print('Trazim:', (_source, _head, _nodeId, _nodeType))
        if (_source, _head, _nodeId, _nodeType) in check_data:
            orign = check_data[(_source, _head, _nodeId, _nodeType)]  # Ground truth data for current Control Split
            print('orig: ', orign)
        else:
            print('Err')
            exit(1)

        """
            print(cs)
            tmp = cs.split('][')
            assert len(tmp)==2, "path tail information not provided"
            print(tmp)
            son, tail = tmp[0], tmp[1]
        """
        csValid = True
        for cs in elem[None]:
            print('cs:', cs)
            tmp = cs.split('][')
            assert len(tmp)==2, "path tail information not provided"
            print(tmp)
            son, tail = tmp[0], tmp[1]
            son = frozenset(map(lambda x: x.strip(), son.replace('[','').replace(']', '').split(",")))  # Appropriate parsed blocks
            tail = frozenset(map(lambda x: x.strip(), tail.replace('[','').replace(']', '').split(",")))  # Appropriate parsed blocks
            print('son: ', son)
            print('tail: ', tail)
            print('son&tail->', (son, tail))
            branchValid = (son, tail) in orign  # Compare sets
            print('v', branchValid)


        """
        for cs in elem[None]:
            print('son', son)
            print('tail', tail)
            print((lambda x: x.strip(), son.replace('[','').replace(']', '').split(",")), map(lambda x: x.strip(), tail.replace('[','').replace(']', '').split(","))))  # Appropriate parsed blocks
            print(son)
            branchValid = son in orign  # Compare sets
            if not branchValid:
                csValid = False
        """    

        
