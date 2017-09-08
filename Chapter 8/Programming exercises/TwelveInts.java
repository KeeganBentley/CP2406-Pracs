public class TwelveInts {
    public static void main(String[] args) {
        int x;
        int[] intList = {1,2,3,4,5,6,7,8,9,10,11,12};
        for (int num: intList){
            System.out.print(num + " ");
        }
        System.out.println();
        for (x = 11; x >= 0; x--){
            System.out.print(intList[x] + " ");
        }
    }
}
