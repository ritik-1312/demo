package com.test.dao;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class DaoImpl implements Dao {
	@PersistenceContext
	EntityManager et;
}
