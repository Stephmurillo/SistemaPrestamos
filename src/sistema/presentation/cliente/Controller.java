package sistema.presentation.cliente;

import java.util.Arrays;
import sistema.Application;
import sistema.logic.Cliente;
import sistema.logic.Service;

public class Controller {
    Model model;
    ViewCliente view;

    public Controller(Model model, ViewCliente view) {
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
    
    public void hide(){
        this.view.setVisible(false);
    }
    
    public void exit(){
        Service.instance().store();
    }
    
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
   
    public Cliente clienteGet(String cedula){
        Cliente cliente = new Cliente();
        try {
            cliente = Service.instance().clienteGet(cedula);
            model.setCliente(cliente);
            model.commit();
            return cliente;
        } catch (Exception ex) {
            model.setCliente(new Cliente());
            model.commit();
        }
        return null;
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
    
    public void prestamosShow(){
        this.hide();
        Application.PRESTAMOS.show();
    }  
}
