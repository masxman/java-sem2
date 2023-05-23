class staticdemo{
 static int a=20;
  static int b;
  static int min;
static{
 System.out.println("first static block");
   b=a+3;
}
static{
 System.out.println("second static block");
  min=999;
}
{
System.out.println("non static block");
}
static void display()
{
  System.out.println(a);
  System.out.println(b);
 System.out.println(min);
}
public static void main(String[] args)
{
  display();
}
}

