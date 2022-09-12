public class calculator {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[2]);
        if(args[1].equals("+")){
            System.out.println(a+b);
        }
        else if (args[1].equals("-")){
            System.out.println(a-b);
        }
        else if (args[1].equals("x")){
            System.out.println(a*b);
        }
        else if (args[1].equals("/")){
            System.out.println(a/b);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}