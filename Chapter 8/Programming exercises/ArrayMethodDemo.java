public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] intList = {2, 10, 35, 23, 78, 32, 46, 112, 2, 45};
        final int LESSTHAN = 40;
        displayAll(intList);
        displayReverse(intList);
        displaySum(intList);
        displayLessThan(intList, LESSTHAN);
        displayHigherThanMean(intList);
    }
    public static void displayAll(int intList[]) {
        for (int num: intList){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void displayReverse(int intList[]){
        int x;
        int length = intList.length;
        for (x=length-1; x>=0; --x){
            System.out.print(intList[x] + " ");
        }
        System.out.println();
    }
    public static void displaySum(int intList[]){
        int sum=0;
        for (int num: intList){
            sum += num;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
    public static void displayLessThan(int intList[], int lessThan){
        for (int num: intList){
            if (num < lessThan){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void displayHigherThanMean (int intList[]){
        double average;
        int sum = 0;
        for (int num: intList){
            sum += num;
        }
        average = sum / intList.length;
        for (int num: intList){
            if (num > average){
                System.out.print(num + " ");
            }
        }
    }
}
