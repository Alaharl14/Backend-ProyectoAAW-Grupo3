package pe.edu.upc.demobasedatosaaw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demobasedatosaaw.entities.ReporteRobo;

import java.util.List;

@Repository
public interface IReporteRoboRepository extends JpaRepository<ReporteRobo,Integer> {

    @Query("from ReporteRobo rr where rr.nombreReporteRobo like %:nombreReporteRobo%")
    List<ReporteRobo> search(@Param("nombreReporteRobo") String nombreReporteRobo);
}
