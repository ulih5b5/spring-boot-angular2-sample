package name.hessenberger.tutorial.util;


import name.hessenberger.tutorial.entity.Character;
import name.hessenberger.tutorial.entity.Race;
import name.hessenberger.tutorial.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Uli Hessenberger on 26.01.17.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final CharacterRepository repository;

    @Autowired
    public DatabaseLoader(CharacterRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Character("Bilbo", "The Thief", Race.HOBBIT));
        this.repository.save(new Character("Gandalf", "Olorin", Race.WIZARD));
        this.repository.save(new Character("Thorin", "", Race.DWARF));
        this.repository.save(new Character("Elrons", "", Race.ELF));
        this.repository.save(new Character("Beorn", "Skin-Changer", Race.MAN));
    }
}
