/**
* Autor: Getzemani Alejandro Gonzalez Cruz
* Fecha de creación: 02/09/2022
* fecha de actualización:09/09/2022
* Descripcion:Model de la lista
* 
*/

package lista;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ProductosModel {

    // 5 operaciones del crud
    public void crearAlumno(List<Productos> lista, Productos producto) {
        lista.add(producto);

    }

    public void eliminarAlumno(List<Productos> lista, String tipo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTipo().compareTo(tipo) == 0) {
                lista.remove(i);//eliminar el registro de la lista
                //mostrarDatosTabla();// regresar la tabla de alumnos
                break;
            }
        }
    }

    public void actualizarAlumno(List<Productos> lista, Productos producto) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTipo().compareTo(producto.getTipo()) == 0) {
                lista.set(i, producto);//eliminar el registro de la lista
                // mostrarDatosTabla();// regresar la tabla de alumnos
                break;
            }
        }

    }

    public void mostrarAlumnos(List<Productos> lista, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[2];//la dimencion corresponde a las columnas

            fila[0] = lista.get(i).getNombre();
            fila[1] = lista.get(i).getTipo();

            modelo.addRow(fila);

        }
    }
}
