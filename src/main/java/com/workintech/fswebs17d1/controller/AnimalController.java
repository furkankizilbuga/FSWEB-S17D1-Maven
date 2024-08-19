package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech/animal")
public class AnimalController {
    private Map<Integer, Animal> animals;

    @PostConstruct
    public void load() {
        this.animals = new HashMap<>();
    }

    @GetMapping("/")
    public List<Animal> getAnimals() {
        return animals.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Animal getAnimalById(@PathVariable Integer id) {
        return animals.get(id);
    }

    @PostMapping("/")
    public void addAnimal(@RequestBody Integer id,@RequestBody String name) {
        animals.put(id, new Animal(id, name));
    }

    @PutMapping("/{id}")
    public Animal update(@PathVariable Integer id,@RequestBody Integer id2) {
        animals.put(id, animals.get(id2));
        return animals.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        animals.remove(id);
    }
}
