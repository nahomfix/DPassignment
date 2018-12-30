public class Polymorphism {
    public static void main(String[] args){
        SimpleParent parent = new SimpleParent();
        SimpleParent child1 = new SimpleChild();
        SimpleParent child2 = new SimpleSecondChild();

        SimpleParent[] fam = {parent, child1, child2};

        for (SimpleParent x : fam){
            x.saySth();
        }
    }
}
