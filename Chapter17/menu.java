import java.awt.*;
public class menu
{
  public static void main(String[] args) 
  {
    Frame f = new Frame("Menu");
    f.setSize(300, 300);
    MenuBar mb=new MenuBar();
    Menu menu=new Menu("File");
    MenuItem m1=new MenuItem("New");
    MenuItem m2=new MenuItem("Open");
    menu.add(m1);
    menu.add(m2);
    mb.add(menu);
    f.setMenuBar(mb);
    f.setVisible(true);
  }
}
