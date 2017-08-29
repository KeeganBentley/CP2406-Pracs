/**
 * Created by jc374181 on 23/08/17.
 */
import java.time.*;
public class FitnessTracker {
    private int timeParticipating;
    private String activityName;
    private LocalDate dateCompleted;
    FitnessTracker(){
        this.timeParticipating = 1;
        this.activityName = "running";
        this.dateCompleted = LocalDate.of(2017,1,1);
    }
    FitnessTracker(int timeParticipating, String activityName, LocalDate dateCompleted){
        this.timeParticipating = timeParticipating;
        this.activityName = activityName;
        this.dateCompleted = dateCompleted;
    }
    public String getActivityName(){
        return this.activityName;
    }
    public int getTimeParticipating(){
        return this.timeParticipating;
    }
    public LocalDate getDateCompleted(){
        return this.dateCompleted;
    }
}
