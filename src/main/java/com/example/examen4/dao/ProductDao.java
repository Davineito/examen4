package com.example.examen4.dao;

//paso 2 <"Consistencia" interactuar con la entidad product>
//CrudRepository >> 4 operaciones basicas:  Update, Delate, New, crated

import com.example.CrudTest.entities.Product;
import org.springframework.data.repository.CrudRepository;

//                                                           v tipo de Id q identifica Product
public interface ProductDao extends CrudRepository<Product, Long> {

}

