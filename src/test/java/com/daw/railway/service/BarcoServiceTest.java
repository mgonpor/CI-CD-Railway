package com.daw.railway.service;

import com.daw.persistence.entities.Barco;
import com.daw.persistence.repositories.BarcoRepository;
import com.daw.service.BarcoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class BarcoServiceTest {

    private BarcoRepository barcoRepository;
    private BarcoService barcoService;

    @BeforeEach
    void setup() {
        this.barcoRepository = mock(BarcoRepository.class);
        this.barcoService = new BarcoService(this.barcoRepository);
    }

    @Test
    void testFindAll() {
        //Given
        Barco b1 = this.createBarco();

        //When
        when(this.barcoRepository.findAll()).thenReturn(List.of(b1));
        List<Barco> result = this.barcoService.findAll();

        //Then
        assertNotNull(result);
        verify(this.barcoRepository).findAll();
        assertEquals(b1.getNombre(), result.getFirst().getNombre());
    }

    @Test
    void testFindByIdOk() {
        Barco b1 = this.createBarco();

        when(this.barcoRepository.findById(b1.getId())).thenReturn(Optional.of(b1));
        Barco result = this.barcoService.findById(b1.getId());

        assertNotNull(result);
        verify(this.barcoRepository).findById(b1.getId());
        assertEquals(b1.getNombre(), result.getNombre());
    }

    @Test
    void testSaveOk() {
        Barco b1 = this.createBarco();

        when(this.barcoRepository.save(b1)).thenReturn(b1);
        Barco result = this.barcoService.save(b1);

        assertNotNull(result);
        verify(this.barcoRepository).save(b1);
        assertEquals(b1.getNombre(), result.getNombre());
    }

    private Barco createBarco(){
        Barco b1 = new Barco();

        b1.setId(0);
        b1.setNombre("Slice of Life");
        b1.setUsuario("Desconocido");

        return b1;
    }

}
