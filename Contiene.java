import java.util.Scanner;

public class Contiene {
    public static void main(String[] args) {
       Scanner entrada1 = new Scanner(System.in);
       System.out.println("Ingrese un numero");
       String numero = entrada1.nextLine();
       if(numero.contains("1") || numero.contains("3") || numero.contains("5")){
        System.out.print("Se cumple");
       }
       else{
        System.out.println("No se cumple");
       }
  }
}
