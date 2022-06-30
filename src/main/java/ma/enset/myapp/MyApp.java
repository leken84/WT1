package ma.enset.myapp;
import ma.enset.myapp.service.MyService;
public class MyApp{
   public static void main (String[] args){
    if(args.length !=2){
       System.out.println("you must provid 2 argument");
       System.exit(0);
    }
    MyService service =new MyService();
    double a= Double.parseDouble(args[0]);
    double b= Double.parseDouble(args[1]);
    double result=service.compute(a, b);
    System.out.println(String.format("sum of %s and %s is %s",a,b,result));

}
}