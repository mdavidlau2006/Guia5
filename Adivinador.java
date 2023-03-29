import java.util.Random;
import java.util.Scanner;
public class Adivinador {
    public static void main (String[]Args){
       Scanner entradaEscaner = new Scanner(System.in);
       int numeroRandom = 0;
       int entrada = 0;
       Random rd = new Random();
       numeroRandom = rd.nextInt(100)+1;
       System.out.print("Se ha generado un numero aleatorio entre 1 y 100. Adivinalo: ");
        while (numeroRandom != (entrada = entradaEscaner.nextInt())){
            if (entrada < numeroRandom)
                System.out.print("No has acertado, el número es mayor. Prueba otra vez: ");
            else
                System.out.print("No has acertado, el número es menor. Prueba otra vez: ");
        }
        System.out.println("LO HAS ADIVINADO, WIIIIIII");
    }   
}
