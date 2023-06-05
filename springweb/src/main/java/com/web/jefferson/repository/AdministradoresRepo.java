package com.web.jefferson.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.web.jefferson.models.Administrador;

public interface AdministradoresRepo extends CrudRepository<Administrador, Integer> {
	@Query(value = "select CASE WHEN count(1) > 0 THEN 'true' ELSE 'false' END administradores where id =:id", nativeQuery = true)
	public boolean exist(int id);
	
	@Query(value = "select * from administradores where email=:email and senha=:senha", nativeQuery = true)
	public Administrador Login(String email, String senha);
}
