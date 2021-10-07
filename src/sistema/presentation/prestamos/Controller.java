package sistema.presentation.prestamos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sistema.Application;
import sistema.logic.Prestamo;
import sistema.logic.Service;

public class Controller {
    Model model;
    ViewPrestamo view;

    public Controller(Model model, ViewPrestamo view) {
        this.model = model;
        this.view = view;
        model.setPrestamo(new Prestamo());
        model.setPrestamos(new ArrayList<>());
        view.setModel(model);
        view.setController(this);
    }
    
    public void show(){
        this.view.setVisible(true);
    }
    
    public void hide(){
        this.view.setVisible(false);
        Application.CLIENTES.show();
    }
    
    public void prestamoAdd(Prestamo prestamo){
        try {
            Service.instance().prestamoAdd(prestamo);
            model.setPrestamo(new Prestamo("", 0, 0, 0));
            model.setPrestamos(Arrays.asList(prestamo));
            model.commit();
        } catch (Exception ex) {
            
        }
    }
    
    public void prestamoGet(String numero){
        try {
            Prestamo prestamo = Service.instance().prestamoGet(numero);
            model.setPrestamo(prestamo);
            model.setPrestamos(Arrays.asList(prestamo));
            model.commit();
        } catch (Exception ex) {
            model.setPrestamo(new Prestamo());
            model.setPrestamos(new ArrayList<>());
            model.commit();
        }
    }
    
    public void prestamoEdit(int row){
        Prestamo prestamo = model.getPrestamos().get(row);
        model.setPrestamo(prestamo);
        model.commit();
    }
    
    public void mensualidadShow(){
        this.hide();
        Application.MENSUALIDADES.show();
    } 
    
    public void prestamoSearch(String codigo){
        List<Prestamo> prestamos = Service.instance().prestamoSearch(codigo);
        model.setPrestamo(new Prestamo(codigo, 0, 0, 0));
        model.setPrestamos(prestamos);
        model.commit();
    }
    
}
