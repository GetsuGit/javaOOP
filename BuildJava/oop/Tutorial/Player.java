 class Player{
    private String name;

    Player(String name){
        this.name = name;

    }

    String getName(){
        return this.name;
    }

    void show(){
    	System.out.println("Player name : " + this.name); 

    }

}