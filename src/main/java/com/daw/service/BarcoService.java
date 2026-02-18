package com.daw.service;

import com.daw.persistence.entities.Barco;
import com.daw.persistence.repositories.BarcoRepository;
import com.daw.service.exceptions.BarcoNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BarcoService {

    private final BarcoRepository barcoRepository;

    public List<Barco> findAll() {
        return this.barcoRepository.findAll();
    }

    public Barco findById(int id) {
        Optional<Barco> b = this.barcoRepository.findById(id);

        if (b.isEmpty()) {
            throw new BarcoNotFoundException("Barco with id " + id + " not found");
        }

        return b.get();
    }
}
