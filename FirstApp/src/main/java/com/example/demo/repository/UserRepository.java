package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;
@Repository
public interface UserRepository extends CrudRepository<Product,String> {

}
