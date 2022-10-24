package pe.edu.upc.demobasedatosaaw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demobasedatosaaw.entities.Recordatorio;

@Repository
public interface IRecordatorioRepository extends JpaRepository<Recordatorio,Integer> {
}
