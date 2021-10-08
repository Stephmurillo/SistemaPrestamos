package sistema.presentation.pagos;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import sistema.logic.Cliente;
import sistema.logic.Pagos;
import sistema.logic.Prestamo;

public class ModelPagos extends Observable{
    Cliente cliente;
    Prestamo prestamo;
    Pagos mensualidad;
    List<Pagos> mensualidades;

    public ModelPagos(){
     cliente = new Cliente();
     prestamo = new Prestamo();
     mensualidades = new ArrayList<>();
     mensualidad = new Pagos();
     }
   
    
    public List<Pagos> getPagos() {
        return mensualidades;
    }

    public void setPagos(List<Pagos> mensualidades) {
        this.mensualidades = mensualidades;
    }
    
    public Pagos getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(Pagos mensualidad) {
        this.mensualidad = mensualidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
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











