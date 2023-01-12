import java.util.Scanner;
public class numero19 {
    public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);
    double total,cant, res;
    System.out.println("");
    System.out.println("ingrese la cantidad a pagar");
    total = sc.nextDouble();
    System.out.println("ingrese cantidad en efectivo para pagar");
    cant = sc.nextDouble();
    res=cant-total;
    System.out.println("la cantidad restante es de:" + res);
    }
    
}
