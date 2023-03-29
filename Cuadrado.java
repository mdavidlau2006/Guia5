import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = entrada1.nextInt();
        for(int i=1; i<=numero; i++){
            String linea = "";
            for(int j=1; j<=numero; j++){
                linea = linea + "*";
            }
            System.out.println(linea);
        }
    }
}
