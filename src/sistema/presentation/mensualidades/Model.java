package sistema.presentation.mensualidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import sistema.logic.Cliente;
import sistema.logic.Mensualidad;
import sistema.logic.Prestamo;

public class Model extends Observable{
    Cliente cliente;
    Prestamo prestamo;
    Mensualidad mensualidad;
    List<Mensualidad> mensualidades;

    public Model(){
     mensualidades = new ArrayList<>();
     mensualidad = new Mensualidad();
     }
   
    
    public List<Mensualidad> getMensualidades() {
        return mensualidades;
    }

    public void setMensualidades(List<Mensualidad> mensualidades) {
        this.mensualidades = mensualidades;
    }
    
    public Mensualidad getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(Mensualidad mensualidad) {
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











