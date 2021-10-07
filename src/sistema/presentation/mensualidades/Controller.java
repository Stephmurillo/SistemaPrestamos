package sistema.presentation.mensualidades;

import java.util.ArrayList;
import java.util.Arrays;
import sistema.Application;
import sistema.logic.Mensualidad;
import sistema.logic.Prestamo;
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
    
    public void hide(){
        this.view.setVisible(false);
        //Application.PRESTAMOS.show();
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
    
    public void pago(int row){
        Mensualidad mensualidad = model.getMensualidades().get(row);
        if(mensualidad.getEstado() == false){
            mensualidad.setEstado(true);
        }
        model.commit();
    }
    
//     public Prestamo prestamoGet(String cedula){
//        Prestamo prestamo = new Prestamo();
//        try {
//            prestamo = Service.instance().clienteGet(cedula);
//            model.setCliente(prestamo);
//            model.commit();
//            return prestamo;
//        } catch (Exception ex) {
//            model.setPrestamo(new Prestamo());
//            model.commit();
//        }
//        return null;
//    }

}
