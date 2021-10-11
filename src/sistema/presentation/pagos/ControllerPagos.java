package sistema.presentation.pagos;

import java.util.ArrayList;
import java.util.Arrays;
import sistema.Application;
import sistema.logic.Pagos;
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
        Application.PRESTAMOS.hide();
        Application.CLIENTES.hide();
    }
    
    public void pagoAdd(String cod, String ced, Pagos pago){
        try {
            Service.instance().pagoAdd(cod,ced,pago);
            model.setMensualidad(new Pagos());
            model.setPagos(Arrays.asList(pago));
            model.commit();
        } catch (Exception ex) {
            
        }
    }
    
    public void pago(int row){
        Pagos pago = model.getPagos().get(row);
        model.commit();
    }
    
//     public Pago prestamoGet(String cod){
//        Pago prestamo = new Pago();
//        try {
//            prestamo = Service.instance().prestamoGet(cod);
//            model.setPago(prestamo);
//            model.commit();
//            return prestamo;
//        } catch (Exception ex) {
//            model.setPago(new Pago());
//            model.commit();
//        }
//        return null;
//    }
}
