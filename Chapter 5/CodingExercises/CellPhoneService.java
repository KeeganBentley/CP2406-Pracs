import java.util.Scanner;
public class CellPhoneService {
    public static void main(String[] args) {
        int talkMinutes, texts, dataUsed;
        String planRecommendation;
        Scanner input = new Scanner(System.in);

        System.out.println("How many minutes do you spend talking on the phone per month? ");
        talkMinutes = input.nextInt();
        System.out.println("Many many texts do you send per month? ");
        texts = input.nextInt();
        System.out.println("How many Gigabytes of data do you use per month? ");
        dataUsed = input.nextInt();

        if (dataUsed == 0){
            if (talkMinutes < 500){
                if (texts > 0){
                    planRecommendation = "Plan B";
                }
                else {
                    planRecommendation = "Plan A";
                }
            }
            else {
                if (texts < 100){
                    planRecommendation = "Plan C";
                }
                else {
                    planRecommendation = "Plan D";
                }
            }
        }
        else{
            if (dataUsed < 2){
                planRecommendation = "Plan E";
            }
            else{
                planRecommendation = "Plan F";
            }
        }

        System.out.println("We recommend " + planRecommendation);
    }
}
