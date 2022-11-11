#include<iostream.h>
#include<stdio.h>
#include<conio.h>
class swapping 
{
public:
int x1;
int y1;
};
void swap(swapping &a, swapping &b) 
{
swapping temp;
temp = a;
a = b;
b = temp;
}

void main()
{
clrscr();
swapping s1, s2;
s1.x1 = 5;
s1.y1 = 10;
s2.x1 = 12;
s2.y1 = 15;
cout << "Original values of s1 and s2 are as follows:";
cout << "\ns1: " << s1.x1 << ", " << s1.y1 << "\n";
cout << "s2: " << s2.x1 << ", " << s2.y1 << "\n";
cout << "\n";
swap(s1, s2);
cout << "Swapped values of s1 and s2 are as follows:\n";
cout << "s1: " << s1.x1 << ", " << s1.y1 << "\n";
cout << "s2: " << s2.x1 << ", " << s2.y1 << "\n";
getch();
}
