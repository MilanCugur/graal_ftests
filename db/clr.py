import subprocess
import os

for (root, dirs, files) in os.walk('.'):
    print(root)
    os.chdir(root)
    subprocess.call(['rm -f tmp*'], shell=True)
