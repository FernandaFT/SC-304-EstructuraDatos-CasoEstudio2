/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio02;

/**
 *
 * @author fernandafajardo
 */
public class Categoria {
    
    private int idCategoria;
    private String nomCategoria;
    private ListaLibros listaLibros;

    public Categoria(int idCategoria, String nomCategoria) {
        this.idCategoria = idCategoria;
        this.nomCategoria = nomCategoria;
        this.listaLibros = new ListaLibros();
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public ListaLibros getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ListaLibros listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    @Override
    public String toString(){
        return "Categoria\n"+
                "ID Categoria: "+ idCategoria +
                "Nombre de la Categoria: "+ nomCategoria;
    }
}
