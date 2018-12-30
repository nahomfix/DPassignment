public class Properties {
    private String stringProperty = "stringProperty";
    private int intProperty = 100;
    private int [] intArrayProperty = {10,20};
    private String [] stringArrayProperty = {"property1" , "property2" , "property3"};
    public static void main(String[] args) {

        Properties p = new Properties();

        System.out.println("p1: " + p.stringProperty);
        System.out.println("p2: " + p.intProperty);
        System.out.println("p3: " + p.intArrayProperty[0] + " " + p.intArrayProperty[1]);
        System.out.println("p4: " + "[" + p.stringArrayProperty[0] + ", " +p.stringArrayProperty[1] + ", " + p.stringArrayProperty[2] + "]");

    }
}
