class gunut{
      private String nama;
      private int umur;
      private int beratBadan;
      public String pemilik;

      public gunut(String nama, int umur, int beratBadan, String pemilik){
           this.nama = nama;
           this.umur = umur;
           this.beratBadan = beratBadan;
           this.pemilik = pemilik;

      } 

      public void display(){
           System.out.println("Hallow");
           System.out.println("Nama saya : " + nama);
           System.out.println("Umur saya : " + umur);
           System.out.println("Berat badan saya : " + beratBadan);
           System.out.println("Majikan Saya : " + pemilik);

      }




}

public class kucing{

	public static void main(String[] args){

       System.out.println("Hallo Getsu dan Gunut");

       gunut kucingGunut = new gunut("Gunut",3,5,"Getsu");

       kucingGunut.display();

	}


}