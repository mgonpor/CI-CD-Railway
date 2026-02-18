package com.daw.railway.service;

import com.daw.persistence.entities.Barco;
import com.daw.persistence.repositories.BarcoRepository;
import com.daw.service.BarcoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    private Barco createBarco(){
        Barco b1 = new Barco();

        b1.setId(0);
        b1.setNombre("Slice of Life");
        b1.setUsuario("Unknown2");

        return b1;
    }

}
