package com.example.pokemon_box.repository;

import com.example.pokemon_box.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/*
    Repository Layer:
    - Data access and database operations
    - Allows for custom queries and functionality
    - Method Naming Conventions:
        - findBy... : Returns matching entities
        - existsBy... : Returns boolean
        - countBy... : Returns count
        - deleteBy... : Deletes matching entities
        - See https://docs.spring.io/spring-data/jpa/reference/repositories/query-methods-details.html#repositories.query-methods.query-property-expressions
    - Query Keywords:
        - Containing
        - StartingWith
        - EndingWith
        - IgnoreCase
        - See https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
 */

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
//    // Partial Name search
//    List<Pokemon> findByNameContaining(String name);
//    // Exact Name search
//    Optional<Pokemon> findByName(String name);
//    // Exact ID Match
//    Pokemon findById(int id);
}
