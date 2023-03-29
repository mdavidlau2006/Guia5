import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
       Scanner entrada1 = new Scanner(System.in);
       System.out.println("Ingrese el lado A");
       float lado_A = entrada1.nextFloat();
       System.out.println("Ingrese el lado B");
       float lado_B = entrada1.nextFloat();
       System.out.println("Ingrese el lado C");
       float lado_C = entrada1.nextFloat();

       float SP = (lado_A + lado_B + lado_C)/2;
       float area = SP*(SP - lado_A)*(SP - lado_B)*(SP - lado_C);
       double resultado = Math.sqrt(area);
       System.out.println(" El área del triángulo es " + Math.round(resultado));
    }
}
