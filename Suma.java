public class Suma extends Operacion {
    protected double suma;

    @Override
    public void Operaciones() {

        Pedir();
        suma = num1 + num2;
        System.out.println("--------------------------------------------------");
        System.out.println("Su operación es = " + num1 + " + " + num2 + " = " + suma);
        System.out.println("--------------------------------------------------");
    }
}
