import java.util.Scanner;

public class numero13 {
    public static void main (String[] args)
    {
        double galon,res;
        Scanner dat = new Scanner (System.in);
        System.out.println("ingrese galones adquiridos");
        galon = dat.nextDouble();
        res= galon*3.785;
        System.out.println("los galones a litros es " + res);
        

        

    }
}
