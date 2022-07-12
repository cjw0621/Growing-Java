package actor.player_builder.race_class;

public class RaceConstructor {
    private String raceName;
    private int spellSlotLevel;
    private int numberOfSpellSlots;
    private String armorProficiency;
    private String weaponProficiency;
    private String savingThrows;
    private String skills;

    public RaceConstructor(String raceName, int spellSlotLevel, int numberOfSpellSlots, String armorProficiency,
                           String weaponProficiency, String savingThrows, String skills) {
        this.setRaceName(raceName);
        this.setSpellSlotLevel(spellSlotLevel);
        this.setNumberOfSpellSlots(numberOfSpellSlots);
        this.setArmorProficiency(armorProficiency);
        this.setWeaponProficiency(weaponProficiency);
        this.setSavingThrows(savingThrows);
        this.setSkills(skills);
    }

    public void setRaceName(String raceName){
        this.raceName = raceName;
    }
    public String getRaceName() {
        return raceName;
    }

    public void setSpellSlotLevel(int spellSlotLevel) {
        this.spellSlotLevel = spellSlotLevel;
    }
    public int getSpellSlotLevel() {
        return spellSlotLevel;
    }
    public void setNumberOfSpellSlots(int numberOfSpellSlots) {
        this.numberOfSpellSlots = numberOfSpellSlots;
    }
    public int getNumberOfSpellSlots() {
        return numberOfSpellSlots;
    }
    public void setArmorProficiency(String armorProficiency) {
        this.armorProficiency = armorProficiency;
    }
    public String getArmorProficiency() {
        return armorProficiency;
    }
    public void setWeaponProficiency(String weaponProficiency) {
        this.weaponProficiency = weaponProficiency;
    }
    public String getWeaponProficiency() {
        return weaponProficiency;
    }
    public void setSavingThrows(String savingThrows) {
        this.savingThrows = savingThrows;
    }
    public String getSavingThrows() {
        return savingThrows;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public String getSkills() {
        return skills;
    }
}
