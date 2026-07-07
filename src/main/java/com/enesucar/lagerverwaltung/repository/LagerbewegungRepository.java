package com.enesucar.lagerverwaltung.repository;

import com.enesucar.lagerverwaltung.entity.Lagerbewegung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LagerbewegungRepository extends JpaRepository<Lagerbewegung, Long> {
}