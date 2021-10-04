package sistema.presentation.prestamos;

import java.util.ArrayList;
import java.util.Arrays;
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
    
    public void prestamoAdd(Prestamo prestamo){
        try {
            Service.instance().prestamoAdd(prestamo);
            model.setPrestamo(new Prestamo());
            model.setPrestamos(Arrays.asList(prestamo));
            model.commit();
        } catch (Exception ex) {
            
        }
    }
}
