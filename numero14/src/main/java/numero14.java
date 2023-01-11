import java.util.Scanner;

public class numero14 {
    public static void main(String[]args)
    {
        double libras,kg,gramos,res1,res2;
         Scanner sc = new Scanner(System.in);
         System.out.println("ingrese el numero de pulgadas");
         libras= sc.nextDouble();
         res1= libras*0.453592;
         res2 = libras*453.592;
         System.out.println("los kilogramos son "+ res1+"los gramos son"+res2);
         
         
         
         
    }
}
