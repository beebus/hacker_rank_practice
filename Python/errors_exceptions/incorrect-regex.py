# https://www.hackerrank.com/challenges/incorrect-regex/problem

import re

if __name__ == '__main__':
    for tc in range(int(input())):
        ans = True
        try:
            reg = re.compile(input())
        except re.error:
            ans = False
        print(ans)
