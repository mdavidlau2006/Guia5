import java.util.Scanner;

public class Lados {
    public static void main(String[] args) {
    
    Scanner entrada1 = new Scanner(System.in);
    System.out.println("Ingrese el lado A");
    float lado_A = entrada1.nextFloat();
    System.out.println("Ingrese el lado B");
    float lado_B = entrada1.nextFloat();
    System.out.println("Ingrese el lado C");
    float lado_C = entrada1.nextFloat();

        if(lado_A + lado_B > lado_C && lado_A + lado_C > lado_B && lado_B + lado_C > lado_A){
            System.out.println("Es un triangulo\n");
            if(lado_A == lado_B && lado_B == lado_C){
                System.out.print(" El triangulo es equilatero");
            }
            else if(lado_A == lado_B || lado_A == lado_C || lado_B == lado_C) {
                System.out.print("El triangulo es isosceles");
            }
            else{
                System.out.print("El triangulo es Escaleno");
            }
        }
        else{
            System.out.println("No es un triangulo");
        }
    }
}
