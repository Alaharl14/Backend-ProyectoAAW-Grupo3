package pe.edu.upc.demobasedatosaaw.servicesinterfaces;

import pe.edu.upc.demobasedatosaaw.entities.Ciudad;
import pe.edu.upc.demobasedatosaaw.entities.EstadoObjeto;

import java.util.List;
import java.util.Optional;

public interface IEstadoObjetoService {

    public void insert(EstadoObjeto estadoobjeto);
    List<EstadoObjeto>list();

    public void delete(int idEstado);

    public Optional<EstadoObjeto> listarId(int idEstado);

    List<EstadoObjeto> search(String nombreEstado);
}
