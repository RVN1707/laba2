package Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Psychic extends SpecialMove {
    public Psychic() {
        this.type = Type.PSYCHIC;
        this.power = 90.0;
        this.accuracy = 100.0;
        this.priority = 10;
    }

    protected void applyOppDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, (int)Math.round(damage));
    }

    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }

    }

    protected String describe() {
        return "применил Attacks.Psychic";
    }
}
