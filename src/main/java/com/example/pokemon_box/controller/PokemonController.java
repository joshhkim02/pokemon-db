package com.example.pokemon_box.controller;

import com.example.pokemon_box.model.Pokemon;
import com.example.pokemon_box.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
    Controller Layer:
    - REST endpoints
    - Basically API routing
 */

@RestController
@RequestMapping("/api")
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemon")
    public List<Pokemon> getPokemon() {
        return pokemonService.getAllPokemon();
    }

    @GetMapping("/pokemon/{id}")
    public Optional<Pokemon> getSpecificPokemon(@PathVariable int id) {
        return pokemonService.getPokemonById(id);
    }
}
