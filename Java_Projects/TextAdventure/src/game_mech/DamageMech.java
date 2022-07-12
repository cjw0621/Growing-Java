package game_mech;

public class DamageMech {

    /*
     * TODO: Create a player_builder combat sequence that takes account of player_builder AC (use d20 to determine if player_builder hits or misses)
     *   with proficiency bonus as well as spell damages.
     */

    private int crit;

    protected static int randInt(int max){
        return (int) Math.floor(Math.random()*(max-2)+1);
    }

   public DamageMech(){
       this.setCrit(crit);
   }

   private void setCrit(int crit){
       this.crit = crit;
   }

   //Incorporates critical strike (150% of players damage). Set at 11% probability of critical hit.
   //Returns 1 if crit was a success. Returns 0 if crit was not successful.
    public static int getCrit(){
        if(DamageMech.randInt( 100) <= 11){
            return 1;
        } return 0;
    }

    //Method overloading to incorporate players' crit bonus. Defaults at 11% probability of critical hit.
    //Returns 1 if crit was a success. Returns 0 if crit was not successful.
    public static int getCrit(int bonus){
        if(DamageMech.randInt(100) <= 11 + bonus){
            return 1;
        } return 0;
    }


    public static int damage(int dice){
        return getCrit(dice) + dice;//Add proficiency
    }

}
