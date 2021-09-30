/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import java.util.List;
import sistema.data.Data;
import sistema.data.XmlPersister;

/**
 *
 * @author muril
 */
public class Service {
   
    private static Service Instancia;
    
    public static Service instance(){
        if (Instancia == null){ 
            Instancia = new Service();
        }
        return Instancia;
    }
    
     public List<Provincia> provinciaGet()  throws Exception{
      List<Provincia> provinciasL = data.getProvincias();
      if (provinciasL != null) return provinciasL;
        else throw new Exception("No se han cargado provincias");  
     }
    
    public Cliente clienteGet(String cedula) throws Exception{
        Cliente result = data.getClientes().stream().filter(c->c.getCedula().equals(cedula)).findFirst().orElse(null);
        if (result != null) return result;
        else throw new Exception("Cliente no existe");   
    }
    
     public List<Cliente> clienteAll(){
        return data.getClientes();       
    }
     
     public List<Provincia> provinciaAll(){
        return data.getProvincias();       
    }
     
    public List<Canton> cantonAll(){
        return data.getCantones();       
    }
     
    public List<Distrito> distritoAll(){
        return data.getDistritos();       
    }
     
    public void clienteAdd(Cliente cliente) throws Exception{
        Cliente old=data.getClientes().stream().filter(c->c.getCedula().equals(cliente.getCedula())).findFirst().orElse(null);
        if (old==null) data.getClientes().add(cliente);
        else throw new Exception("Cliente ya existe");     
    }   
    
    public Service() {
        try{
            data = XmlPersister.instance().load("prestamos.xml"); // carga datos del Xml
        }
        catch(Exception e){
            data =  new Data(); //opcion de agregar datos si no hay
        }
        
    }
    
    private Data data;
}