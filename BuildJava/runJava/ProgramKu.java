class ProgramKu {
      

    
    // ini variabel global
    static String nama = "Programku ini dari variabel global";
    static String version = "1.0.0";

    static void help(){

        // ini variabel lokal
        String nama = "Program (ini dari fungsi help)";

        // mengakses variabel global di dalam fungso help()
        System.out.println("Nama dari global : " + nama);
        System.out.println("Versi dari global : " + version);
    }

     //fungsi luas persegi
    static int scorePoint(int point, int score){
        int achifment = score * point;
        return achifment;
    }

    static void ucapin(String ucapan){
        System.out.println(ucapan + " ini dari parameter ");
    }

    public static void main(String args[]){
        
        // panggil fungsi help()
        help();
        
        System.out.println("Nama: " + nama);
        System.out.println("Versi: " + version);

       //parameter ucapan
       
       ucapin("Hallo Getsu");
       ucapin("Selamat datang di pemrograman java");

       //memanggil dungsi luas
       System.out.println("Pointnya adalah : "+scorePoint(10,20));
    }

} 