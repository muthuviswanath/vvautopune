
public class Beta extends Alpha {

    Beta(){
        super(10,"Test",345.56f);
    }
    
    Beta(int data, String name, float average){
        super(data, name, average);
    }
    @Override
    void show() {
        System.out.println("Welcome to the world of Java");
    }


    public static void main(String[] args) {
        Beta b = new Beta();
        b.show();
    }
    
}
