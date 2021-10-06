package sistema.presentation.cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import sistema.logic.Canton;
import sistema.logic.Cliente;
import sistema.logic.Distrito;
import sistema.logic.Provincia;

public class Model extends Observable{
    
    Cliente cliente;
    List<Cliente> clientes; 
    List<Provincia> provincias;
    List<Canton> cantones;
    List<Distrito> distritos;
    
    public Model(){
     cliente = new Cliente();
     clientes = new ArrayList<>();
     provincias = new ArrayList<>();
     cantones = new ArrayList<>();
     distritos = new ArrayList<>();
     }
   
    
    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }

    public List<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(List<Canton> cantones) {
        this.cantones = cantones;
    }

    public List<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(List<Distrito> distritos) {
        this.distritos = distritos;
    }
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }
    
    public void commit(){
        this.setChanged();
        this.notifyObservers();
    }
}











