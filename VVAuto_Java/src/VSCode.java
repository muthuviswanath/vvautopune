public class VSCode {

    void clickButton(){
        Button openButton = new Button("Open");
        openButton.click();
    }

    public static void main(String[] args) {
        VSCode code = new VSCode();
        code.clickButton();
    }
    
}

class Button{
    String name;
    Button(String name){
        this.name = name;
    }

    void click(){
        System.out.println(name + " button clicked");
    }
}