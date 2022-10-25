package pe.edu.upc.demobasedatosaaw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demobasedatosaaw.entities.CategoriaObjeto;
import pe.edu.upc.demobasedatosaaw.servicesinterfaces.ICategoriaObjetoService;

import java.util.List;
@RestController
@RequestMapping("/categoriaobjeto")
public class CategoriaObjetoController {
    @Autowired
    private ICategoriaObjetoService coService;
    @PostMapping
    public void registrar(@RequestBody CategoriaObjeto co){coService.insert(co);}
    @GetMapping
    public List<CategoriaObjeto>list(){return coService.list();}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        coService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody CategoriaObjeto categoriaObjeto){
        coService.insert(categoriaObjeto);
    }
    @PostMapping("/buscar")
    public List<CategoriaObjeto> buscar(@RequestBody CategoriaObjeto categoriaObjeto){
        List<CategoriaObjeto> lista;
        categoriaObjeto.setNombreCategoria(categoriaObjeto.getNombreCategoria());
        lista=coService.search(categoriaObjeto.getNombreCategoria());
        return lista;
    }
}
