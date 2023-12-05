package com.example.demo.controller;


import com.example.demo.entity.Appareil;
import com.example.demo.service.AppareilService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AppareilController {

    private final AppareilService appareilService;


    @GetMapping("/Appareil/findAll")
    public List<Appareil> findAll() {
        return appareilService.findAll();
    }

    @PostMapping("/Appareil/save")
    public <S extends Appareil> S save(@RequestBody S entity) {
        return appareilService.save(entity);
    }


    @GetMapping("/Appareil/find_id/{id}")
    public Optional<Appareil> findById(@PathVariable Long id) {
        return appareilService.findById(id);
    }


    @DeleteMapping("/Appareil/delete")
    public void delete(@RequestBody Appareil entity) {
        appareilService.delete(entity);
    }

    @PostMapping("/Appareil/toggleState/{id}")
    public ResponseEntity<Appareil> toggleState(@PathVariable Long id){
        return appareilService.toggleState(id);
    }
}
