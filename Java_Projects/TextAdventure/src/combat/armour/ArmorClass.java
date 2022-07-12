package combat.armour;

public class ArmorClass {

    /*
     *Constructors for individual armor items.
     *
     */

    //Light armor
    public final static ArmorConstructor leather = new ArmorConstructor("Leather Armor", 11, 10,
            5,false, false, 10);
    public final static ArmorConstructor studdedLeather = new ArmorConstructor("Studded Leather", 12,45,
            0,false, false,13);
    public final static ArmorConstructor paddedArmor = new ArmorConstructor("Padded Armor", 11,5,
            0, false, true,8);

    //Medium armor
    public final static ArmorConstructor hideArmor = new ArmorConstructor("Hide Armor", 12, 0,
            0,false, false,12);

    public final static ArmorConstructor breastPlate = new ArmorConstructor("Breast Plate",14,400,
            0, false, false,20);

    public final static ArmorConstructor chainShirt = new ArmorConstructor("Chain Shirt", 13,50,
            0, false, false,20);

    public final static ArmorConstructor halfPlate = new ArmorConstructor("Half Plate",15, 750,
            0,false, true,40);

    public final static ArmorConstructor scaleMail = new ArmorConstructor("Scale Mail",14,50,
            0,false, true,45);

    //Heavy armor
    public final static ArmorConstructor ringMail = new ArmorConstructor("Ring Mail", 14, 30,
            0,false, true,40);

    public final static ArmorConstructor chainMail = new ArmorConstructor("Chain Mail", 16, 75,
            0,false, true,55);

    public final static ArmorConstructor splintArmor = new ArmorConstructor("Splint Armor",17, 200,
            0,false, true,60);

    public final static ArmorConstructor plateArmor = new ArmorConstructor("Plate Armor",18,1200,
            0, false, true,65);

    //Shield
    public final static ArmorConstructor shield = new ArmorConstructor("Shield",2,10,0,
            false, false,6);




}
