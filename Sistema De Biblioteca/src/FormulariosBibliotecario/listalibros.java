/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormulariosBibliotecario;

/**
 *
 * @author Daniel_Márquez
 */
public class listalibros {

    public listalibros(String Nregistro, String Titulo, String Categoria, String Codigo, String Autor) {
        this.Nregistro = Nregistro;
        this.Titulo = Titulo;
        this.Categoria = Categoria;
        this.Codigo = Codigo;
        this.Autor = Autor;
    }

    public String getNregistro() {
        return Nregistro;
    }

    public void setNregistro(String Nregistro) {
        this.Nregistro = Nregistro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    private String Nregistro;
    private String Titulo;
    private String Categoria;
    private String Codigo;
    private String Autor;
   

    
    
    
    
    
}
