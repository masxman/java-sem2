class outerclass{
 static int i=100;
 static class innerclass{
    static void demo()
{
  System.out.println("value of i in static method"+i);
}
void display()
{
  System.out.println("value of i in normal method"+i);
}
}

 public static void main(String[] args)
{
   outerclass.innerclass.demo();
   outerclass.innerclass ob=new outerclass.innerclass();
  ob.display();
}
}  
