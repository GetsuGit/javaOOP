
class Name {
    private String name;

    Name(String name){
    	this.name = name;
    }
    

    void setName(String name){
    	this.name = name;
    }

    void show(){
        System.out.println("Player name = " + this.name +"\n");
        System.out.println("This is from class Name");
    }

}