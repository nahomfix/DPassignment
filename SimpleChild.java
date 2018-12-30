public class SimpleChild extends SimpleParent {
    @Override
    public void saySth(){
        System.out.println("Overriding parent, Hello from child...");
    }

    public static void main(String[] args){
        SimpleParent parent = new SimpleParent();
        SimpleChild child = new SimpleChild();

        parent.saySth();
        child.saySth();
    }
}
