/**
* Autor: Getzemani Alejandro Gonzalez Cruz
* Fecha de creación: 02/09/2022
* fecha de actualización:09/09/2022
* Descripcion:Controller de la lista
* 
*/
package lista;

import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ProductoController {
    // instanciar al alumnomodel
    ProductosModel model = new ProductosModel();
    
    
    public void crearAlumno(List<Productos> lista, Productos alumno){
                model.crearAlumno(lista, alumno);
    }
    public void eliminarAlumno(List<Productos> lista, String matricula){
        model.eliminarAlumno(lista, matricula);
        
    }
    public void actualizarAlumno(List<Productos> lista, Productos alumno){   
        model.actualizarAlumno(lista, alumno);
        
    }
    
    
    public void mostrarAlumnos(List<Productos> lista, DefaultTableModel modelo){
        model.mostrarAlumnos(lista, modelo);

    }
    
}
