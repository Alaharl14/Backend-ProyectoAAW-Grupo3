package pe.edu.upc.demobasedatosaaw.entities;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "ReporteRobo")
public class ReporteRobo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReporteRobo;
    @Column(name = "nombreReporteRobo", length = 50, nullable = false)
    private String nombreReporteRobo;
    @Column(name = "descripcionReporteRobo", length = 50, nullable = false)
    private String descripcionReporteRobo;

    private Date fechaReporteRobo;

    public ReporteRobo() {
    }

    public ReporteRobo(int idReporteRobo, String nombreReporteRobo, String descripcionReporteRobo, Date fechaReporteRobo) {
        this.idReporteRobo = idReporteRobo;
        this.nombreReporteRobo = nombreReporteRobo;
        this.descripcionReporteRobo = descripcionReporteRobo;
        this.fechaReporteRobo = fechaReporteRobo;
    }

    public int getIdReporteRobo() {
        return idReporteRobo;
    }

    public void setIdReporteRobo(int idReporteRobo) {
        this.idReporteRobo = idReporteRobo;
    }

    public String getNombreReporteRobo() {
        return nombreReporteRobo;
    }

    public void setNombreReporteRobo(String nombreReporteRobo) {
        this.nombreReporteRobo = nombreReporteRobo;
    }

    public String getDescripcionReporteRobo() {
        return descripcionReporteRobo;
    }

    public void setDescripcionReporteRobo(String descripcionReporteRobo) {
        this.descripcionReporteRobo = descripcionReporteRobo;
    }

    public Date getFechaReporteRobo() {
        return fechaReporteRobo;
    }

    public void setFechaReporteRobo(Date fechaReporteRobo) {
        this.fechaReporteRobo = fechaReporteRobo;
    }
}
