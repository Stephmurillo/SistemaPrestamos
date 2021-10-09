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
        Application.PRESTAMOS.show();
        Application.CLIENTES.hide();
    }
    
    public void pagoAdd(String cod, Pagos pago){
        try {
            Service.instance().pagoAdd(cod, pago);
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
    
     public Prestamo prestamoGet(String cedula){
        Prestamo prestamo = new Prestamo();
        try {
            prestamo = Service.instance().prestamoGet(cedula);
            model.setPrestamo(prestamo);
            model.commit();
            return prestamo;
        } catch (Exception ex) {
            model.setPrestamo(new Prestamo());
            model.commit();
        }
        return null;
    }
}
