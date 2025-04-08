/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio02;

/**
 *
 * @author fernandafajardo
 */
public class ListaSimple {
    
    protected NodoLibro cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    public NodoLibro getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoLibro cabeza) {
        this.cabeza = cabeza;
    }
}
