public class FungsiStatic {

      // fungsi non-static
	  void makan(String makanan){
	  	System.out.println("Hallo Getsu");
	  	System.out.println("Getsu makan " + makanan);
	  }


      // fungsi static
      static void minum(String minuman){
      	System.out.println("Getsu minum" + minuman);
      }

      // fungsi main
      public static void main(String[] args){
        
        // pemanggil fungsi static
        minum(" Kopi Good Day");

        // membuat instansiansi objek saya dari class FungsiStatic
        FungsiStatic saya = new FungsiStatic();
        
        // pemanggil fungsi non-static
        saya.makan(" Nasi Goreng ");  


      }

}