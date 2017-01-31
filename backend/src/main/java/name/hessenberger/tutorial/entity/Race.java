package name.hessenberger.tutorial.entity;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Uli Hessenberger on 28.01.17.
 */
public enum Race {
    HOBBIT("Hobbit"),
    WIZARD("Wizard"),
    DWARF("Dwarf"),
    ELF("Elf"),
    MAN("Man"),
    TROLL("Troll"),
    DRAGON("Dragon"),
    BIRD("Bird"),
    GOBLIN("Goblin");

    private String name;
    private static final Map<String, Race> ENUM_MAP;

    Race(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // An immutable map a String name to enum pairs. Any Map impl can be used.
    // Pattern from Joshua Bloch, Effective Java
    static {
        Map<String,Race> map = new ConcurrentHashMap<>();
        for (Race instance : Race.values()) {
            map.put(instance.getName(), instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static Race getByName(String name) {
        return ENUM_MAP.get(name);
    }
}
