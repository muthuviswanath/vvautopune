public class Alpha {
    int data;
    String name;
    static float average;

    Alpha(int data, String name, float average){
        this.data = data;
        this.name = name;
        Alpha.average = average;

    }
    void  show(){
        System.out.println("Data: " + data);
        System.out.println("Name: " + name);
        System.out.println("Average: " + average);
    }
    static void display(){
        System.out.println("Welcome");
    }
}
