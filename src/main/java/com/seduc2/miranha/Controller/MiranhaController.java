package com.seduc2.miranha.Controller;

import com.seduc2.miranha.Entity.Miranha;
import com.seduc2.miranha.Service.MiranhaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class MiranhaController {

    private final MiranhaService service;
    public MiranhaController(MiranhaService service) {
        this.service = service;
    }
    @PostMapping
    public String save(@RequestBody Miranha m){
        return service.salvar(m) + "Miranha calvo com sucesso";
    }
    @GetMapping
    public List<Miranha> listar(){
        return service.listar();
    }
}
