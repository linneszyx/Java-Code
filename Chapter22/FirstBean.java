import java.awt.*;
import java.io.Serializable;
         
public class FirstBean implements Serializable
{
   String name=null;
   int age=0;
   public FirstBean()
   {
   
   }
public String getName()
{
return name;
}
public void setName(String s)
{
name=s;
}
public int age()
{
return age;
}
public void setAge(int a)
{
age=a;
}
}
