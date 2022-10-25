package pe.edu.upc.demobasedatosaaw.entities;

import javax.persistence.*;

@Entity
@Table(name = "CategoriaObjeto")
public class CategoriaObjeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column(name = "nombreCategoria", length = 50, nullable = false)
    private String nombreCategoria;

    public CategoriaObjeto() {
    }

    public CategoriaObjeto(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}