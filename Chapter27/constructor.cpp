#include<iostream.h>
#include<stdio.h>
#include<conio.h>
const int MAX=4;
int i=0;
class constructor
{
public:
constructor()
{
if(i<MAX) 
{
i++;
}
else
{
cout<<"No construct";
}
}
~constructor()
{
i--;
}
};
void fun()
{
constructor x;
}
void main()
{
int j;
clrscr();
for(j=0; j<(MAX*2); j++) 
{
fun();
cout << "Current counter is: " << i<<"\n";
}
getch();
}
