class A
{
	public static void main(String[] ar)
	{
		B1 b1=new B1();
		b1.f1();
                  b1.f2();
	}
}
class B1
{
	void f1()
	{
		System.out.println("F1");
	}
	static void f2()
	{
		System.out.println("F2");
	}
}
