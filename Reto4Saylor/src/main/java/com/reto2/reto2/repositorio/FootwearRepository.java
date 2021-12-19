package com.reto2.reto2.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.reto2.reto2.interfaz.InterfaceFootwear;
import com.reto2.reto2.modelo.Accesory;

@Repository
public class FootwearRepository {
    @Autowired
    private InterfaceFootwear repository;
    
    public List<Accesory> getAll() {
        return repository.findAll();
    }

    public Optional<Accesory> getClothe(String id){
        return repository.findById(id);
    }

    public Accesory create(Accesory clothe) {
        return repository.save(clothe);
    }

    public void update(Accesory clothe) {
        repository.save(clothe);
    }
    
    public void delete(Accesory clothe) {
        repository.delete(clothe);
    }

    public List<Accesory> getByPrice(double price){
        return repository.findByPrice(price);
    }

    public List<Accesory> getByDescription(String description){
        return repository.findByDescriptionContainingIgnoreCase(description);
    }
}
