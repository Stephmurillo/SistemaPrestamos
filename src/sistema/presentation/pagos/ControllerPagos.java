package sistema.presentation.pagos;

import java.util.ArrayList;
import java.util.Arrays;
import sistema.Application;
import sistema.logic.Pagos;
import sistema.logic.Prestamo;
import sistema.logic.Service;

public class ControllerPagos {
    ModelPagos model;
    ViewPagos view;

    public ControllerPagos(ModelPagos model, ViewPagos view) {
        this.model = model;
        this.view = view;
        model.setMensualidad(new Pagos());
        model.setPagos(new ArrayList<>());
        view.setModel(model);
        view.setController(this);
    }
    
    public void show(){
        this.view.setVisible(true);
    }
    
    public void hide(){
        this.view.setVisible(false);
        Application.PRESTAMOS.show();
        Application.CLIENTES.hide();
    }
    
    public void mensualidadAdd(Pagos mensualidad){
        try {
            Service.instance().mensualidadAdd(mensualidad);
            model.setMensualidad(new Pagos());
            model.setPagos(Arrays.asList(mensualidad));
            model.commit();
        } catch (Exception ex) {
            
        }
    }
    
    public void pago(int row){
        Pagos mensualidad = model.getPagos().get(row);
       /* if(mensualidad.getEstado() == false){
            mensualidad.setEstado(true);
        }*/
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
