/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio02;

/**
 *
 * @author fernandafajardo
 */
public class NodoLibro {
    
    private Libro libro;
    private NodoLibro sig;

    public NodoLibro(Libro libro) {
        this.libro = libro;
        this.sig = null;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public NodoLibro getSig() {
        return sig;
    }

    public void setSig(NodoLibro sig) {
        this.sig = sig;
    }
}
