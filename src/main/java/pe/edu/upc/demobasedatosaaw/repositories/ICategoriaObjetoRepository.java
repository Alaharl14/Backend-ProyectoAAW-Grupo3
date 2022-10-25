package pe.edu.upc.demobasedatosaaw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demobasedatosaaw.entities.CategoriaObjeto;

import java.util.List;

@Repository
public interface ICategoriaObjetoRepository extends JpaRepository<CategoriaObjeto,Integer> {

    @Query("from CategoriaObjeto co where co.nombreCategoria like %:nombreCategoria%")
    List<CategoriaObjeto> search(@Param("nombreCategoria") String nombreCategoria);
}
