/* @authors 
    - Yoselin Rojas | Grupo 04 
    - Stephanny Murillo | Grupo 03
*/

// ARREGLAR:
// - Arreglar el botón de listar en prestamos view.
// - Cargar la lista de prestamos del cliente en el jTable de prestamos.

// - Setear valores en el pago.
// - Manejar excepciones en la view de pago, no permitir ingresar strings.

package sistema;

public class Application {

    public static void main(String[] args) {
        sistema.presentation.cliente.Model modelClientes=new sistema.presentation.cliente.Model() ;
        sistema.presentation.cliente.ViewCliente viewClientes = new sistema.presentation.cliente.ViewCliente();
        sistema.presentation.cliente.Controller controllerClientes = new sistema.presentation.cliente.Controller(modelClientes,viewClientes);
        CLIENTES = controllerClientes;
        
        sistema.presentation.prestamos.ModelPrestamo modelPrestamos =new sistema.presentation.prestamos.ModelPrestamo() ;
        sistema.presentation.prestamos.ViewPrestamo viewPrestamo = new sistema.presentation.prestamos.ViewPrestamo();
        sistema.presentation.prestamos.ControllerPrestamo controllerPrestamos = new sistema.presentation.prestamos.ControllerPrestamo(modelPrestamos,viewPrestamo);
        PRESTAMOS = controllerPrestamos;       
        
        sistema.presentation.pagos.ModelPagos modelMensualidades = new sistema.presentation.pagos.ModelPagos() ;
        sistema.presentation.pagos.ViewPagos viewMensualidad = new sistema.presentation.pagos.ViewPagos();
        sistema.presentation.pagos.ControllerPagos controllerMensualidades = new sistema.presentation.pagos.ControllerPagos(modelMensualidades, viewMensualidad);
        MENSUALIDADES = controllerMensualidades;    
        
        CLIENTES.show();
    }

    public static sistema.presentation.cliente.Controller CLIENTES;
    public static sistema.presentation.prestamos.ControllerPrestamo PRESTAMOS;
    public static sistema.presentation.pagos.ControllerPagos MENSUALIDADES;
    
    }
