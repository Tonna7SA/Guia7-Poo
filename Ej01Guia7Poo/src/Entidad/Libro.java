/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author User
 */
public class Libro {

    public int ISBN;
    public String Libro;
    public String Autor;
    public int NumeroPagina;

    public Libro() {
    }

    public Libro(int ISBN, String Libro, String Autor, int NumeroPagina) {
        this.ISBN = ISBN;
        this.Libro = Libro;
        this.Autor = Autor;
        this.NumeroPagina = NumeroPagina;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setLibro(String Libro) {
        this.Libro = Libro;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumeroPagina(int NumeroPagina) {
        this.NumeroPagina = NumeroPagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getLibro() {
        return Libro;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumeroPagina() {
        return NumeroPagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Libro=" + Libro + ", Autor=" + Autor + ", NumeroPagina=" + NumeroPagina + '}';
    }

}
