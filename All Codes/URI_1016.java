import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI_1016 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int d = input.nextInt();
            System.out.printf("%d minutos\n", d*2);
        }
    }
}