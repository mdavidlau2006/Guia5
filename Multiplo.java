import java.util.Scanner;
public class Multiplo { 
    public static void main(String[] args) {
       Scanner entrada1 = new Scanner(System.in);
       System.out.println("Ingrese un numero");
       int numero1 = entrada1.nextInt();
       int numero2 = 2;
       int MCM = (numero1 * numero2)/numero2;
       System.out.println(" El minimo comun multiplo de "+ numero1 + " y " + numero2 + " es " + MCM );
    }
}
