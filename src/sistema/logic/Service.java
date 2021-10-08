package sistema.logic;

import java.util.List;
import java.util.stream.Collectors;
import sistema.data.Data;
import sistema.data.XmlPersister;

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
        else throw new Exception("Cliente no existe.");   
    }
    
     public List<Cliente> clienteAll(){
        return data.getClientes();       
    }
     
     public List<Prestamo> prestamoAll(){
        return data.getPrestamos();       
    }
     
      public List<Pagos> mensualidadAll(){
        return data.getMensualidades();       
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
    
    public void prestamoAdd(String ced, Prestamo prestamo) throws Exception{
        Cliente clie = data.getClientes().stream().filter(c->c.getCedula().equals(ced)).findFirst().orElse(null);
        Prestamo old =clie.getPrestamos().stream().filter(c->c.getCodigo().equals(prestamo.getCodigo())).findFirst().orElse(null);
        if (old==null) data.getPrestamos().add(prestamo);
        else throw new Exception("Prestamo ya existe");     
    } 
    
    public void mensualidadAdd(Pagos mensualidad) throws Exception{
        Pagos old = data.getMensualidades().stream().filter(c->c.getNumero().equals(mensualidad.getNumero())).findFirst().orElse(null);
        if (old==null) data.getMensualidades().add(mensualidad);
        else throw new Exception("Mensualidad ya existe");     
    } 
    
    public Prestamo prestamoGet(String numero) throws Exception{
        Prestamo result= data.getPrestamos().stream().filter(f->f.getCodigo().equals(numero)).findFirst().orElse(null);
        if (result!=null) return result;
        else throw new Exception("Prestamo no existe");   
    }
    
    public List<Prestamo> prestamoSearch(String ced,String codigo){
       Cliente clie = data.getClientes().stream().filter(c->c.getCedula().equals(ced)).findFirst().orElse(null);
       List<Prestamo> result = clie.getPrestamos();
       return result;        
    }
    
      public void store(){
        try {
            XmlPersister.instance().store(data, "prestamos.xml" );
        } catch (Exception ex) {
        }
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