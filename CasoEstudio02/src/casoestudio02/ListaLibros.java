/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio02;

/**
 *
 * @author fernandafajardo
 */
public class ListaLibros extends ListaSimple {
    
    public void agregar(Libro libro){
        NodoLibro nuevoL = new NodoLibro(libro);
        
        if(cabeza == null){
            cabeza = nuevoL;
        }else{
            NodoLibro actual = cabeza;
            while(actual.getSig() != null){
                actual = actual.getSig();
            }
            actual.setSig(nuevoL);
        }
    }
    
    public boolean eliminar(String idLibro){
        if(cabeza == null){
            return false;
        }
        
        if(cabeza.getLibro().getIdLibro().equals(idLibro)){
            cabeza = cabeza.getSig();
            return true;
        }
        
        NodoLibro actual = cabeza;
        while(actual.getSig() != null){
            if(actual.getSig().getLibro().getIdLibro().equals(idLibro)){
                actual.setSig(actual.getSig().getSig());
                return true;
            }
            actual = actual.getSig();
        }
        return false;
    }
    
    public String[] obtenerLibros(){
        int cont = contar();
        String[] libros = new String[cont];
        NodoLibro actual = cabeza;
        int i = 0;
        while(actual != null){
            libros[i++] = actual.getLibro().toString();
            actual = actual.getSig();
        }
        return libros;
    }
    
    public int contar(){
        int cont = 0;
        NodoLibro actual = cabeza;
        while(actual != null){
            cont = cont + 1;
            actual = actual.getSig();
        }
        return cont;
    }
    
    public String[] getLibroEditorial(String editorial) {
        
        int contador = 0;
        NodoLibro actual = cabeza;

        while (actual != null) {
            if (actual.getLibro().getEditorial().equalsIgnoreCase(editorial)) {
                contador++;
            }
            actual = actual.getSig();
        }

        if (contador == 0) {
            return new String[] { "No se encontraron libros de la editorial " + editorial };
        }

        String[] libros = new String[contador];
        actual = cabeza;
        int i = 0;

        while (actual != null) {
            if (actual.getLibro().getEditorial().equalsIgnoreCase(editorial)) {
                libros[i++] = actual.getLibro().getTitulo();
            }
            actual = actual.getSig();
        }

        return libros;
    }

    
    @Override
    public String toString(){
       String resultado = "Libros:\n";
       NodoLibro actual = cabeza;
       while(actual != null){
           resultado += "-" + actual.getLibro().toString() + "\n";
           actual = actual.getSig();
       }
       return resultado;
    }
    
}
