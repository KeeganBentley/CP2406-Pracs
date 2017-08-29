import java.time.LocalDate;

/**
 * Created by jc374181 on 23/08/17.
 */
public class FitnessTrackerTest {
    public static void main(String[] args) {
        FitnessTracker a = new FitnessTracker();
        FitnessTracker b = new FitnessTracker(10, "walking", LocalDate.now());
        System.out.println(a.getActivityName() + " " + a.getTimeParticipating() + " " + a.getDateCompleted());
        System.out.println(b.getActivityName() + " " + b.getTimeParticipating() + " " + b.getDateCompleted());
    }
}
