import java.util.Scanner;

public class program_1 {
//    double value;
    public void calculate(double a, double b, String adde){
        if (adde.equals("+"))
        {System.out.println(a+b);}
        else if (adde.equals("-"))
        {System.out.println(a-b);}
        else if (adde.equals("/"))
        {System.out.println(a/b);}
        else if (adde.equals("*"))
        {System.out.println(a*b);}

    }

    public static void main(String[]args){


        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        double a = input.nextDouble();
        input.nextLine();
        System.out.println("enter the operation");
        String adde = input.nextLine();
        System.out.println("enter the number");
        double b = input.nextDouble();

        program_1 store = new program_1();
        store.calculate(a,b,adde);



    }
}
