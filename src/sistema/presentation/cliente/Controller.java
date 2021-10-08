package sistema.presentation.cliente;

import java.util.Arrays;
import sistema.Application;
import sistema.logic.Canton;
import sistema.logic.Cliente;
import sistema.logic.Distrito;
import sistema.logic.Provincia;
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
        Provincia p = model.getProvincias().get(0);
        Canton c = p.getCantones().get(0);
        Distrito d = c.getDistritos().get(0);
        model.setCliente(new Cliente("", "", p, c, d));
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
            if (this.clienteGet(cliente.getCedula()) != null) {
                Cliente clien = this.clienteGet(cliente.getCedula());
                model.clientes.remove(clien);
            }
            Service.instance().clienteAdd(cliente);
            Provincia p = model.getProvincias().get(0);
            Canton c = p.getCantones().get(0);
            Distrito d = c.getDistritos().get(0);
            model.setCliente(new Cliente("","", p, c, d));
            model.setClientes(Arrays.asList(cliente));
            model.commit();
        } catch (Exception ex) {
            
        }
    }
    
    public void clienteEdit(Cliente cliente){
        model.setCliente(cliente);
        model.commit();
    }
    
    public void prestamosShow(){
        this.hide();
        Application.PRESTAMOS.show(model.getCliente());
    }  
}
