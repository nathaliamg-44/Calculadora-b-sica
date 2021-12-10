import java.util.Scanner;

public class Calculadora {

    Scanner entrada = new Scanner(System.in);

    public void Smenu() {
        int seleccion = 0;
        int bandera = 0;
        do {

            System.out.println("Seleccione una operación");
            System.out.println("  1. Suma");
            System.out.println("  2. Resta");
            System.out.println("  3. Multiplicación");
            System.out.println("  4. División");
            System.out.println("  5. Apagar");
            seleccion = entrada.nextInt();
            // 21 junio
            switch (seleccion) {
                case 1: {
                    Operacion objeto1 = new Suma();
                    objeto1.Operaciones();
                    break;
                }
                case 2: {
                    Operacion objeto2 = new Resta();
                    objeto2.Operaciones();
                    break;
                }
                case 3: {
                    Operacion objeto3 = new Multiplicacion();
                    objeto3.Operaciones();
                    break;
                }
                case 4: {
                    Operacion objeto4 = new Division();
                    objeto4.Operaciones();
                    break;
                }

                case 5: {
                    System.out.println("-----------------------------");
                    System.out.println("NATH");
                    System.out.println("-----------------------------");
                    bandera = 1;

                    break;
                }
                default: {
                    System.out.println("---------------------------------------");
                    System.out.println("No hay una operación para esa selección");
                    System.out.println("---------------------------------------");
                }
            }

        } while (bandera == 0);

    }

}