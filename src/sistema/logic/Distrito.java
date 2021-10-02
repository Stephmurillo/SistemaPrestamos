package sistema.logic;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;

@XmlAccessorType(XmlAccessType.FIELD)
public class Distrito {
    @XmlID
    String numero;
    String nombre;

    public Distrito(String numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
    
    public Distrito() {
        this.numero = "";
        this.nombre = "";
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNumero(String num){
        this.numero = num;
    }
    
    public void setNombre(String nom){
        this.nombre  = nom;
    }

    public String toString() {
        return nombre;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Distrito other = (Distrito) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }


    
    
}
