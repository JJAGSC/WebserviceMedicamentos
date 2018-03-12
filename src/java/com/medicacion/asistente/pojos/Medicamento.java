package com.medicacion.asistente.pojos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan José Aguirre Sánchez
 */
@XmlRootElement
public class Medicamento {
    
    public int PK_ID;
    String nombre="";
    String hora="";
    public String usuarioalarma="no";

    public Medicamento() {
        
    }

    public Medicamento(int PK_ID, String nombre, String hora, String usuarioalarma) {
        this.PK_ID = PK_ID;
        this.nombre = nombre;
        this.hora = hora;
        this.usuarioalarma = usuarioalarma;
    }

    public int getPK_ID() {
        return PK_ID;
    }

    public void setPK_ID(int PK_ID) {
        this.PK_ID = PK_ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUsuarioAlarma() {
        return usuarioalarma;
    }

    public void setUsuarioAlarma(String usuarioalarma) {
        this.usuarioalarma = usuarioalarma;
    }

}
