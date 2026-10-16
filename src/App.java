public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry");

        Lector lector1 = new Lector("Ana Torres", "1001234567");
        Lector lector2 = new Lector("Carlos Ruíz", "1008976543");

        lector1.tomarPrestado(libro1);
        lector2.tomarPrestado(libro2);

        System.out.println();
        mostrarInfo(lector1);
        mostrarInfo(lector2);

        System.out.println();
        lector1.tomarPrestado(libro2);
        
        System.out.println();
        lector1.regresarLibro();
        lector1.tomarPrestado(libro2);

        System.out.println();
        mostrarInfo(lector1);
        mostrarInfo(lector2);
    }

    private static void mostrarInfo(Lector lector) {
        System.out.println(lector);
    }
}
