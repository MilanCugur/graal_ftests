import os
import sys
import json

f = open('./fastftest.json', 'r')

data = json.load(f)
print(data)
