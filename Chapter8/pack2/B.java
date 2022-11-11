package pack2;
import pack1.*;
public class B 
{
    void show() 
     {
        A Obj = new A();
        Obj.numA = 10;       // legal
        Obj.display();       // legal
    }
}
