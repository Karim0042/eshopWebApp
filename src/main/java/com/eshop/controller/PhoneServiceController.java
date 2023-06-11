package com.eshop.controller;

import com.eshop.dao.PhoneRepository;
import com.eshop.dto.PhoneDTO;
import com.eshop.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eshop.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("phones")
public class PhoneServiceController {
    @Autowired
    PhoneRepository phoneRepository;

    @GetMapping("/{color}")
    public ResponseEntity<List> findByColor(@PathVariable("color") String color) {
        List<Phone> list = phoneRepository.getAllByColor(color);
        List<PhoneDTO> PhoneDTOS = new ArrayList<>();
        for (Phone p : list) {
            PhoneDTOS.add(new PhoneDTO(p));
        }
        return ResponseEntity.ok(PhoneDTOS);

    }
    @GetMapping("/")
    public ResponseEntity<List> findAll(){
        List<Phone> list =phoneRepository.findAll();
        List<PhoneDTO> PhoneDTOS = new ArrayList<>();
        for (Phone p : list) {
            PhoneDTOS.add(new PhoneDTO(p));
        }
        return ResponseEntity.ok(PhoneDTOS);
    }

}
