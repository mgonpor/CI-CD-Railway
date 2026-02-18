package com.daw.web;

import com.daw.persistence.entities.Barco;
import com.daw.service.BarcoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/barcos")
@RequiredArgsConstructor
public class BarcoController {

    private final BarcoService barcoService;

    public ResponseEntity<List<Barco>> listBarcos() {
        return ResponseEntity.ok(this.barcoService.findAll());
    }

}
