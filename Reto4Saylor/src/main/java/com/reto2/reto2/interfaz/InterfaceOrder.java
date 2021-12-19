package com.reto2.reto2.interfaz;

import java.util.List;
import java.util.Optional;

import com.reto2.reto2.modelo.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface InterfaceOrder extends MongoRepository<Order, Integer> {

    // permite recuperar las ordenes de pedido asociadas a la zona recibida como
    // parametro
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(String Country);

    // Permite recuperar las ordenes por estado
    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);

    // Para seleccionar la orden con el id maximo
    Optional<Order> findTopByOrderByIdDesc();

}
