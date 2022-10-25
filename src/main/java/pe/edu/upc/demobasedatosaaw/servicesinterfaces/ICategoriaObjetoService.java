package pe.edu.upc.demobasedatosaaw.servicesinterfaces;

import pe.edu.upc.demobasedatosaaw.entities.CategoriaObjeto;

import java.util.List;
import java.util.Optional;

public interface ICategoriaObjetoService {
    public void insert(CategoriaObjeto categoriaobjeto);
    List<CategoriaObjeto>list();
    public void delete(int idCategoria);

    public Optional<CategoriaObjeto>listarId(int idCategoria);

    List<CategoriaObjeto> search(String nombreCategoria);
}
