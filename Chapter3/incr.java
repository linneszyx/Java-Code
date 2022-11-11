class incr
{
public static void main(String[] args)
{
          int result = +10; 
          System.out.println(result); //10

          result--;  
          System.out.println(result);// 9

          result++; 
          System.out.println(result);// 10

          --result;  
          System.out.println(result);// 9

          ++result; 
          System.out.println(result);//10
          result = -result; 
          System.out.println(result);//-10
          boolean success = false;
          System.out.println(success); // false
          System.out.println(!success); // true
     }
}
