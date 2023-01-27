public class practice01 {

    static int i;
    String name ="Nikhil";
    String Nj = "Jadhav";
    public static void main(String[] args) {
        i=23;
        System.out.println("Nikhil Jadhav Here ");
        System.out.println("Hello ");
        System.out.println(" Integer i default value is :>"+i);
        i =94;
        System.out.println("i value updated :>"+i);
        practice01 pr =new practice01();
        System.out.println("non static string name is :>"+pr.name);
        System.out.println("new nj string value is :>"+pr.Nj);
        System.out.println("Hey Nikhil Jadhav");


    }
}
