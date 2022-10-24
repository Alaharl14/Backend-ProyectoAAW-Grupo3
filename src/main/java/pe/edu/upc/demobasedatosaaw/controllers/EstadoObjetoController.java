package pe.edu.upc.demobasedatosaaw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demobasedatosaaw.entities.EstadoObjeto;
import pe.edu.upc.demobasedatosaaw.servicesinterfaces.IEstadoObjetoService;

import java.util.List;
@RestController
@RequestMapping("/estadoobjeto")

public class EstadoObjetoController {
    @Autowired
    private IEstadoObjetoService eoService;

    @PostMapping
    public void registrar(@RequestBody EstadoObjeto eo){
        eoService.insert(eo);
    }

    @GetMapping
    public List<EstadoObjeto>listar(){
        return eoService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eoService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody EstadoObjeto estadoObjeto){
        eoService.insert(estadoObjeto);
    }

    @PostMapping("/buscar")
    public List<EstadoObjeto> buscar(@RequestBody EstadoObjeto estadoObjeto){
        List<EstadoObjeto> lista;
        estadoObjeto.setNombreEstado(estadoObjeto.getNombreEstado());
        lista=eoService.search(estadoObjeto.getNombreEstado());
        return lista;
    }
}

