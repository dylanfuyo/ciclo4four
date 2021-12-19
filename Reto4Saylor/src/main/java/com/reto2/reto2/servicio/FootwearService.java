package com.reto2.reto2.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.reto2.reto2.modelo.Accesory;
import com.reto2.reto2.repositorio.FootwearRepository;

/**
 *
 * @author desaextremo
 */
@Service
public class FootwearService {
    @Autowired
    private FootwearRepository clotheRepository;

    public List<Accesory> getAll() {
        return clotheRepository.getAll();
    }

    public Optional<Accesory> getClothe(String reference) {
        return clotheRepository.getClothe(reference);
    }

    public Accesory create(Accesory accesory) {
        if (accesory.getReference() == null) {
            return accesory;
        } else {
            return clotheRepository.create(accesory);
        }
    }

    public Accesory update(Accesory accesory) {

        if (accesory.getReference() != null) {
            Optional<Accesory> accesoryDb = clotheRepository.getClothe(accesory.getReference());
            if (!accesoryDb.isEmpty()) {
                
                if (accesory.getBrand()!= null) {
                    accesoryDb.get().setBrand(accesory.getBrand());
                }
                
                if (accesory.getCategory() != null) {
                    accesoryDb.get().setCategory(accesory.getCategory());
                }

                if (accesory.getMaterial() != null) {
                    accesoryDb.get().setMaterial(accesory.getMaterial());
                }

                if (accesory.getGender() != null) {
                    accesoryDb.get().setGender(accesory.getGender());
                }

                
                if (accesory.getSize() != null) {
                    accesoryDb.get().setSize(accesory.getSize());
                }
                
                if (accesory.getDescription() != null) {
                    accesoryDb.get().setDescription(accesory.getDescription());
                }
                if (accesory.getPrice() != 0.0) {
                    accesoryDb.get().setPrice(accesory.getPrice());
                }
                if (accesory.getQuantity() != 0) {
                    accesoryDb.get().setQuantity(accesory.getQuantity());
                }
                if (accesory.getPhotography() != null) {
                    accesoryDb.get().setPhotography(accesory.getPhotography());
                }
                accesoryDb.get().setAvailability(accesory.isAvailability());
                clotheRepository.update(accesoryDb.get());
                return accesoryDb.get();
            } else {
                return accesory;
            }
        } else {
            return accesory;
        }
    }

    public boolean delete(String reference) {
        Boolean aBoolean = getClothe(reference).map(accesory -> {
            clotheRepository.delete(accesory);
            return true;
        }).orElse(false);
        return aBoolean;
    }

    public List<Accesory>getByPrice(double price){
        return clotheRepository.getByPrice(price);
    }

    public List<Accesory>getByDescription(String description){
        return clotheRepository.getByDescription(description);
    }
}
