package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Hero;
import repository.HeroRepository;

@RestController
public class HeroesService {

	@Autowired
	private HeroRepository heroRepository;

	@GetMapping("/getHeroes")
	public List<Hero> getHeroes() {
		return heroRepository.getHeroes();
	}

	@GetMapping(value = "/hero/{id}")
	public Hero getHero(@PathVariable(value = "id") Integer id) {
		return heroRepository.getHero(id);
	}	

}