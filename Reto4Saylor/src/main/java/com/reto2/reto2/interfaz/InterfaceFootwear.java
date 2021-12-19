package com.reto2.reto2.interfaz;

import java.util.List;

import com.reto2.reto2.modelo.Accesory;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceFootwear extends MongoRepository<Accesory, String>{
    public List <Accesory>findByPrice(double price);
    public List<Accesory>findByPriceLessThanEqual(double price);

    public List<Accesory>findByDescriptionContainingIgnoreCase(String description);

}
