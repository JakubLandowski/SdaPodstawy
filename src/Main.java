public class Main {
    //TODO

    public static void main(String[] args) {
        System.out.print("Hello world\n");
        System.out.println("BBbbBBbbBB");

        int b = 5;
        int a = 10;
        int c = Main.sum(a,b);

        System.out.println(a + "+" + b + "=" + c);
    }

     public static int sum(int a, int b){
        int c = a+b;
        return c;
    }
}