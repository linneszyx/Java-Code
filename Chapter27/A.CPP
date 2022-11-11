#include<iostream.h>
#include<conio.h>
class cordinate
{
public:
int x1;
int y1;
};
void reverseSign(cordinate *c)
{
c->x1 = -c->x1;
c->y1 = -c->y1;
}
void main()
{
cordinate c;
clrscr();
c.x1 = 5;
c.y1 = 10;
cout << "Original values of c is as follows:";
cout << c.x1 << ", " << c.y1 << "\n";
reverseSign(&c);
cout << "Sign reversed values of c is as follows: ";
cout << c.x1 << ", " << c.y1 << "\n";
getch();
}
