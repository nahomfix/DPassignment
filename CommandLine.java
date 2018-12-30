public class CommandLine {
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("no command line arguments passed");
        }
        else if(args.length >0){
            System.out.println(args.length + " arguments passed");
            for(int i=0 ; i<args.length ; i++){
                System.out.println("arg " + i + " : " + args[i]);
            }
        }
    }
}
