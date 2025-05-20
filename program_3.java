import java.util.Arrays;
import java.util.Scanner;

public class program_3 {

    public static void main(String[] args){
        Scanner Scanner =new Scanner(System.in);
        int [] series = {1,2,3,4,5,6,7,8,9};
        int [] input = new int[100];
        int [] count = new int [series.length];
        System.out.println("enter total number of input");
        int n = Scanner.nextInt();
        System.out.println("enter the elements");
        for(int i = 0; i<n; i++){
            input[i]= Scanner.nextInt();
//            System.out.println(input[i]);
        }

        for(int j =0; j<n; j++){
            for(int i=0; i<series.length;i++){
                if(input[j]%series[i]==0){
                    count[i]=count[i]+1;
                }
            }
        }
//        System.out.println(Arrays.toString(input));

        System.out.println(Arrays.toString(count));
        for (int x=0; x<series.length;x++){
            System.out.print(series[x]+ ":" +count[x] + ", ");
        }
    }
}
