public class Multiplicacion extends Operacion {
    protected double multiplicacion;

    @Override
    public void Operaciones() {
        Pedir();
        multiplicacion = num1 * num2;
        System.out.println("--------------------------------------------------");
        System.out.println("Su operación es = " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("--------------------------------------------------");
    }
}
