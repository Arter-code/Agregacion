public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Harry potter", "J. K. Rowling");
        Libro libro2 = new Libro("Don quijote de la mancha","Miguel de Cervantes Saavedra");
        Libro libro3 = new Libro("El principito","Antoine de Saint");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Luis Angel Arango");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println();
        biblioteca.mostrarCatalogo();

        biblioteca.buscarPorAutor("J. K. Rowling");
        System.out.println();
        biblioteca.buscarPorAutor("Miguel de Cervantes Saavedra");
        
    }
}
