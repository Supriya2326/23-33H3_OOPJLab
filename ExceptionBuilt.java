public class ExceptionBuilt
{
public static void main(String args[])
{
String str=null;
try
{
System.out.println("str.length()");
}
catch(NullPointerException e)
{
System.out.println("caught NullpointerException");
}
int a=10;
int b=0;
try{
int num=a/b;
}
catch(ArithmeticException e)
{
System.out.println("caught ArithmeticException");
}
}
}