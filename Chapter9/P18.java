abstract class Shapes
{
	int x,y;
	void print()
	{
		System.out.println(x);
		System.out.println(y);
	}
	abstract void area();

}
class Rect extends Shapes
{
	void area()
	{
		System.out.println("Area of Rectangle");
	}
}
class Circle extends Shapes
{
	void area()
	{
		System.out.println("Area of Circle");
	}
}
class Ellipse extends Shapes
{
	void area()
	{
		System.out.println("Area of Ellipse");
	}
}

class P18
{
	public static void main(String[] ar)
	{
			
			 Shapes s1=new Rect();
			 Shapes s2=new Circle();
			 Shapes s3=new Ellipse();

			s1.area();
                        s2.area();
                        s3.area();
			//Shapes s=new Shapes();
	}

}