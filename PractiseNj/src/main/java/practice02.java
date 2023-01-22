public class practice02 {

    public void getName(String nam){
        System.out.println("name is :>"+nam);
    }


    public static void main(String[] args){
        practice02 pr2=new practice02();
        pr2.getName("Nikhil");
        for(int i =0;i<5;i++){
            pr2.getName("Nj Qa");
        }
    }
}
