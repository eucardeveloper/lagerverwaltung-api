package com.enesucar.lagerverwaltung.service;

import com.enesucar.lagerverwaltung.entity.Produkt;
import com.enesucar.lagerverwaltung.repository.ProduktRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduktService {

    @Autowired
    private ProduktRepository produktRepository;

    public List<Produkt> alleProdukteAbrufen() {
        return produktRepository.findAll();
    }

    public Produkt produktSpeichern(Produkt produkt) {
        return produktRepository.save(produkt);
    }

    public Produkt produktFinden(Long id) {
        return produktRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produkt nicht gefunden: " + id));
    }

    public void produktLoeschen(Long id) {
        produktRepository.deleteById(id);
    }


}