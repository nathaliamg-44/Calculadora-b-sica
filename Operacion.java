import java.util.Scanner;

public abstract class Operacion {
    Scanner entrada = new Scanner(System.in);
    protected double num1, num2;

    public void Pedir() {
        System.out.println("Ingrese el primer numero");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2 = entrada.nextDouble();
    }

    public abstract void Operaciones();
}
