package game_mech;

public class DiceClass {

    private int d2;
    private int d3;
    private int d4;
    private int d5;
    private int d6;
    private int d8;
    private int d10;
    private int d12;
    private int d20;
    private int d100;

    private DiceClass(int d2, int d3, int d4, int d5, int d6, int d8, int d10, int d12, int d20, int d100){
        this.setD2(d2);
        this.setD3(d3);
        this.setD4(d4);
        this.setD5(d5);
        this.setD6(d6);
        this.setD8(d8);
        this.setD10(d10);
        this.setD12(d12);
        this.setD20(d20);
        this.setD100(d100);
    }

    private void setD2(int d2){
        this.d2 = DamageMech.randInt(d2);
    }
    private int getD2(){
        return this.d2;
    }

    private void setD3(int d3){
        this.d3 = DamageMech.randInt(d3);
    }
    private int getD3(){
        return this.d3;
    }

    private void setD4(int d4){
        this.d4 = DamageMech.randInt(d4);
    }
    private int getD4(){
        return this.d4;
    }

    private void setD5(int d5){
        this.d5 = DamageMech.randInt(d5);
    }
    private int getD5(){
        return this.d5;
    }

    private void setD6(int d6){
        this.d6 = DamageMech.randInt(d6);
    }
    private int getD6(){
        return this.d6;
    }

    private void setD8(int d8){
        this.d8 = DamageMech.randInt(d8);
    }
    private int getD8(){
        return this.d8;
    }

    private void setD10(int d10){
        this.d10 = DamageMech.randInt(d10);
    }
    private int getD10(){
        return this.d10;
    }

    private void setD12(int d12){
        this.d12 = DamageMech.randInt(d12);
    }
    private int getD12(){
        return this.d12;
    }

    private void setD20(int d20){
        this.d20 = DamageMech.randInt(d20);
    }
    private int getD20(){
        return this.d20;
    }

    private void setD100(int d100){
        this.d100 = DamageMech.randInt(d100);
    }
    private int getD100(){
        return this.d100;
    }

    public static int ROLL_DICE(String Which_Dice){
       DiceClass DICE = new DiceClass(DamageMech.randInt(2), DamageMech.randInt(3), DamageMech.randInt(4), DamageMech.randInt(5),
                DamageMech.randInt(6), DamageMech.randInt(8), DamageMech.randInt(10), DamageMech.randInt(12), DamageMech.randInt(20),
                DamageMech.randInt(100));
        switch (Which_Dice){
            case "d2" -> {return DICE.getD2();}
            case "d3" -> {return DICE.getD3();}
            case "d4" -> {return DICE.getD4();}
            case "d5" -> {return DICE.getD5();}
            case "d6" -> {return DICE.getD6();}
            case "d8" -> {return DICE.getD8();}
            case "d10" -> {return DICE.getD10();}
            case "d12" -> {return DICE.getD12();}
            case "d20" -> {return DICE.getD20();}
            case "d100" -> {return DICE.getD100();}

        } return -1;
    }

}
