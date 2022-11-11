class Employee
{
	private String name;
	private int age;
	void setAge(int age)
	{
		if(age<20 || age>50)
			System.out.println("Error!!!");
		else
			this.age=age;
	}
	int getAge()
	{
		return age;
	}

}
class property1
{
	public static void main(String[] ar)
	{
		Employee e=new Employee();
		e.setAge(45);
		int x=e.getAge();
		System.out.println(x);
	}
}
