package name.hessenberger.tutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Uli Hessenberger on 28.01.17.
 */
@Entity
public class Character {
    private @Id @GeneratedValue Long id;
    private String name;
    private String alias;
    private Race race;

    private Character() {
    }

    public Character(String name, String alias, Race race) {
        this.name = name;
        this.alias = alias;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
