# https://www.hackerrank.com/challenges/alphabet-rangoli/problem

import string


def print_rangoli(size):
    # your code goes here
    width = 4 * size - 3
    alpha = string.ascii_lowercase
    line = []
    for i in range(size):
        s = '-'.join(alpha[i:size])
        line.append((s[::-1]+s[1:]).center(width, '-'))
    backwards = reversed(line[1:])

    if size == 1:
        print(line[0])
    else:
        print("\n".join(backwards), "\n".join(line), sep="\n")


if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
