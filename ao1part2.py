import re

words = ['one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
dic = {'one': 1, 'two': 2, 'three': 3, 'four': 4, 'five': 5, 'six': 6, 'seven': 7, 'eight': 8, 'nine': 9}

total_sum = 0

with open("text.txt", "r") as file:
    for line in file:
        # line1 = cleanup(line)
        # line2 = line
        first = 0
        last = 0
        matches = re.findall(r'\d|' + '|'.join(words), line)
        
        if(matches[0] in words):
            first = dic[matches[0]]
        
        else:
            first = int(matches[0])
            
        if(matches[-1] in words):
            last = dic[matches[-1]]
        else:
            last = int((matches[-1]))
        total_sum += (first*10) + last
        print(first, last)
        print(matches)
        



print(total_sum)
