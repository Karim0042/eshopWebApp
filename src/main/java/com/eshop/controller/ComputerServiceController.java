package com.eshop.controller;

import com.eshop.dao.ComputerRepository;
import com.eshop.dto.ComputerDTO;
import com.eshop.entity.Computer;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("computers")
public class ComputerServiceController {
    @Autowired
    ComputerRepository computerRepository;

    @GetMapping("/{brand}")
    public ResponseEntity<List> findAllByBrand(@PathVariable("brand") String brand) {
        List<Computer> computers = computerRepository.findAllByBrand(brand);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer c:computers) {
            computerDTOS.add(new ComputerDTO(c));
        }
        return ResponseEntity.ok(computerDTOS);
    }
    @GetMapping("/ram/{ram}")
    public ResponseEntity<List> findByRam(@PathVariable(value="ram") Integer ram) {
        List<Computer> computers = computerRepository.findAllByRam(ram);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer c:computers) {
            computerDTOS.add(new ComputerDTO(c));
        }
        return ResponseEntity.ok(computerDTOS);
    }
 @GetMapping("/color/{color}")
    public ResponseEntity<List> findByColor(@PathVariable("color") String color) {
        List<Computer> computers = computerRepository.findAllByColor(color);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer c:computers) {
            computerDTOS.add(new ComputerDTO(c));
        }
        return ResponseEntity.ok(computerDTOS);
    }
}
