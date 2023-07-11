package com.bookstore.bookStoreCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.bookStoreCrud.ebean.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String>{

}
