public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double chance;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.chance = 0;
    }

   
    public int firstHit(Fighter foe) {
    	chance();
        if(foe.chance > 0 && foe.chance <= 5) {
        	return 1;
        }
        if(foe.chance > 5 && foe.chance <= 10){
        	return 2;
    }
		return 0;
    }
   
    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
    
    public void chance() {
    	double randomValue = Math.random() * 10;
		this.chance = (int) randomValue;
    	
    }
}
