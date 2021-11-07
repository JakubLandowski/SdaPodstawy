import java.util.Scanner;

public class Main {
    //TODO komentarz do todo

    public static void main(String[] args) {
        /*
        System.out.print("Hello world\n");
        System.out.println("BBbbBBbbBB");

        int b = 5;
        int a = 12;

        System.out.println(a + "+" + b + "=" + Main.sum(a,b));
        System.out.println(a % b); // modulo
        */     //   method sum()

        /*String account = " Janusz Tracz ";
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
        System.out.println(Character.isDigit(A));*/     //  String and char

        /*int c=7, d=5;   // liczby do pętli logiki
        if (c>d & d==5){
            System.out.println("Wariant 1");
        }else if (c==d | c==3){
            System.out.println("Wariant 2");
        }else{
            System.out.println("Wariant 3");
        }*/     //  if()

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imię");
        String userFirstName = scanner.nextLine();
        System.out.println("Wpisz nazwisko");
        String userLastName = scanner.nextLine();
        System.out.println("Witaj "+userFirstName+" "+userLastName+"!");*/     //  Scanner

        /*int number1 = 3, number2;
        System.out.println(number1++);
        System.out.println(++number1);
        number2 = number1++;
        System.out.println(number2);
        number2 = ++number1;
        System.out.println(number2);
        System.out.println(++number2);*/     // increment

    }

     public static int sum(int a, int b){
        return a+b;
    }
}