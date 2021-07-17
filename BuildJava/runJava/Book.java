class Buku{
     String judul;
     String penulis;
     
     Buku(String judul, String penulis){
         this.judul = judul;
         this.penulis = penulis;   
     }
 
     void display(){
         System.out.println("\nJudul : " + this.judul);
         System.out.println("Penulis : " + this.penulis);
     }

} 

public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Hallo Getsu Design");
        
        Buku buku1 = new Buku("Getsu Design", "Getsu");
        Buku buku2 = new Buku("Design", "Getsu");
        buku1.display();
        buku1.judul = "Koding";
        buku1.display();
        buku2.display();
        
       //Menampilkan address
       String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
       System.out.println(addressBuku1);

       String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
       System.out.println(addressBuku2);
    }
    
}
