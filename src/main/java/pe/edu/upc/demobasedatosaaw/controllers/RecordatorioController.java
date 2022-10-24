package pe.edu.upc.demobasedatosaaw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demobasedatosaaw.entities.Recordatorio;
import pe.edu.upc.demobasedatosaaw.servicesinterfaces.IRecordatorioService;

import java.util.List;
@RestController
@RequestMapping("/propietarios")
public class RecordatorioController {
    @Autowired
    private IRecordatorioService rService;

    @PostMapping
    public void registrar(@RequestBody Recordatorio r){
        rService.insert(r);
    }

    @GetMapping
    public List<Recordatorio>listar(){
        return rService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rService.delete(id);
    }

}

