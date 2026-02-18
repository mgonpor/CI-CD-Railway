package com.daw.web;

import com.daw.persistence.entities.Barco;
import com.daw.service.BarcoService;
import com.daw.service.exceptions.BarcoNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barcos")
@RequiredArgsConstructor
public class BarcoController {

    private final BarcoService barcoService;

    @GetMapping
    public ResponseEntity<List<Barco>> listBarcos() {
        return ResponseEntity.ok(this.barcoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findBarcoById(@PathVariable int id) {
        try{
            return ResponseEntity.ok(this.barcoService.findById(id));
        }catch(BarcoNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<Barco> save(@RequestBody Barco barco) {
        return ResponseEntity.ok(this.barcoService.save(barco));
    }

}
