package com.example.sample1app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample1app.Person;
import java.util.List;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
  public Optional<Person> findById(Long id);
  public List<Person> findByNameLike(String name);
  public List<Person> findByIdIsNotNullOrderByIdDesc();
  public List<Person> findByAgeGreaterThan(Integer age);
  public List<Person> findByAgeBetween(Integer age1, Integer age2);
} 
