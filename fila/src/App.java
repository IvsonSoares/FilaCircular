public class App {
    public static void main(String[] args) throws Exception {
        

        Fila fila = new Fila(5);

        fila.add(10);
        fila.add(10);
        fila.add(10);
        fila.add(10);
        fila.add(10);
        fila.add(5);




        fila.printFila();


        fila.remove();
        fila.remove();

        System.out.println("Segundo print");

        fila.printFila();


        System.out.println("Terceiro print");
        fila.add(5);

        fila.printFila();

        System.out.println("Quarto print");

        fila.remove();
        fila.printFila();

        System.out.println("Quinto print");
        fila.add(5);

        fila.printFila();

    }
}
