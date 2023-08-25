a=int(input())
b,c=map(int,input().split( ))
d=b+c
for i in range (a):
    if(d<=6):
        print("YES")
    else:
        print("NO")
