/**
* Autor: Getzemani Alejandro Gonzalez Cruz
* Fecha de creación: 02/09/2022
* fecha de actualización:09/09/2022
* Descripcion: Variables para el precio
* 
*/
package Restaurante;


final public class TotalesPagar{
  
     static private int precioTotal;
     
    
   public TotalesPagar (int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public TotalesPagar() {
    
    }

    public static int getPrecioTotal() {
        return precioTotal;
    }

    public static void setPrecioTotal(int precioTotal) {
        TotalesPagar.precioTotal = precioTotal;
    }

}
