package game_mech;

public class SpellCasting {
   public static class UnholyLight extends SpellCastingAbst{

       public int getLevel(){return 1;}
       public int getManaRequired(){return 5;}
        @Override
        public int getDamage(String npcName) {
            int D20 = DiceClass.ROLL_DICE("d20");
            int D6 = DiceClass.ROLL_DICE("d6");
            if (D20 == 20) {
                return 2 * (D6);//Add player_builder intelligence modifier
            } else if(D20 == 1){
                return 0;
            } else {
                return D6;
            }
        }
        public String getName(){return "Unholy Light";}
        public String getDescription(){return "When casted, you emit a 10x10 wide dark beam from your hands that does critical " +
                "damage to holy entities. V/S";}
    }


}
