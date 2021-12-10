public class Division extends Operacion {
    protected double division;

    @Override
    public void Operaciones() {
        Pedir();
        division = num1 / num2;
        System.out.println("--------------------------------------------------");
        System.out.println("Su operación es = " + num1 + " / " + num2 + " = " + division);
        System.out.println("--------------------------------------------------");
    }

}
