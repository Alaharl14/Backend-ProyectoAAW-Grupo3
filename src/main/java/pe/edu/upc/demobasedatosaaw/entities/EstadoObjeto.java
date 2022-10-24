package pe.edu.upc.demobasedatosaaw.entities;

import javax.persistence.*;

@Entity
@Table(name = "EstadoObjeto")
public class EstadoObjeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstado;
    @Column(name = "nombreEstado", length = 50, nullable = false)
    private String nombreEstado;

    public EstadoObjeto() {
    }

    public EstadoObjeto(int idEstado, String nombreEstado) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
}
