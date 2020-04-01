import os
import sys

f = open('./fastftest.json', 'w')
DB_PATH = "../db"
folders = filter(lambda x: os.path.isdir(os.path.join(DB_PATH, x)), os.listdir(DB_PATH))
folders = sorted(folders, key = lambda name: int(filter(lambda d: d.isdigit(), name+'0')))

for folder in folders:
    ffolder = os.path.join("/home/cugur/Desktop/graal_ftests/db", folder)
    jsonf = os.path.join(ffolder, folder+".json")
    with open(jsonf, 'r') as g:
        f.write(g.read())
        f.write(',\n')

f.close()
