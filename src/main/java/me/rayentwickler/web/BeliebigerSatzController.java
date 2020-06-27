package me.rayentwickler.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.rayentwickler.data.NounRepository;
import me.rayentwickler.model.Noun;

@RestController
public class BeliebigerSatzController {
	@Autowired
	private NounRepository nounRepository;

	@GetMapping("/noun")
	public Iterable<Noun> allNouns() {
		System.out.println("Garbage....................");
		return nounRepository.findAll();
	}
}
