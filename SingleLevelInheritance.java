class Vehical{
String Brand="Toyota";
Void honk(){
System.out.println("BEEP!BEEP!");
}
}
class car extends Vehical{
String Model="Corolla";
void displayInfo() 
{
System.out.println("Brand:"+ Brand);
System.out.println("Model:"+ Model);
}
}
public class SingleLevelInheritance {
public static void main(String[] args)
{
car Mycar=new car();
Mycar.displayInfo();
Mycar.honk();
}
}