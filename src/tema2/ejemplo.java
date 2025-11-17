package tema2;
import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int c = sc.nextInt();

        System.out.println("\nOrden de mayor a menor:");

        if (a >= b && a >= c) {
            if (b >= c)
                System.out.println(a + " " + b + " " + c);
            else
                System.out.println(a + " " + c + " " + b);
        } else if (b >= a && b >= c) {
            if (a >= c)
                System.out.println(b + " " + a + " " + c);
            else
                System.out.println(b + " " + c + " " + a);
        } else {
            if (a >= b)
                System.out.println(c + " " + a + " " + b);
            else
                System.out.println(c + " " + b + " " + a);
        }

        sc.close();
    }
}
