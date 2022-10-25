package pe.edu.upc.demobasedatosaaw.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demobasedatosaaw.entities.CategoriaObjeto;
import pe.edu.upc.demobasedatosaaw.entities.ReporteRobo;
import pe.edu.upc.demobasedatosaaw.repositories.IReporteRoboRepository;
import pe.edu.upc.demobasedatosaaw.servicesinterfaces.IReporteRoboService;

import java.util.List;
import java.util.Optional;

@Service
public class ReporteRoboServiceImpl implements IReporteRoboService {
    @Autowired
    private IReporteRoboRepository rrR;
    @Override
    public void insert(ReporteRobo reporterobo) {
        rrR.save(reporterobo);
    }

    @Override
    public List<ReporteRobo> list() {
        return rrR.findAll();
    }

    @Override
    public void delete(int idReporteRobo) {
        rrR.deleteById(idReporteRobo);
    }

    @Override
    public Optional<ReporteRobo> listarId(int idReporteRobo) {
        return Optional.of(rrR.findById(idReporteRobo).orElse(new ReporteRobo()));
    }

    @Override
    public List<ReporteRobo> search(String nombreReporteRobo) {
        return rrR.findAll();
    }
}