#include<stdio.h>
int main()
{
  int i,b,w,c,a;
  scanf("%d%d%d%d",&i,&b,&w,&c);
  int ct;
  a=2*w*(i+b+2*w);
  ct=c*a;
  printf("%d",ct);
}
