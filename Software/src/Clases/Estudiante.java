/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Liz
 */
public class Estudiante {

    private int Id;
    private String cedula;
    private String Nombre;
    private String Apellido;
    private String FNac;
    private String Genero;
    private String Ciudad;
    private String Emal;
    private String categoria;
    private String Curso;

    public Estudiante(int Id, String cedula, String Nombre, String Apellido, String FNac, String Genero, String Ciudad, String Emal, String categoria, String Curso) {
        this.Id = Id;
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FNac = FNac;
        this.Genero = Genero;
        this.Ciudad = Ciudad;
        this.Emal = Emal;
        this.categoria = categoria;
        this.Curso = Curso;

    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFNac() {
        return FNac;
    }

    public void setFNac(String FNac) {
        this.FNac = FNac;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEmal() {
        return Emal;
    }

    public void setEmal(String Emal) {
        this.Emal = Emal;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

}
