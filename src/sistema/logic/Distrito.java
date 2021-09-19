/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;

/**
 *
 * @author muril
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Distrito {
    @XmlID
    String numero;
    String nombre;
    
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
