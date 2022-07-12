package shop;

import combat.armour.ArmorClass;
import game_mech.PlayersInput;

public class ArmorShop {

    final private static String[] storeListLvl1_5 = {
            ArmorClass.paddedArmor.getName() + ": " + ArmorClass.paddedArmor.getCost() + "gp",
            ArmorClass.leather.getName() + ": " + ArmorClass.leather.getCost() + "gp",
            ArmorClass.hideArmor.getName() + ": " + ArmorClass.hideArmor.getCost() + "gp",
            ArmorClass.ringMail.getName() + ": " + ArmorClass.ringMail.getCost() + "gp",
            ArmorClass.shield.getName() + ": " +  ArmorClass.shield.getCost() + "gp",
    };

    final private static String[] storeListLvl6_10 = {
            ArmorClass.paddedArmor.getName() + ": " + ArmorClass.paddedArmor.getCost() + "gp",
            ArmorClass.leather.getName() + ": " + ArmorClass.leather.getCost() + "gp",
            ArmorClass.studdedLeather.getName() + ": " + ArmorClass.studdedLeather.getCost() + "gp",
            ArmorClass.hideArmor.getName() + ": " + ArmorClass.hideArmor.getCost() + "gp",
            ArmorClass.chainShirt.getName() + ": " + ArmorClass.chainShirt.getCost() + "gp",
            ArmorClass.ringMail.getName() + ": " + ArmorClass.ringMail.getCost() + "gp",
            ArmorClass.chainMail.getName() + ": " + ArmorClass.chainMail.getCost() + "gp",
            ArmorClass.shield.getName() + ": " +  ArmorClass.shield.getCost() + "gp",
    };

    final private static String[] storeListLvl11_15 = {
            ArmorClass.paddedArmor.getName() + ": " + ArmorClass.paddedArmor.getCost() + "gp",
            ArmorClass.leather.getName() + ": " + ArmorClass.leather.getCost() + "gp",
            ArmorClass.studdedLeather.getName() + ": " + ArmorClass.studdedLeather.getCost() + "gp",
            ArmorClass.hideArmor.getName() + ": " + ArmorClass.hideArmor.getCost() + "gp",
            ArmorClass.chainShirt.getName() + ": " + ArmorClass.chainShirt.getCost() + "gp",
            ArmorClass.breastPlate.getName() + ": " + ArmorClass.breastPlate.getCost() + "gp",
            ArmorClass.scaleMail.getName() + ": " +  ArmorClass.scaleMail.getCost() + "gp",
            ArmorClass.ringMail.getName() + ": " + ArmorClass.ringMail.getCost() + "gp",
            ArmorClass.chainMail.getName() + ": " + ArmorClass.chainMail.getCost() + "gp",
            ArmorClass.splintArmor.getName() + ": " + ArmorClass.splintArmor.getCost() + "gp",
            ArmorClass.shield.getName() + ": " +  ArmorClass.shield.getCost() + "gp",
    };

    final private static String[] storeListLvl16_20 = {
            ArmorClass.paddedArmor.getName() + ": " + ArmorClass.paddedArmor.getCost() + "gp",
            ArmorClass.leather.getName() + ": " + ArmorClass.leather.getCost() + "gp",
            ArmorClass.studdedLeather.getName() + ": " + ArmorClass.studdedLeather.getCost() + "gp",
            ArmorClass.hideArmor.getName() + ": " + ArmorClass.hideArmor.getCost() + "gp",
            ArmorClass.chainShirt.getName() + ": " + ArmorClass.chainShirt.getCost() + "gp",
            ArmorClass.breastPlate.getName() + ": " + ArmorClass.breastPlate.getCost() + "gp",
            ArmorClass.scaleMail.getName() + ": " +  ArmorClass.scaleMail.getCost() + "gp",
            ArmorClass.halfPlate.getName() + ": " + ArmorClass.halfPlate.getCost() + "gp",
            ArmorClass.ringMail.getName() + ": " + ArmorClass.ringMail.getCost() + "gp",
            ArmorClass.chainMail.getName() + ": " + ArmorClass.chainMail.getCost() + "gp",
            ArmorClass.splintArmor.getName() + ": " + ArmorClass.splintArmor.getCost() + "gp",
            ArmorClass.plateArmor.getName() + ": " + ArmorClass.plateArmor.getCost()+ "gp",
            ArmorClass.shield.getName() + ": " +  ArmorClass.shield.getCost() + "gp",
    };


    public static void storeLvl1_5() {

        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for (String i : storeListLvl1_5) {
            System.out.println(i);
        }

        String userInput = PlayersInput.ui.nextLine();
        PlayersInput.shop.setUserInput(userInput);
    }

    public static void storeLvl6_10() {

        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for (String i : storeListLvl6_10) {
            System.out.println(i);
        }

        String userInput = PlayersInput.ui.nextLine();
        PlayersInput.shop.setUserInput(userInput);

    }

    public static void storeLvl11_15() {
        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for (String i : storeListLvl11_15) {
            System.out.println(i);
        }

        String userInput = PlayersInput.ui.nextLine();
        PlayersInput.shop.setUserInput(userInput);
    }

    public static void storeLvl16_20() {

        System.out.println("");
        System.out.println("Welcome adventurer!");
        System.out.println("Please, take a look at my wares and let me know if you find something you like.");
        System.out.println("");
        for (String i : storeListLvl16_20) {
            System.out.println(i);
        }
        String userInput = PlayersInput.ui.nextLine();
        PlayersInput.shop.setUserInput(userInput);
    }

}
