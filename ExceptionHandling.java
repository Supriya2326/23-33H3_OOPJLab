public class ExceptionHandling
{
public static void main(String args[])
{
try{
int num=10/0;
System.out.println("num:"+num);
}
catch(ArithmeticException e)
{
System.out.println("Error:Division by zero is not allowed");
}
finally
{
System.out.println("this is the finally block, executed whether exception occurs or not");
}
System.out.println("program continuous after exception handeling");
}
}