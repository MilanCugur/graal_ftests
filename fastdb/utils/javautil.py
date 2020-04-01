import os
import sys
import subprocess

t = open('./fastftest.java', 'w')
t.write('class fastftest {\n')
t.write('    public static void main(String[] args) { \n')

DB_PATH = "../db"
folders = filter(lambda x: os.path.isdir(os.path.join(DB_PATH, x)), os.listdir(DB_PATH))
folders = sorted(folders, key = lambda name: int(filter(lambda d: d.isdigit(), name+'0')))
calls = []
srcs = []
for folder in folders:
    ffolder = os.path.join("/home/cugur/Desktop/graal_ftests/db", folder)
    javaf = os.path.join(ffolder, folder+".java")
    with open(javaf, 'r') as f:
        lines = f.readlines()
        ind = 0
        for i, l in enumerate(lines):
            if l.find("example_")>=0:
                if ind==0:
                    calls += [l]
                    ind = 1
                else:
                    ind = 1
                    src = "".join(filter(lambda x: x.strip()!="", lines[i:-1]))
                    srcs += [src]
                                
t.write(''.join(calls))
t.write('}\n')
t.write('\n'.join(srcs))
t.write('}\n')
t.close()

