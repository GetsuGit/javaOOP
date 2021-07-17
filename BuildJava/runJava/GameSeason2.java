class Player{
    
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isAlive; 

    //ini adalah objek member
    private Armor armor;
    private Weapon weapon;

	public Player(String name){
		this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
	} 
 
    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }


	public void display(){
        System.out.println("\nPlayer : " + this.name);
        System.out.println("Level : " + this.level);
        System.out.println("Health : " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Attack : " + this.getAttackPower());
        System.out.println("Alive : " + this.isAlive);

	}

    public void attack(Player opponent){
       // hitung damage
       int damage = this.getAttackPower();
       // print even
       System.out.println("\nPlayer : " + this.name + " is attacking " + opponent.getName() + " with " + damage);
       opponent.defence(damage);

       this.levelUp();
    }

    public void defence(int damage){
       
       // receive damage
       int defencePower = this.armor.getDefencePower();
       int deltaDamage; 

       System.out.println(this.name + " defence power = "+ defencePower); 
       

       if(damage > defencePower){
           deltaDamage = damage - defencePower;
       } else {
           deltaDamage = 0;
       }

       System.out.println("Damage earned : " + deltaDamage + "\n");

       // adding total damage
       this.totalDamage += deltaDamage;

       // check is alive
       if (this.getHealth() <= 0){
          this.isAlive = false;
          this.totalDamage = this.maxHealth();
       }

       this.display();
    }

    public int getAttackPower(){
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }

    public void levelUp(){
    	this.level++;
    }

	public void setArmor(Armor armor){
		this.armor = armor;
	}
    
    public void setWeapon(Weapon weapon){
    	this.weapon = weapon;
    }


    public int maxHealth(){
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddHealth();

   }

}

class Weapon{
     private String name;
     private int attack;

     public Weapon(String name, int attack){
     	 this.name = name;
     	 this.attack = attack;
    }

   public int getAttack(){
   	    return this.attack;
    }

}

class Armor{
    private String name;
    private int strength;
    private int health;
   

     public Armor(String name, int strength, int health){
         this.name = name;
         this.strength = strength;
         this.health = health;
    }
    
    public int getAddHealth(){
    	return this.strength*10 + this.health;
    } 

    public int getDefencePower(){
        return this.strength * 2;
    }

}

public class GameSeason2 {
	
	public static void main(String[] args){

       System.out.println("Hallo Getsu");
       Player player1 = new Player("Kanda");
       Armor armor1 = new Armor("Baju Basi",5,100);
       Weapon weapon1 = new Weapon("Pedang",10);
       

       player1.setArmor(armor1);
       player1.setWeapon(weapon1);

       Player player2 = new Player("Suganda");
       Armor armor2 = new Armor("Baju Basi",5,100);
       Weapon weapon2 = new Weapon("Pedang",10);
       

       player2.setArmor(armor2);
       player2.setWeapon(weapon2);

       player1.display();
       player2.display();
       // player1.baseHealth = 10; private tidak bisa di akses
       // player1.levelUp();
       // player1.display();
       
       player1.attack(player2);
       player2.attack(player1);
       player2.attack(player1);
       player2.attack(player1);
    
	}
   
}