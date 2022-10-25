package pe.edu.upc.demobasedatosaaw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demobasedatosaaw.entities.ReporteRobo;
import pe.edu.upc.demobasedatosaaw.servicesinterfaces.IReporteRoboService;

import java.util.List;
@RestController
@RequestMapping("/reporterobo")
public class ReporteRoboController {
    @Autowired
    private IReporteRoboService rrService;

    @PostMapping
    public void registrar(@RequestBody ReporteRobo rr){
        rrService.insert(rr);
    }

    @GetMapping
    public List<ReporteRobo>listar(){
        return rrService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rrService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody ReporteRobo reporteRobo){
        rrService.insert(reporteRobo);
    }

    @PostMapping("/buscar")
    public List<ReporteRobo> buscar(@RequestBody ReporteRobo reporteRobo) {
        List<ReporteRobo> lista;
        reporteRobo.setNombreReporteRobo(reporteRobo.getNombreReporteRobo());
        lista = rrService.search(reporteRobo.getNombreReporteRobo());
        return lista;
    }

}