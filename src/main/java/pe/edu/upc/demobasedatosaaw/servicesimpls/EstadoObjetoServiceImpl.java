package pe.edu.upc.demobasedatosaaw.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demobasedatosaaw.entities.Ciudad;
import pe.edu.upc.demobasedatosaaw.entities.EstadoObjeto;
import pe.edu.upc.demobasedatosaaw.repositories.IEstadoObjetoRepository;
import pe.edu.upc.demobasedatosaaw.servicesinterfaces.IEstadoObjetoService;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoObjetoServiceImpl implements IEstadoObjetoService {
    @Autowired
    private IEstadoObjetoRepository eoR;
    @Override
    public void insert(EstadoObjeto estadoobjeto) {
        eoR.save(estadoobjeto);
    }

    @Override
    public List<EstadoObjeto> list() {
        return eoR.findAll();
    }

    @Override
    public void delete(int idEstado) {
        eoR.deleteById(idEstado);
    }

    @Override
    public Optional<EstadoObjeto> listarId(int idEstado) {
        return Optional.of(eoR.findById(idEstado).orElse(new EstadoObjeto()));
    }

    @Override
    public List<EstadoObjeto> search(String nombreEstado) {
        return eoR.search(nombreEstado);
    }
}
