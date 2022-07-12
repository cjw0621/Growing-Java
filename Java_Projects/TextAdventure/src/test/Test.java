package test;

import actor.npc.impl.FriendlyNPC;
import combat.spells.SpellBook;
import game_mech.DiceClass;
import game_mech.PlayersInput;

public class Test {
    public static PlayersInput playersInput = new PlayersInput(" ");

    public static void main(String[] args) {

        FriendlyNPC.ccGateGuard1.setChallengeRating(1);
        FriendlyNPC.ccGateGuard1.setCombatLevel(5);
        FriendlyNPC.ccGateGuard1.setArmorClass(10);


        int guardHealth = FriendlyNPC.ccGateGuard1.getHealthPoints();
        boolean player_choice = true;

        System.out.println(guardHealth);

        System.out.println("You walked up to the gate and you see 2 guards blocking the front gate to Central City.");
        System.out.println("What do you want to do?");
        System.out.println("""
                1) Talk to the guard.\s
                2) Attack the guards\s
                3) Turn back
                """);
        String ui = PlayersInput.ui.nextLine();
        playersInput.setUserInput(ui);

        if (playersInput.getUserInput().equals("1") || playersInput.getUserInput().equals("talk to the guard")) {
            System.out.println("you talked to the guard");

        } else if (playersInput.getUserInput().equals("2") || playersInput.getUserInput().equals("attack the guards")) {

            System.out.println("You begin to attack the guard.");

            while (true) {
                int playerMelee = (5 * (DiceClass.ROLL_DICE("d6"))) + 2;
                SpellBook.unholyBlitz.setDamage("d6");
                int playerMagic = (5 * SpellBook.unholyBlitz.getDamage() + 2);

                System.out.println("===============================");
                System.out.println("Do you: ");
                System.out.println("1) Melee attack");
                System.out.println("2) Magic attack");
                System.out.println("3) Run away");
                System.out.println("===============================");
                ui = PlayersInput.ui.nextLine();
                playersInput.setUserInput(ui);
                System.out.println(playersInput.getUserInput());

                if (playersInput.getUserInput().equals("1") || playersInput.getUserInput().equals(" melee attack")) {
                    if ((playerMelee) >= FriendlyNPC.ccGateGuard1.getArmorClass()) {
                        System.out.println("You struck the Gate guard for " + (playerMelee - FriendlyNPC.ccGateGuard1.getArmorClass()) + " damage");
                        guardHealth = guardHealth - (playerMelee - FriendlyNPC.ccGateGuard1.getArmorClass());
                    }else {
                        System.out.println("You missed");
                    }
                } else if (playersInput.getUserInput().equals("2") || playersInput.getUserInput().equals("magic attack")) {
                    if ((playerMagic) >= FriendlyNPC.ccGateGuard1.getArmorClass()) {
                        System.out.println("You struck the Gate guard for " + (playerMagic - FriendlyNPC.ccGateGuard1.getArmorClass()) + " damage");
                        guardHealth = guardHealth - (playerMagic - FriendlyNPC.ccGateGuard1.getArmorClass());
                    }else {
                        System.out.println("You missed");
                    }
                } else if (playersInput.getUserInput().equals("3") || playersInput.getUserInput().equals("run away")){
                    int runaway = DiceClass.ROLL_DICE("d20")%2;
                    if(runaway%2 == 0){
                        System.out.println("You have successfully escaped.");
                        break;
                    } else {
                        System.out.println("You failed to escape.");
                    }
                }

                if (guardHealth <= 0) {
                    System.out.println("The gate guard has been defeated");
                    System.out.println("Congratulations! You have gained 320 xp.");
                    break;
                }
            }
        }
        System.out.println("");
        System.out.println("**********************************************************");
        System.out.println("Thanks for playing the demo. Stay tuned for the full game.");
        System.out.println("**********************************************************");
    }
}
