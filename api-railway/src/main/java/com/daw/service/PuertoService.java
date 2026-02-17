package com.daw.service;

import com.daw.persistence.entities.Puerto;
import com.daw.persistence.repositories.PuertoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PuertoService {

    private final PuertoRepository puertoRepository;

}
