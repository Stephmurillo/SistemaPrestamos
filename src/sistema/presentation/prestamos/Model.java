package sistema.presentation.prestamos;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import sistema.logic.Cliente;
import sistema.logic.Prestamo;

public class Model extends Observable{
    
    Prestamo prestamo;
    Cliente cliente;

    public Model(){
     cliente = new Cliente();
     prestamo = new Prestamo();
    }
   
    public List<Prestamo> getPrestamos() {
        return cliente.getPrestamos();
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.cliente.setPrestamos(prestamos);
    }
    
    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

   public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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











