package com.daw.service;

import com.daw.persistence.repositories.BarcoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BarcoService {

    private final BarcoRepository barcoRepository;

}
