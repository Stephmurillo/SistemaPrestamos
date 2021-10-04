/* @authors 
    - Yoselin Rojas | Grupo 04 
    - Stephanny Murillo | Grupo 03
*/

package sistema;

public class Application {

    public static void main(String[] args) {
        sistema.presentation.cliente.Model modelClientes=new sistema.presentation.cliente.Model() ;
        sistema.presentation.cliente.ViewCliente viewClientes = new sistema.presentation.cliente.ViewCliente();
        sistema.presentation.cliente.Controller controllerClientes = new sistema.presentation.cliente.Controller(modelClientes,viewClientes);
        CLIENTES = controllerClientes;
        
        sistema.presentation.prestamos.Model modelPrestamos=new sistema.presentation.prestamos.Model() ;
        sistema.presentation.prestamos.ViewPrestamo viewPrestamo = new sistema.presentation.prestamos.ViewPrestamo();
        sistema.presentation.prestamos.Controller controllerPrestamos = new sistema.presentation.prestamos.Controller(modelPrestamos,viewPrestamo);
        PRESTAMOS = controllerPrestamos;       
        
        CLIENTES.show();
    }

    public static sistema.presentation.cliente.Controller CLIENTES;
    public static sistema.presentation.prestamos.Controller PRESTAMOS;
    }
