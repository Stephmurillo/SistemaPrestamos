package sistema.presentation.cliente;

import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.logic.Cliente;
import sistema.logic.Service;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        model.setProvincias(Service.instance().provinciaAll());
        model.setCantones(Service.instance().cantonAll());
        model.setDistritos(Service.instance().distritoAll());
        model.setCliente(new Cliente());
        view.setModel(model);
        view.setController(this);
    }
    
    public void show(){
        this.view.setVisible(true);
    }
    
    // Controller methods that respond to View events
    // probably invoke methods from Service,
    // and set data to Model, which in turn causes the View to update 
   public void consultar(String cedula){
      Cliente cliente;
        try {
            cliente = Service.instance().clienteGet(cedula);
            model.setCliente(cliente);
            model.commit();
        } catch (Exception ex) {
            model.setCliente(new Cliente());
            model.commit();
        }
   }
   
    public void clienteGet(String cedula){
        try {
            Cliente cliente = Service.instance().clienteGet(cedula);
            model.setCliente(cliente);
            model.commit();
        } catch (Exception ex) {
            model.setCliente(new Cliente());
            model.commit();
        }
    }
    
    public void clienteAdd(Cliente cliente){
        try {
            Service.instance().clienteAdd(cliente);
            model.setCliente(new Cliente("","",null, null, null));
            model.setClientes(Arrays.asList(cliente));
            model.commit();
        } catch (Exception ex) {
            
        }
        
    }
}
