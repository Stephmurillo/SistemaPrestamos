package sistema.presentation.prestamos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sistema.Application;
import sistema.logic.Cliente;
import sistema.logic.Prestamo;
import sistema.logic.Service;

public class ControllerPrestamo {
    ModelPrestamo model;
    ViewPrestamo view;

    public ControllerPrestamo(ModelPrestamo model, ViewPrestamo view) {
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
    
    public void show(Cliente c){
        this.model.setCliente(c);
        this.view.setVisible(true);
    }
    
    public void hide(){
        this.view.setVisible(false);
        Application.CLIENTES.show();
    }
    
    public void prestamoAdd(String ced, Prestamo prestamo){
        try {
            Service.instance().prestamoAdd(ced, prestamo);
            model.setPrestamo(new Prestamo("", 0, 0, 0));
            model.setPrestamos(Arrays.asList(prestamo));
            model.commit();
        } catch (Exception ex) {
            
        }
    }
    
    public void prestamoGet(String ced, String numero){
        try {
            Prestamo prestamo = Service.instance().prestamoGet(ced, numero);
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
        Application.PAGOS.show();
    } 
    
    public void prestamoSearch(String ced){
        List<Prestamo> prestamos = Service.instance().prestamoSearch(ced);
        model.setPrestamo(new Prestamo("", 0, 0, 0));
        model.setPrestamos(prestamos);
        model.commit();
    }
    
    public void setCliente(Cliente cliente){
        this.model.setCliente(cliente);
        this.model.setPrestamos(cliente.getPrestamos());
        this.model.commit();
    }
    
    void createPdfPrestamos(List<Prestamo> prestamos) throws IOException{
        Application.createPdfPrestamos(model.getPrestamos());
    }
}
