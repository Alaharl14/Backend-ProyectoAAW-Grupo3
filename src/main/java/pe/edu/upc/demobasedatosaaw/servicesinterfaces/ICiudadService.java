package pe.edu.upc.demobasedatosaaw.servicesinterfaces;

import pe.edu.upc.demobasedatosaaw.entities.CategoriaObjeto;
import pe.edu.upc.demobasedatosaaw.entities.Ciudad;

import java.util.List;
import java.util.Optional;

public interface ICiudadService {
    public void insert(Ciudad ciudad);
    List<Ciudad>list();
    public void delete(int idCiudad);

    public Optional<Ciudad> listarId(int idCiudad);

    List<Ciudad> search(String nombreCiudad);
}