// parent class
class Hero{
	String name;

	// method
	void display(){
		System.out.println("Name : " + this.name);
	}

}

// child class
class HeroStrength extends Hero{
    // hampa
}

class HeroIntelligent extends Hero{
    // hampa
}

public class inheriten{
 
     public static void main(String[] args){ 

     	  System.out.println("Lanjut inheriten");

     	  Hero hero1 = new Hero();
     	  hero1.name = "Getsu";
          hero1.display();

          HeroStrength hero2 = new HeroStrength();
     	  hero2.name = "Design";
          hero2.display();

          HeroIntelligent hero3 = new HeroIntelligent();
     	  hero3.name = "iki";
          hero3.display();

     }
}