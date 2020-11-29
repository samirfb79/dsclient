package com.devclient.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devclient.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria", "11111111111", 300.0, Instant.parse("2017-12-25T20:30:50Z"), 2));
		list.add(new Client(2L, "Paulo", "22222222222", 400.0, Instant.parse("2014-10-18T14:15:20Z"), 1));
		return ResponseEntity.ok().body(list);
	}

}
