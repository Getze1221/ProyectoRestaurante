
/**
* Autor: Getzemani Alejandro Gonzalez Cruz
* Fecha de creación: 02/09/2022
* fecha de actualización:09/09/2022
* Descripcion: Variables de cliente
* 
*/
package Restaurante;

public class Cliente {

   private int id;
    private String nombre;


    public Cliente(){}
    
    public Cliente(int id, String nombre){
        this.id = id;
        this.nombre = nombre;

    }
    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

}
