public class Overloading {
    public void printMsg(){
        System.out.println("Hello World");
    }

    public void printMsg(String message){
        System.out.println("Hello World " + message);
    }

    public static void main(String[] args){
        Overloading ov = new Overloading();

        ov.printMsg();
        ov.printMsg("Overloaded here...");
    }
}
