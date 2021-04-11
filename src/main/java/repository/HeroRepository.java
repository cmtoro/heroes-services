package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Hero;

@Repository
@Transactional
public class HeroRepository {

	@PersistenceContext
	private EntityManager em;

	@Cacheable(value = "heroes")
	public List<Hero> getHeroes() {
		return em.createQuery("FROM Hero", Hero.class).getResultList();
	}

	public Hero getHero(Integer id) {
		return em.find(Hero.class, id);
	}

}
