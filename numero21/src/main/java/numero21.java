import java.util.Scanner;
public class numero21 {
public static void main(String[] args) {
double numero ;
Scanner sc = new Scanner(System.in);
System.out.println("ingrese el numero");
numero = sc.nextDouble();
double parteDecimal = numero % 1; 
double parteEntera = numero - parteDecimal;
System.out.printf("Parte entera: %f. Parte decimal: %f\n", parteEntera, parteDecimal);
}
}    

