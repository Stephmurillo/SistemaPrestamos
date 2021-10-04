package sistema.presentation.mensualidades;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import sistema.logic.Mensualidad;

public class Model extends Observable{
    
    Mensualidad mensualidad;
    List<Mensualidad> mensualidades;

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











