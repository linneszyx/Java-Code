interface A
{
	void m1();
}
interface B
{
	void m2();
}
interface AB extends A,B
{

}
class D
{
}
class C extends D implements A,B
{
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	public void m3()
	{
			System.out.println("m3");
	}
}
class interface1
{
	public static void main(String[] ar)
	{
		A a=new C();
		B b=new C();
		C c=new C();
		a.m1();
		//a.m2();
		//a.m3();
		//b.m1();
		b.m2();
		//b.m3();
		c.m1();
		c.m2();
		c.m3();
	}

}