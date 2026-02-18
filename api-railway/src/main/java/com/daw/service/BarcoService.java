package com.daw.service;

import com.daw.persistence.entities.Barco;
import com.daw.persistence.repositories.BarcoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BarcoService {

    private final BarcoRepository barcoRepository;

    public List<Barco> findAll() {
        return this.barcoRepository.findAll();
    }
}
