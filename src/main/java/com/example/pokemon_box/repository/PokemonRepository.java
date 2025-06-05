package com.example.pokemon_box.repository;

import com.example.pokemon_box.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    List<Pokemon> findByNameContaining(String name);
    Optional<Pokemon> findByName(String name);
    Pokemon findById(int id);
}
