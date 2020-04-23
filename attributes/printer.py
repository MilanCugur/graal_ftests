import sys
import csv

assert len(sys.argv)==2, "usage: printer PATH_TO_ATTR"

path = sys.argv[1]

with open(path, 'r') as f:
    lines = f.readlines()

    features = lines[0]

    for cs in lines[1:]:
        data = cs.split(',')
        ControlSplit = data[2]
        head = data[3]
        depth = data[4]
        fblocks = data[5]
        ffixnodes = data[6]
        fflonodes = data[7]
        branches = data[8:]
        print("\n=============================================================================================================================================")
        print("CONTROL SPLIT: \n"+ControlSplit+" [Head: "+head+"] \n[CS Depth: "+depth+"] [N. CS Father Blocks: "+fblocks+"] [N. CS Father Fixed Nodes: "+ffixnodes+"] [N. CS Father Floating Nodes: "+fflonodes+"]: \n" )
        
        reader = csv.reader(branches, delimiter=',')
        ftrs = []
        brns = []
        dts = []
        
        for row in reader:
            #print(row[0])
            subdata = row[0].split(";")
            brns.append(subdata[0])
            for elem in subdata[1:]:
                src = elem.split(":")
                if src[0] not in ftrs:
                    ftrs.append(src[0])
                dts.append(src[1].strip())

        for brn in brns:
            print("\t"+brn)

        print("{:31}".format("")),
        for brn in brns:
            b1 = brn.split("][")[0]
            b2 = brn.split("][")[1]
            #print(b1, b2)
            print("{:17}".format(b1[:5]+"..]"+"["+b2[:4]+"..]")),
        print("\n---------------------------------------------------------------------------------------------------------------------------------------------")
        for i, ftr in enumerate(ftrs):
            print("{:3} {:30} ".format(i+1, ftr)),
            for j in range(len(brns)):
                print("{:<17} ".format(dts[len(ftrs)*j+i])),
            print("")
            
        raw_input()
