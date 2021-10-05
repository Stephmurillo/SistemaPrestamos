package sistema.presentation.mensualidades;

import java.util.ArrayList;
import java.util.Arrays;
import sistema.logic.Mensualidad;
import sistema.logic.Service;

public class Controller {
    Model model;
    ViewMensualidad view;

    public Controller(Model model, ViewMensualidad view) {
        this.model = model;
        this.view = view;
        model.setMensualidad(new Mensualidad());
        model.setMensualidades(new ArrayList<>());
        view.setModel(model);
        view.setController(this);
    }
    
    public void show(){
        this.view.setVisible(true);
    }
    
    public void mensualidadAdd(Mensualidad mensualidad){
        try {
            Service.instance().mensualidadAdd(mensualidad);
            model.setMensualidad(new Mensualidad());
            model.setMensualidades(Arrays.asList(mensualidad));
            model.commit();
        } catch (Exception ex) {
            
        }
    }
}
