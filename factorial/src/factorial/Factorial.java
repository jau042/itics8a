package factorial;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
        long factorial=1;
        int num;
        Scanner numero = new Scanner(System.in);
        num = numero.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }   
}