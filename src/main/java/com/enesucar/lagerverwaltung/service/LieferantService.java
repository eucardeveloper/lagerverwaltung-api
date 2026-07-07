package com.enesucar.lagerverwaltung.service;

import com.enesucar.lagerverwaltung.entity.Lieferant;
import com.enesucar.lagerverwaltung.repository.LieferantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LieferantService {

    @Autowired
    private LieferantRepository lieferantRepository;

    public List<Lieferant> alleLieferantenAbrufen() {
        return lieferantRepository.findAll();
    }

    public Lieferant lieferantSpeichern(Lieferant lieferant) {
        return lieferantRepository.save(lieferant);
    }

    public Lieferant lieferantFinden(Long id) {
        return lieferantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lieferant nicht gefunden: " + id));
    }

    public void lieferantLoeschen(Long id) {
        lieferantRepository.deleteById(id);
    }
}