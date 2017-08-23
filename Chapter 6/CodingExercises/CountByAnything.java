import java.util.Scanner;
public class CountByAnything {
    public static void main(String[] args) {
        int count;
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to count by?");
        count = input.nextInt();

        for (int num = 0; num <= count*100; num += count){
            for (int x = 0; x < 10; ++x){
                if (num == count*100 + count){
                    break;
                }
                else{
                    System.out.print("" + num + " ");
                    num = num + count;
                }
            }
            System.out.print("\n");
        }
    }
}
