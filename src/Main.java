public class Main {
    //TODO//komentarz do todo

    public static void main(String[] args) {
        /*
        System.out.print("Hello world\n");
        System.out.println("BBbbBBbbBB");

        int b = 5;
        int a = 12;

        System.out.println(a + "+" + b + "=" + Main.sum(a,b));
        System.out.println(a % b); // modulo
        */  //   method sum()

        String account = " Janusz Tracz ";
        System.out.println(account.length());
        System.out.println(account.indexOf('a'));
        System.out.println(account.substring(0,7));
        System.out.println(account);
        System.out.println(account.trim());

        char A = 'A';
        char alpha = '\u03B1';
        System.out.println(alpha);

        char[] hello = {'h','e','l','l','o'};
        System.out.println(hello);
        System.out.println(Character.isDigit(A));

    }

     public static int sum(int a, int b){
        return a+b;
    }
}