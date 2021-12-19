package com.reto2.reto2;

import com.reto2.reto2.interfaz.InterfaceFootwear;
import com.reto2.reto2.interfaz.InterfaceOrder;
import com.reto2.reto2.interfaz.InterfaceUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto2Application implements CommandLineRunner{
	@Autowired
    private InterfaceFootwear interfaceSupplements;
    @Autowired
	private InterfaceUser interfaceUser;
    @Autowired
	private InterfaceOrder interfaceOrder;
	public static void main(String[] args) {
		SpringApplication.run(Reto2Application.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
        interfaceSupplements.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();
    }
}
