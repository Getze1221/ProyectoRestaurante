/**
* Autor: Getzemani Alejandro Gonzalez Cruz
* Fecha de creación: 06/09/2022
* fecha de actualización:09/09/2022
* Descripcion: proceso para añadir cliente al archivo
* 
*/
package Restaurante;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Proceso {
    
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public Proceso(){}
    
    public Proceso(ArrayList<Object> a){
        this.a = a;
    }
    
    public void agregarRegistro(Cliente p){
        this.a.add(p);
    }

    public void modificarRegistro(int i, Cliente p){
        this.a.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.a.remove(i);
    }
    
    public Cliente obtenerRegistro(int i){
        return (Cliente)a.get(i);
    }
    
    public int cantidadRegistro(){
        return this.a.size();
    }
    
    public int buscaCodigo(int codigo){
        for(int i = 0; i < cantidadRegistro(); i++){
            if(codigo == obtenerRegistro(i).getId())return i;
        }
        return -1;
    }
    
}
