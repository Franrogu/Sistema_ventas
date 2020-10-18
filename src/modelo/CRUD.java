
package modelo;

import java.util.List;

//************IMPLEMENTA METODOS EN UNA INTERFAZ PARA NO TENER QUE ESTARLOS IMPLEMENTANDO INDIVIDUALMENTE ***************************

public interface CRUD {
    public List listar();
    public int add(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(int id);
    
}
