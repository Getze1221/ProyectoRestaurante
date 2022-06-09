/**
* Autor: Getzemani Alejandro Gonzalez Cruz
* Fecha de creación: 02/09/2022
* fecha de actualización:09/09/2022
* Descripcion:Pojo de la lista
* 
*/
package lista;


public class Productos {
    private String nombre;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Productos() {
    }

    public Productos(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
}
