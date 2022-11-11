#include<iostream.h>
#include<stdio.h>
#include<conio.h>
class area 
{
  double dim1, dim2; 
public:
  void setarea(double d1, double d2)
  {
    dim1 = d1;
    dim2 = d2;
  }
  void getdim(double &d1, double &d2)
  {
    d1 = dim1;
    d2 = dim2;
  }
  virtual double getarea() = 0; // pure virtual function
};

class rectangle : public area 
{
public:
  double getarea() 
  {
    double d1, d2;
  
    getdim(d1, d2);
    return d1 * d2;
  }
};

class triangle : public area 
{
public:
  double getarea()
  {
    double d1, d2;
  
    getdim(d1, d2);
    return 0.5 * d1 * d2;
  }
};

void main()
{
  clrscr();
  area *p;
  rectangle r;
  triangle t;

  r.setarea(12.0, 12.8);
  t.setarea(14.0, 15.0);

  p = &r;
  cout << "Area of Rectangle: " << p->getarea() << '\n';

  p = &t;
  cout << "Area of Triangle: " << p->getarea() << '\n';

  getch();
}
