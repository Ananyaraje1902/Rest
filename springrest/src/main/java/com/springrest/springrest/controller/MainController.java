package com.springrest.springrest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.PayLoads;
import com.springrest.springrest.service.LoadService;

@RestController
@RequestMapping("/payload")
public class MainController {

	@Autowired
	private LoadService loadService;
	
	@PostMapping("/load")
    public ResponseEntity<PayLoads> addComplaint(@RequestBody PayLoads payLoads) {
		PayLoads savedLoads = loadService.addLoads(payLoads);
        return ResponseEntity.ok(savedLoads);
    }
	
	@GetMapping("/loads")
    public ResponseEntity<List<PayLoads>> listLoads() {
        List<PayLoads> payLoads = loadService.listLoads();
        return ResponseEntity.ok(payLoads);
    }
	
}
