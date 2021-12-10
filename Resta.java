public class Resta extends Operacion {
    protected double resta;

    @Override
    public void Operaciones() {
        Pedir();
        resta = num1 - num2;
        System.out.println("--------------------------------------------------");
        System.out.println("Su operación es = " + num1 + " - " + num2 + " = " + resta);
        System.out.println("--------------------------------------------------");
    }
}