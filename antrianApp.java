package queue;
public class antrianApp {
    public static void main(String[] args){
        antrian antrian = new antrian (53);
        antrian.enqueue(53);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek ());
        System.out.println("nama saya adalah indah yuni saputri");
        antrian.enqueue(70);
        antrian.display();
        System.out.println("yang diambil antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek ());
        
    }
    
}