public class DefaultValues{
     //Instance variables with default values
     byte defaultByte;
     short defaultShort;
     int defaultInt;
     long defaultLong;
     float defaultFloat;
     double defaultDouble;
     char defaultChar;
     Boolean defaultBoolean;
  
     public static void main(String[] args){
           DefaultValues obj = new DefaultValues();
           System.out.println("Default values of primitive data types:");
           System.out.println("byte:"+obj.defaultByte);
           System.out.println("short:"+obj.defaultShort);
           System.out.println("byte:"+obj.defaultByte);
           System.out.println("int:"+obj.defaultInt);
           System.out.println("long:"+obj.defaultLong);
           System.out.println("float:"+obj.defaultFloat);
           System.out.println("double:"+obj.defaultDouble);
           System.out.println("char:["+obj.defaultChar +"]");
           System.out.println("boolean:"+obj.defaultBoolean);
      }
   }

OUT PUT:

Default values of primitive data types:
byte:0
short:0
byte:0
int:0
long:0
float:0.0
double:0.0
char:[]
boolean:null
