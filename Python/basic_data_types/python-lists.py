# https://www.hackerrank.com/challenges/python-lists/problem
def main():
    list = []
    N = int(input())
    for x in range(0, N):
        s = input().split()
        cmd = s[0]
        args = s[1:]
        if cmd != "print":
            cmd += "("+ ",".join(args) +")"
            eval("list."+cmd)
        else:
            print(list)

if __name__ == '__main__':
    main()
else:
    pass
