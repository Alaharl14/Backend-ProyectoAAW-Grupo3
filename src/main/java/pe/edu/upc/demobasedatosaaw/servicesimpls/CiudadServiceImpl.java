package pe.edu.upc.demobasedatosaaw.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demobasedatosaaw.entities.CategoriaObjeto;
import pe.edu.upc.demobasedatosaaw.entities.Ciudad;
import pe.edu.upc.demobasedatosaaw.repositories.ICiudadRepository;
import pe.edu.upc.demobasedatosaaw.servicesinterfaces.ICiudadService;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadServiceImpl implements ICiudadService {
    @Autowired
    private ICiudadRepository cR;
    @Override
    public void insert(Ciudad ciudad) {
        cR.save(ciudad);
    }

    @Override
    public List<Ciudad> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCiudad) {
        cR.deleteById(idCiudad);
    }

    @Override
    public Optional<Ciudad> listarId(int idCiudad) {
        return Optional.of(cR.findById(idCiudad).orElse(new Ciudad()));
    }

    @Override
    public List<Ciudad> search(String nombreCiudad) {

        return cR.search(nombreCiudad);
    }
}

