/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio02;

/**
 *
 * @author fernandafajardo
 */
public class ListaCategorias extends ListaDobleCircular{
    
    public void agregar(Categoria categoria){
        
        NodoCategoria nuevaC = new NodoCategoria(categoria);
        
        if(cabeza == null){
            cabeza = nuevaC;
            cabeza.setSig(cabeza);
            cabeza.setAnterior(cabeza);
        }else{
            NodoCategoria ultimo = cabeza.getAnterior();
            ultimo.setSig(nuevaC);
            nuevaC.setAnterior(ultimo);
            nuevaC.setSig(cabeza);
            cabeza.setAnterior(nuevaC);
        }
    }
    
    public String[] devuelveLibrosCategoria(int idCategoria){
        
        NodoCategoria actualC = cabeza;
        
        do{
            if(actualC.getCategoria().getIdCategoria() == idCategoria){
                return actualC.getCategoria().getListaLibros().obtenerLibros();
            }
            actualC = actualC.getSig();
        }while(actualC != cabeza);
        return new String[] {"Categoría no encontrada."};
    }
    
    public void imprimaCategorias(){
        NodoCategoria actualC = cabeza;
        
        do{
            System.out.println("Categoría " + actualC.getCategoria().getNomCategoria() + " tiene " +
                    actualC.getCategoria().getListaLibros().contar() + " libros.");
            actualC = actualC.getSig();
        }while(actualC != cabeza);
    }
    
    public void eliminaLibroCategoria(int idCategoria, String idLibro){
        
        NodoCategoria actualC = cabeza;
        
        do{
            if(actualC.getCategoria().getIdCategoria() == idCategoria){
                boolean eliminado = actualC.getCategoria().getListaLibros().eliminar(idLibro);
                
                if(eliminado){
                    System.out.println("Libro con ID " + idLibro + " eliminado de la categoría.");
                }else{
                    System.out.println("No se encontró el libro con ID " + idLibro + " en la categoría.");
                }
                return;
            }
            actualC = actualC.getSig();
        }while(actualC != cabeza);
        System.out.println("Categoría no encontrada.");
    }
    
    public String getLibrosEditorial(String editorial) {
        String resultado = "";
        NodoCategoria actual = cabeza;

        if (cabeza == null) {
            return "No hay categorías.";
        }

        do {
            String[] libros = actual.getCategoria().getListaLibros().getLibroEditorial(editorial);
            for (String libro : libros) {
                if (!libro.startsWith("No se encontraron")) {
                    resultado += "[" + actual.getCategoria().getNomCategoria() + "] " + libro + "\n";
                }
            }
            actual = actual.getSig();
        } while (actual != cabeza);

        if (resultado.equals("")) {
            return "No se encontraron libros de la editorial " + editorial;
        }

        return resultado;
    }

    @Override
    public String toString(){
        String resultado = "Categorías:\n";
        NodoCategoria actual = cabeza;
        do{
            resultado += actual.toString() + "\n";
            actual = actual.getSig();
        }while(actual != cabeza);
        return resultado;
    }
}
