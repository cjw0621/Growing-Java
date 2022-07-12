package actor.player_builder.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor

public abstract class PlayerConstructor {

    //player basic information
    private String name;
    private String race;
    private String alignment;
    private String playersClass;

    //player Information
    private int spellSlotLevel;
    private int numberOfSpellSlots;
    private int maxWeight;
    private int inventoryWeight;
    private int strengthModifier;
    private int dexterityModifier;
    private int constitutionModifier;
    private int intelligenceModifier;
    private int wisdomModifier;
    private int charismaModifier;

    //Players proficiency levels
    private int level;
    private int healthPoints;
    private int exp;
    private int proficiencyBonus;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    //Players combat levels
    private int armorClass;
    private int initiative;
    private int speed;


}

