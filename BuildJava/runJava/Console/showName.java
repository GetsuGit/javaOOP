// keyword import
import terminalShow;



public class showName{
	public static void main(String[] args){
		System.out.println("Hallo Getsu");

        Name player1 = new Name("Getsu");
        Name player2 = new Name("Design");
        
        player1.show();
        player2.show();

        terminalShow.log("Ok");

	}
}