import java.util.ArrayList;

class Player{

      private static int numberOfPlayer;
      private static ArrayList<String> nameList = new ArrayList<String>();    

      private String name;

      Player(String name){
      	   this.name = name;
      	   Player.numberOfPlayer++;
      	   Player.nameList.add(this.name);
      }
 
     void show(){
         System.out.println("Player name = " + this.name);

     }

     // static method
     static void showNumberOfPlayer(){
     	   System.out.println("Number of Player : " + Player.numberOfPlayer);
     } 
     
     static ArrayList<String> getNames(){
     	return Player.nameList;  
     }
} 

class StaticMethod{

   public static void main(String[] args){

   	   System.out.println("Hallo Getsu");

   	   Player player1 = new Player("Getsu");
       Player player2 = new Player("Rifki");
       Player player3 = new Player("iki");
       Player player4 = new Player("Gunut");

       player1.show();
       //player2.show();

       Player.showNumberOfPlayer(); 
       System.out.println("Name : " + Player.getNames());

   }

}