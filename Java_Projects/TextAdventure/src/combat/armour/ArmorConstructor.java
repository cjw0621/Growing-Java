package combat.armour;

public class ArmorConstructor {

  //TODO Overload the constructor in order to create multiple parameters, Armor color,
  //Armor defense rating, Armor specialist bonus. Change file name Armor.ArmorConstructor.


private boolean armorProficiency;
private boolean stealthDisadvantage;
private int armorClass;
private int dexModifier;
private int cost;
private int weight;
private String name;


  protected ArmorConstructor(String name, int armorClass, int cost, int dexModifier, boolean armorProficiency,
                             boolean stealthDisadvantage, int weight) {
      this.setArmorProficiency(armorProficiency);
      this.setArmorClass(armorClass);
      this.setStealthDisadvantage(stealthDisadvantage);
      this.setDexModifier(dexModifier);
      this.setCost(cost);
      this.setWeight(weight);
      this.setName(name);
  }

  public void setArmorProficiency(boolean armorProficiency){
    this.armorProficiency = armorProficiency;
  }

  public boolean getArmorProficiency(){
    return this.armorProficiency;
  }

  public void setDexModifier(int dexModifier){
    this.dexModifier = dexModifier;
  }

  public int getDexModifier(){
    return this.dexModifier;
  }

  public void setArmorClass(int armorClass){
    this.armorClass = armorClass;
  }
  public int getArmorDefense(){
    return this.armorClass;
  }

  public void setStealthDisadvantage(boolean stealthDisadvantage){
    this.stealthDisadvantage = stealthDisadvantage;
  }

  public boolean getStealthDisadvantage(){
    return this.stealthDisadvantage;
  }

  public void setCost(int cost){
    this.cost = cost;
  }
  public int getCost(){
    return this.cost;
  }

  public void setWeight(int weight){
    this.weight = weight;
  }
  public int getWeight(){
    return this.weight;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

}