package com.reto2.reto2.repositorio;

import java.util.List;
import java.util.Optional;

import com.reto2.reto2.interfaz.InterfaceUser;
import com.reto2.reto2.modelo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    @Autowired
    private InterfaceUser userCrudRepository;
     
       public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }

    public Optional<User> getUser(Integer id) {
        return userCrudRepository.findById(id);
    }

    public User create(User user) {
        return userCrudRepository.save(user);
    }
    
    public void update(User user) {
        userCrudRepository.save(user);
    }
    
    public void delete(User user) {
        userCrudRepository.delete(user);
    }
    
    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);
        
        return !usuario.isEmpty();
    }
    
    public Optional<User> authenticateUser(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }

    public Optional<User> lastUserId(){
        return userCrudRepository.findTopByOrderByIdDesc();
    }

    public List<User> getByMonthBirthDhay(String monthtBirthtDay){
        return userCrudRepository.findByMonthBirthtDay(monthtBirthtDay);
    }
}
