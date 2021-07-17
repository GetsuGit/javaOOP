class Player {
    
    // definisi atribut
    String name;
    int speed;
    int healthPoin;

    // definisi method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }

    // definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
    
}

public class GameRun {
    public static void main(String[] args){

        // membuat objek player
        Player player = new Player();

        // mengisi atribut player
        player.name = "Swordman";
        player.speed = 78;
        player.healthPoin = 100;

        // menjalankan method
        player.run();

        if(player.isDead()){
            System.out.println("Game Over!");
        }

    }
}