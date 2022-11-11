class break1
{
	public static void main(String []vaibhav)
	{
		start:for(int i=1;i<=3;i++)
		{
			System.out.println("i= "+i);
                         
		          for(int j=1;j<=5;j++)
			{
				System.out.println("j= "+j);
                                 continue start;
                               
			}
		}
	}
}
