package com.example.demo.service;


import com.example.demo.dao.AppareilDao;
import com.example.demo.entity.Appareil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class AppareilService {

    @Autowired
    private AppareilDao appareilDao;

    public List<Appareil> findAll() {
        return appareilDao.findAll();
    }

    public <S extends Appareil> S save(S entity) {
        return appareilDao.save(entity);
    }

    public Optional<Appareil> findById(Long aLong) {
        return appareilDao.findById(aLong);
    }

    public void delete(Appareil entity) {
        appareilDao.delete(entity);
    }

    public ResponseEntity<Appareil> toggleState(Long id){
        Optional<Appareil> appareil = appareilDao.findById(id);
        if(appareil.isPresent()){
            appareil.get().setState(!appareil.get().getState());
            appareilDao.save(appareil.get());
            return ResponseEntity.ok(appareil.get());
        }
        return ResponseEntity.notFound().build();
    }
}
