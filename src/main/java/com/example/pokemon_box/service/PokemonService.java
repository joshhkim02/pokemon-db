package com.example.pokemon_box.service;

import com.example.pokemon_box.model.Pokemon;
import com.example.pokemon_box.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
    Service Layer:
    - Business logic ONLY
    - All data transformation and processing done here
 */

@Service
public class PokemonService {
    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> getAllPokemon(){
        return pokemonRepository.findAll();
    }

    public Optional<Pokemon> getPokemonById(int pokeId) {
        return pokemonRepository.findById(pokeId);
    }
}
