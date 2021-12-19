package com.reto2.reto2.controller;

import java.util.List;
import java.util.Optional;

import com.reto2.reto2.modelo.Accesory;
import com.reto2.reto2.servicio.FootwearService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Brayand fuyo
 */
@RestController
@RequestMapping("/api/accessory")
@CrossOrigin("*")
public class FootwearController {
    @Autowired
    private FootwearService accessoryService;

    @GetMapping("/all")
    public List<Accesory> getAll() {
        return accessoryService.getAll();
    }
    
    @GetMapping("/{reference}")
    public Optional<Accesory> getClothe(@PathVariable("reference") String reference) {
        return accessoryService.getClothe(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Accesory create(@RequestBody Accesory gadget) {
        return accessoryService.create(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Accesory update(@RequestBody Accesory gadget) {
        return accessoryService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return accessoryService.delete(reference);
    }

    @GetMapping("/price/{price}")
    public List<Accesory> getByPrice(@PathVariable("price") double price){
        return accessoryService.getByPrice(price);
    }

    @GetMapping("/description/{description}")
    public List<Accesory> getByDescription(@PathVariable("description") String description){
        return accessoryService.getByDescription(description);
    }
}
