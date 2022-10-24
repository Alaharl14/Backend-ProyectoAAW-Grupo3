package pe.edu.upc.demobasedatosaaw.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demobasedatosaaw.entities.Recordatorio;
import pe.edu.upc.demobasedatosaaw.repositories.IRecordatorioRepository;
import pe.edu.upc.demobasedatosaaw.servicesinterfaces.IRecordatorioService;

import java.util.List;
@Service
public class RecordatorioServiceImpl implements IRecordatorioService {
    @Autowired
    private IRecordatorioRepository rR;
    @Override
    public void insert(Recordatorio recordatorio) {
        rR.save(recordatorio);
    }

    @Override
    public List<Recordatorio> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idRecordatorio) {
        rR.deleteById(idRecordatorio);
    }
}

