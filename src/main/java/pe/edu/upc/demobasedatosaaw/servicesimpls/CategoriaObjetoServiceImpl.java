package pe.edu.upc.demobasedatosaaw.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demobasedatosaaw.entities.CategoriaObjeto;
import pe.edu.upc.demobasedatosaaw.repositories.ICategoriaObjetoRepository;
import pe.edu.upc.demobasedatosaaw.servicesinterfaces.ICategoriaObjetoService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaObjetoServiceImpl implements ICategoriaObjetoService {

    @Autowired
    private ICategoriaObjetoRepository coR;
    @Override
    public void insert(CategoriaObjeto categoriaobjeto) {
        coR.save(categoriaobjeto);
    }

    @Override
    public List<CategoriaObjeto> list() {
        return coR.findAll();
    }

    @Override
    public void delete(int idCategoria) {
        coR.deleteById(idCategoria);
    }

    @Override
    public Optional<CategoriaObjeto> listarId(int idCategoria) {
        return Optional.of(coR.findById(idCategoria).orElse(new CategoriaObjeto()));
    }

    @Override
    public List<CategoriaObjeto> search(String nombreCategoria) {
        return coR.search(nombreCategoria);
    }
}
