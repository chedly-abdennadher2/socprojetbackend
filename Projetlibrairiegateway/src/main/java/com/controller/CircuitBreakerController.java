package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CircuitBreakerController {

@GetMapping("/defaultadherent/")
public Map<String, String> adherent() {
	 Map<String, String> data = new HashMap<>();
	data.put("id_adherent", "0");
	data.put("nom","default");
	data.put("prenom","default");

return data;
}
}
