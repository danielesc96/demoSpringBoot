package com.example.demoDanielEscribano;

import static org.junit.Assert.*;

import com.example.demoDanielEscribano.entities.User;
import com.example.demoDanielEscribano.service.interfaces.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest
class DemoDanielEscribanoApplicationTests {

	User tUser;

	@Autowired
	private UserService service;

	@Test
	public void getAllTest() {
		assertEquals(9,service.getAll().size());
	}


	@Test
	public void insertTestSuccess() {

		tUser=new User();
		tUser.setId(19);
		tUser.setNombre("Pepe");
		tUser.setEmail("emailPrueba");
		tUser.setEdad(66);
		service.insertUser(tUser);
		Assertions.assertEquals(tUser.getNombre(),service.updateUser(tUser).getNombre());
	}


	@Test
	public void updateTestSuccess() {

		tUser=new User();
		tUser.setId(19);
		tUser.setNombre("Pepe");
		tUser.setEmail("emailPrueba2");
		tUser.setEdad(67);

		Assertions.assertEquals(tUser.getNombre(),service.updateUser(tUser).getNombre());


	}

	@Test
	public void getOneTestSuccess() {
		tUser=new User();
		tUser.setId(1);
		tUser.setNombre("Daniel Escribano");
		tUser.setEmail("daniel.escribano.san@gmail.com");
		tUser.setEdad(25);

		Assertions.assertEquals(tUser.getNombre(),service.getById(1).getNombre()); }

	@Test
	public void deleteTestSuccess() {
		int size=service.getAll().size();
		tUser=new User();
		tUser.setId(19);
		service.deleteUser(tUser);
		int size2=service.getAll().size();
		Assertions.assertNotEquals(size,size2); }
}
