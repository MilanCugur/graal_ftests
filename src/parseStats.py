import csv
import sys
from matplotlib import pyplot as plt

"""
Parse "importantFeatures.csv" database and provide statistic information about distributions of different Control Splits bloks.

Usage: python3 parseStats.py PATH_TO_CSV_DATA
"""

assert len(sys.argv)==2, "Script call: ./parseStats.py PATH_TO_CSV_DATA (ParseImportantFeaturesPhase result)"

# PARSE DATA
stats = {}
with open(sys.argv[1], 'r') as f:
    data = csv.reader(f, delimiter = ',')
    for i, row in enumerate(data):
        if i==0:
            name = row[3]
        else:
            card = int(row[3])
            if card not in stats:
                stats[card] = 1
            else:
                stats[card] += 1

n = sum(stats.values())
                
sorted_stats = list(sorted(stats.items(), key = lambda item: -item[1]))
sorted_stats = [(elem[0], 100*elem[1]/n) for elem in sorted_stats]

# GENEARTE REPORT
print('Control Splits Distribution: \n')
print('=======================================')
print('Cardinality   Percentage   Absolute Num')
print('---------------------------------------')
for elem in sorted_stats:
    print('{:11} {:11f}% {:14}'.format(elem[0], elem[1], stats[elem[0]]))
print('=======================================')

plt.bar(list(map(lambda item: item[0], sorted_stats)), list(map(lambda item: item[1], sorted_stats)), 1, color='g')
plt.title('Distribution Histogram')
plt.show()

plt.pie(list(map(lambda item: item[1], sorted_stats)), labels=list(map(lambda item: item[0], sorted_stats)),  autopct='%1.1f%%') # remove-additional fine tuning for large results
plt.show()
