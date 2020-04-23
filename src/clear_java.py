import os
import sys

if len(sys.argv)!=2:
    print("Call ./rm PATH")
    sys.exit(1)
    
for file in os.listdir(sys.argv[1]):
    if not os.path.isdir(file):
        continue
    path = os.path.join(".", file)

    for name in os.listdir(path):
        if not name.endswith(".java"):
            os.remove(os.path.join(path, name))
    print(path+" cleared.")
