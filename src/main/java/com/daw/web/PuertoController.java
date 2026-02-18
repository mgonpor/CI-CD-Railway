package com.daw.web;

import com.daw.service.PuertoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/puertos")
@RequiredArgsConstructor
public class PuertoController {

    private final PuertoService puertoService;

}
