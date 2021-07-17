
class Data{
     public int intPublic;
     private int intPrivate;
     private double doublePrivate;

     public Data(){
        this.intPublic = 0;
        this.intPrivate = 100;
     }  

     void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);  
     }
     
     // getter
     public int getIntPrivate(){
        return this.intPrivate;
     }


     // setter
     public void setDoublePrivate(double value){
        this.doublePrivate = value; 
     }
}
 

class lingkaran{

    private double diameter;

    lingkaran(double diameter){
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    // getter
    public double getJari2(){
        return this.diameter/2;
    } 

    // getter
    public double getLuas(){
      return 3.14*diameter*diameter/4;
    }
}

public class encapsulasi  {
	
    public static void main(String[] args){
     
     System.out.println("Encapsulasi Program");

     Data object = new Data();

    // read and write with public
     object.intPublic = 10; // write
     System.out.println("public : " + object.intPublic); // read


    // read only (GETTER)
    int number = object.getIntPrivate();
    System.out.println("Getter : "+ number);

    // Write only (SETTER)
    object.setDoublePrivate(0.150);
    object.display();

    // combine getter and setter
    lingkaran object2 = new lingkaran(8);
    System.out.println("Jari - jari : " + object2.getJari2());
    object2.setJari2(30);
    System.out.println("Jari - jari : " + object2.getJari2());
    System.out.println("Luas : " + object2.getLuas());

    } 

}