/*infix  a+b
postfix  ab+
prefix   +ab
*/
#include<stdio.h>
#include<string.h>
int pred(char ch)
{
	switch(ch)
	{
		case '^':
			return 3;
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		default:
			return 0;
			
			
	}
}
char * infix_postfix(char *infix)
{
	int i,n,top=-1,j=0;//a+b-c
	n=strlen(infix);
	char st[n],op;
	static char postfix[100];
	for(i=0;i<n;i++)
	{
		if(pred(infix[i]))
		{ 
		     //operator
		     if(top==-1)
		     {
		     	st[++top]=infix[i];
			 }
			 else if(pred(infix[i])>pred(st[top]))
			 {
			 	st[++top]=infix[i];
			 }
			 else
			 {
			 	while(top!=-1 && pred(infix[i])<=pred(st[top]))
			 	{
			 	   op=st[top--];
				   postfix[j++]=op;	
				}
				st[++top]=infix[i];
			 }
		}
		else
		{
			//..operend
			postfix[j++]=infix[i];
		}
	}
	for(i=top;i>=0;i--)
	{
		postfix[j++]=st[i];  
	}
	//printf("%s ",postfix);
	return postfix;
}
int main()
{
	char infix[100],*postfix;
	scanf("%[^\n]s",&infix);
	postfix=infix_postfix(infix);//fun call
	printf("%s",postfix);
	return 0;
}
