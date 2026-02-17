package com.daw.web;

import com.daw.service.BarcoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/barcos")
@RequiredArgsConstructor
public class BarcoController {

    private final BarcoService barcoService;

}
