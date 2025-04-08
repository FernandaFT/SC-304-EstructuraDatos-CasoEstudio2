/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio02;

/**
 *
 * @author fernandafajardo
 */
public class CasoEstudio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaCategorias listaC = new ListaCategorias();
        
        //Categorias
        Categoria categoria1  = new Categoria(1,"Acción");
        Categoria categoria2 = new Categoria(2, "Romance");
        Categoria categoria3 = new Categoria(3, "Novela");
        Categoria categoria4 = new Categoria(4, "Ciencia");
        Categoria categoria5 = new Categoria(5, "Misterio");
        
        //Agregando los libros a las categorías
        categoria1.getListaLibros().agregar(new Libro("1", "La Revolución", "paquito", "Akal"));
        categoria1.getListaLibros().agregar(new Libro("2", "La Odisea", "loli", "Comares"));
        categoria1.getListaLibros().agregar(new Libro("3", "Hacia un mundo nuevo", "desconocido", "Comares"));
        categoria2.getListaLibros().agregar(new Libro("4", "La esposa del viajero en el tiempo", "luis", "Comares"));
        categoria2.getListaLibros().agregar(new Libro("5", "Orgullo y prejuicio", "Jane Austen", "Akal"));
        categoria2.getListaLibros().agregar(new Libro("6", "Como agua para chocolate", "Manuel", "Comares"));
        categoria2.getListaLibros().agregar(new Libro("7", "Flores de la tormenta", "Ana L", "Comares"));
        categoria3.getListaLibros().agregar(new Libro("8", "Cien años de soledad", "Gabriel García Márquez", "Comares"));
        categoria3.getListaLibros().agregar(new Libro("9", "Matar a un ruiseñor", "Harper Lee", "Akal"));
        categoria4.getListaLibros().agregar(new Libro("10", "El origen de las especies", "Carlos M", "Comares"));
        categoria4.getListaLibros().agregar(new Libro("11", "Manos de luz", "Monica N", "Comares"));
        categoria4.getListaLibros().agregar(new Libro("12", "El futuro de la mente", "Pilar G", "Akal"));
        categoria4.getListaLibros().agregar(new Libro("13", "Pensando, rápido y lento", "Henry A", "Akal"));
        categoria4.getListaLibros().agregar(new Libro("14", "El gen egoísta", "Steve A", "Akal"));
        categoria5.getListaLibros().agregar(new Libro("15", "Perdida", "Aurora M", "Comares"));
        categoria5.getListaLibros().agregar(new Libro("16", "El paciente silencioso", "Juan V", "Akal"));
        categoria5.getListaLibros().agregar(new Libro("17", "La pareja de al lado", "Mauricio M", "Comares"));

        // Agregar categorías a la lista
        listaC.agregar(categoria1);
        listaC.agregar(categoria2);
        listaC.agregar(categoria3);
        listaC.agregar(categoria4);
        listaC.agregar(categoria5);

        // a. Invocar getLibrosEditorial
        String librosEditorial = listaC.getLibrosEditorial("Comares");
        System.out.println(librosEditorial);

        // b. Invocar devuelveLibrosCategoria
        String[] librosCategoria = listaC.devuelveLibrosCategoria(1); // Acción
        for (String libro : librosCategoria) {
            System.out.println(libro);
        }

        // c. Invocar imprimaCategorias
        listaC.imprimaCategorias();

        // d. Eliminar un libro de una categoría
        listaC.eliminaLibroCategoria(1, "1");

        // e. Invocar imprimaCategorias después de la eliminación
        listaC.imprimaCategorias();
  
    }
    
}
