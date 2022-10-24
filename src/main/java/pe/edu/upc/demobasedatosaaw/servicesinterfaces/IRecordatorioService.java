package pe.edu.upc.demobasedatosaaw.servicesinterfaces;

import pe.edu.upc.demobasedatosaaw.entities.Recordatorio;

import java.util.List;

public interface IRecordatorioService {
    public void insert(Recordatorio recordatorio);
    List<Recordatorio>list();

    public void delete(int idRecordatorio);

}
