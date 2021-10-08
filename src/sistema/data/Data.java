package sistema.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import sistema.logic.Cliente;
import sistema.logic.Prestamo;
import sistema.logic.Provincia;
import sistema.logic.Canton;
import sistema.logic.Distrito;
import sistema.logic.Pagos;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {
    private List<Cliente> clientes;    
    private List<Provincia> provincias;
    private List<Canton> cantones;
    private List<Distrito> distritos;
    private List<Prestamo> prestamos;
    private List<Pagos> mensualidades;

    public Data() {
        clientes = new ArrayList<>();    
        provincias = new ArrayList<>(); 
        prestamos = new ArrayList<>(); 
        cantones = new ArrayList<>(); 
        mensualidades = new ArrayList<>(); 
        distritos = new ArrayList<>(); 
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
    
    public void setMensualidades(List<Pagos> mensualidades) {
        this.mensualidades = mensualidades;
    }

    public List<Pagos> getMensualidades() {
        return mensualidades;
    }
    
    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }
    
    public List<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(List<Canton> cantones) {
        this.cantones = cantones;
    }

    public List<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(List<Distrito> distritos) {
        this.distritos = distritos;
    }
}
