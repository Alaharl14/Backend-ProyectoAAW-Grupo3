package pe.edu.upc.demobasedatosaaw.servicesinterfaces;

import pe.edu.upc.demobasedatosaaw.entities.CategoriaObjeto;
import pe.edu.upc.demobasedatosaaw.entities.ReporteRobo;

import java.util.List;
import java.util.Optional;

public interface IReporteRoboService {

    public void insert(ReporteRobo reporterobo);
    List<ReporteRobo>list();
    public void delete(int idReporteRobo);

    public Optional<ReporteRobo> listarId(int idReporteRobo);

    List<ReporteRobo> search(String nombreReporteRobo);
}
