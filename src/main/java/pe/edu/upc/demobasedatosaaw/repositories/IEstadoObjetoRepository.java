package pe.edu.upc.demobasedatosaaw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demobasedatosaaw.entities.EstadoObjeto;

import java.util.List;

@Repository
public interface IEstadoObjetoRepository extends JpaRepository<EstadoObjeto,Integer> {

    @Query("from EstadoObjeto eo where eo.nombreEstado like %:nombreEstado%")
    List<EstadoObjeto> search(@Param("nombreEstado") String nombreEstado);
}