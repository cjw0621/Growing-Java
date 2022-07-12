package combat.weapon;


public class WeaponConstructor {

     private int cost;
     private int damage;
     private int range;
     private int weight;
     private String properties;

     private WeaponConstructor(int cost, int damage, int range, int weight, String properties){
        this.setCost(cost);
        this.setDamage(damage);
        this.setRange(range);
        this.setWeight(weight);
        this.setProperties(properties);
     }

     public void setCost(int cost){
      this.cost = cost;
     }
     public int getCost(){
      return this.cost;
     }

     public void setDamage(int damage){
       this.damage = damage;
     }
     public int getDamage(){
      return this.damage;
     }

     public void setRange(int range){
      this.range = range;
     }
     public int getRange(){
      return this.range;
     }

     public void setWeight(int weight){
      this.weight = weight;
     }
     public int getWeight(){
      return this.weight;
     }

     public void setProperties(String properties){
      if(properties.equals("light") || properties.equals("finesse") || properties.equals("thrown") ||
              properties.equals("two-handed") || properties.equals("two handed") || properties.equals("versatile") ||
              properties.equals("none")){
        this.properties = properties;

      } else {
       this.properties = "none";
      }
     }
     public String getProperties(){
      return this.properties;
     }

}
