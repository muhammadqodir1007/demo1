package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
@AllArgsConstructor
public class HelloController {

    lalaRep lalaRep;


    @GetMapping
    public List<LalaEn> getS() {
        return lalaRep.findAll();
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody LalaEn lalaEn) {
        LalaEn save = lalaRep.save(lalaEn
        );

        return ResponseEntity.ok(save);
    }
}
