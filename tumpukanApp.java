package stack;
public class tumpukanApp {
     public static void main (String [] args){
    tumpukan tumpukan= new tumpukan(53);
    tumpukan.push(41);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        
        long nilai = tumpukan.peek(); // buat variabel baru (nilai) untuk dapat menyimpan nilai top dengan memanggil fungsi peek
        System.out.println("nilai Teratas = "+ nilai);
        System.out.println("Nama saya adalah indah yuni saputri");
        long nilai1 = tumpukan.pop();
        System.out.println("nilai yang dihapus = "+ nilai1);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
    
    
   
    
    
    
    
    }    
    
}