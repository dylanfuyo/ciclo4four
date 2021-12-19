package com.reto2.reto2.interfaz;

import java.util.List;
import java.util.Optional;
import com.reto2.reto2.modelo.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceUser extends MongoRepository<User, Integer>{
    //Identifica si existe un usuario con el email
    Optional<User> findByEmail(String email);
    //List<User> findBybirthtDay(Date date);
    //Autentica el email con la contraseña
    Optional<User> findByEmailAndPassword(String email,String password);
    //List<User> findByMonthBirthtDay(String monthtBirthtDay);
    //List<User> findOneByOrderByIdDesc();
    //Seleccionar un usuario ordenado por el Id descendente (Maximo)
    Optional<User> findTopByOrderByIdDesc();
    //Metodo para buscar por mes de cumpleaños
    List<User> findByMonthBirthtDay(String monthtBirthtDay);
}
