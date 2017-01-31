package name.hessenberger.tutorial.repository;

import name.hessenberger.tutorial.entity.Character;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Uli Hessenberger on 28.01.17.
 */
public interface CharacterRepository extends CrudRepository<Character, Long> {
}
