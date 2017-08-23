public class CountByThrees {
    public static void main(String[] args) {
        int count = 3, breakPoint = 30;
        for (int num = 3; num <= 300; num += count){
            if (num % breakPoint == 0){
                System.out.print(" " + num + "\n");
            }
            else {
                System.out.print(" " + num);
            }
        }
    }
}
