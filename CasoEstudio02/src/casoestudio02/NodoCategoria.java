/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio02;

/**
 *
 * @author fernandafajardo
 */
public class NodoCategoria {
    
    private Categoria categoria;
    private NodoCategoria sig;
    private NodoCategoria anterior;

    public NodoCategoria(Categoria categoria) {
        this.categoria = categoria;
        this.sig = null;
        this.anterior = null;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public NodoCategoria getSig() {
        return sig;
    }

    public void setSig(NodoCategoria sig) {
        this.sig = sig;
    }

    public NodoCategoria getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCategoria anterior) {
        this.anterior = anterior;
    }
    
    @Override
    public String toString(){
        return "Categoría: "+ categoria.getNomCategoria();
    }
}
