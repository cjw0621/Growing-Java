package game_mech;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor

public abstract class SpellCastingAbst {

    private int level;
    private int damage;
    private int manaRequired;
    private String name;
    private String description;

    public abstract int getDamage(String npcName);
}
