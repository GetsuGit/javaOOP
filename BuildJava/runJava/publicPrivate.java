class Player {
    String name; //default, dibaca dan ditulis
    public int exp; //public, dia akan bisa dibaca dan ditulis 
    private int health; // dibaca dalam class
    
    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }
    
    // defautl modifier access
    void display(){
        addExp(); // tambah dari private
        System.out.println("\nName : " + this.name);
        System.out.println("Exp : " + this.exp);
        System.out.println("Health : " + this.health + " this is from private"); // membaca didalam class
    }
    
    // public
    public void setName(String newName){
        this.name = newName;
    }
    
    // private
    private void addExp(){
        this.exp += 100;
    }
}

public class publicPrivate {
    
    public static void main(String[] args){
      System.out.println("App. V.1.3");   
      
      Player player1= new Player("Guest",0,150);
      
      // default
      System.out.println(player1.name); // membaca data
      player1.name = "User"; // Menulis data
      System.out.println(player1.name); // membaca data
      
      // default
      System.out.println(player1.exp); // membaca data
      player1.exp = 100; // Menulis data
      System.out.println(player1.exp); // membaca data  
      
      // private (tidak bisa diakses)
      // System.out.println(player1.health); // membaca data
      // player1.health = 50; // Menulis data
      // System.out.println(player1.health); // membaca data
        
      // methods
      
      // default / private
      player1.display();
      
      // public
      player1.setName("The name is change");
      player1.display();
      //player1.addExp();
      
    }
     
    
}
