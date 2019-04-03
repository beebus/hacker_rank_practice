# https://www.hackerrank.com/challenges/find-a-string/problem

def count_substring(string, sub_string):
    counter = 0   # initialize counter
    index = 0
    while index < len(string):
        if string.find(sub_string,index)>=0:
            index=string.find(sub_string,index)+1
            counter+=1
        else: break
    return counter


if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
