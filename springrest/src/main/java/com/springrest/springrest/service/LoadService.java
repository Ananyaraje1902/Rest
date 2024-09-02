package com.springrest.springrest.service;
import java.util.List;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springrest.entities.PayLoads;
import com.springrest.springrest.repository.LoadsRepository;

@Service
public class LoadService {

	@Autowired
	private LoadsRepository loadsRepository;
	
	public PayLoads addLoads(PayLoads payLoads) {
		payLoads.setShipperId(UUID.randomUUID().toString());
        return loadsRepository.save(payLoads);
    }
	
	public List<PayLoads> listLoads() {
        return loadsRepository.findAll();
    }
	
}
