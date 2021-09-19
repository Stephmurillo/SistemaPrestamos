
package sistema.logic;


import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;

/**
 *
 * @author muril
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class Provincia {
    @XmlID
    String numero;
    String nombre;
    List<Canton> canton;
    
    
    
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
    
}