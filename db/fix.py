import json
import sys
import subprocess
import os
from termcolor import colored

name = sys.argv[1]
os.chdir(name)

tmp = open('tmp.json', 'w')
old = open(name+'.json', 'r')

fold = json.load(old)
if isinstance(fold,dict):
    fold = [fold]

fixed = True
for elem in fold:
    # source, control_splits
    data = elem['control splits']
    for cs in data:
        sons = cs['sons']
        if len(sons)!=2:
            fixed = False
        else:
            #print(len(sons), sons),
            fsons = [son+'--null' for son in sons]
            #print('->'),
            #print(fsons)
            cs['sons'] = fsons
    json.dump(elem, tmp, indent=4)
    
tmp.close()
old.close()
subprocess.Popen("cat tmp.json | python -m json.tool > {}.json".format(name), shell=True)

if fixed:
    print(colored('Success', 'green'))
else:
    subprocess.call(['javac', name+'.java'])
    print(colored('Do yourself', 'red'))
