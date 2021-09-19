/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

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
    
     
    
    public Cliente clienteGet(String cedula) throws Exception{
        Cliente result = data.getClientes().stream().filter(c->c.getCedula().equals(cedula)).findFirst().orElse(null);
       //Cliente result = clientes.get(cedua);
        if (result != null) return result;
        else throw new Exception("Cliente no existe");   
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