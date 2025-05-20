import java.util.Scanner;

public class program_2 {

    public static void main(String[] args){

        program_2 xseries = new program_2();
        Scanner get = new Scanner(System.in);
        System.out.println("enter the series number");
        int input = get.nextInt();

        int inp = input;
        int num = -1;
        for (int i =1; i<=inp;i++){
            num++;
            System.out.print(i+num);

        }
    }
}
