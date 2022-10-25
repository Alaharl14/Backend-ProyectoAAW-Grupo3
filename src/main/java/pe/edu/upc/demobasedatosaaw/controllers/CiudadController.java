package pe.edu.upc.demobasedatosaaw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demobasedatosaaw.servicesinterfaces.ICiudadService;
import pe.edu.upc.demobasedatosaaw.entities.Ciudad;

import java.util.List;
@RestController
@RequestMapping("/ciudad")
public class CiudadController {
    @Autowired
    private ICiudadService cService;

    @PostMapping
    public void registrar(@RequestBody Ciudad c){
        cService.insert(c);
    }

    @GetMapping
    public List<Ciudad>listar(){
        return cService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Ciudad ciudad){
        cService.insert(ciudad);
    }

    @PostMapping("/buscar")
    public List<Ciudad> buscar(@RequestBody Ciudad ciudad){
        List<Ciudad> lista;
        ciudad.setNombreCiudad(ciudad.getNombreCiudad());
        lista=cService.search(ciudad.getNombreCiudad());
        return lista;
    }
}
