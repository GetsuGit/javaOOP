public class Main {
    
    // membuat variabel di dalam class
    static String title = "Tutorial Anonymous Class";

    public static void main(String[] args) {
        
        // membuat variabel di dalam method main
        String name = "Petani Kode";
        
        Button btn = new Button();
        
        // membuat class anonymous untuk implemen interface
        btn.setClickAction(new Clickable() {
            // membuat variabel di dalam class anonymous
            String message = "belajar Anonymous Class di Java";
            
            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik!");
                System.out.println("Yay!");
                // mengakses variabel
                System.out.println("Hello " + name);
                System.out.println(title);
                System.out.println(message);
            }

        });
        
        // mencoba klik tombol
        btn.doClick();
        
    }
}