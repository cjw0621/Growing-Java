package actor.npc;

public class NpcBuilder {

        private int challengeRating;
        private int combatLevel;
        private int armorClass;
        private int maxHealthPoints;
        private int healthPoints;
        private String name;
        private String roll;


    public NpcBuilder(int challengeRating, int combatLevel, int defaultArmorClass, int maxHealthPoints,
                      int healthPoints, String name, String roll){

        this.setChallengeRating(challengeRating);
        this.setCombatLevel(combatLevel);
        this.setArmorClass(defaultArmorClass);
        this.setMaxHealthPoints(maxHealthPoints);
        this.setHealthPoints(healthPoints);
        this.setName(name);
        this.setRoll(roll);

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setChallengeRating(int CR){
        this.challengeRating = CR;
    }

    public int getChallengeRating(){
        return this.challengeRating;
    }

    public void setCombatLevel(int CL){

        this.combatLevel = CL;
    }

    public int getCombatLevel(){
        return this.combatLevel;
    }

    //TODO create an algorythm that incorporates NPC level to set a max Armor class cap.
    public void setArmorClass(int AC){
        if(getChallengeRating() == 1){
            this.armorClass = AC;
        } else if(getChallengeRating() > 1){
            this.armorClass = getCombatLevel() + getChallengeRating() - 5;
        }
    }

    public int getArmorClass(){
        return this.armorClass;
    }

    //TODO create an algorythm that incorporates NPC level to set max health cap.
    public void setMaxHealthPoints(int maxHealthPoints){
        this.maxHealthPoints = maxHealthPoints;
        if(getChallengeRating() > 1){
            this.maxHealthPoints = maxHealthPoints + (getChallengeRating() * (3 + game_mech.DiceClass.ROLL_DICE("d8")));
        }
    }

    public int getMaxHealthPoints(){
        return this.maxHealthPoints;
    }

    public void setHealthPoints(int healthPoints){
        if(getMaxHealthPoints() == healthPoints){
            this.healthPoints = healthPoints;
        } else {
            this.healthPoints = getMaxHealthPoints();
        }
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void setRoll(String roll){
        this.roll = roll;
    }
    public String getRoll(){
        return this.roll;
    }

}
