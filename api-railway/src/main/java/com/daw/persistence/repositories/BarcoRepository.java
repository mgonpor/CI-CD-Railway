package com.daw.persistence.repositories;

import com.daw.persistence.entities.Barco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarcoRepository extends JpaRepository<Barco, Integer> {
}
