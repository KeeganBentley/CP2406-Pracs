import javax.swing.JOptionPane;
import java.util.Arrays;

public class InputGrades {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        int x,y;
        char gradeChar;
        String idNum, courseId, gradeString;
        final int CREDIT_HOURS=3;
        final String[] POSSIBLE_GRADES = {"A","B","C","D","E","F"};
        boolean valid=false;

        for (x=0; x<2; ++x){
            idNum = JOptionPane.showInputDialog(null, ("Enter ID for Student #" + (x+1)));
            students[x] = new Student(Integer.parseInt(idNum));
            for (y=0; y<4; ++y){
                courseId = JOptionPane.showInputDialog(null, ("Enter ID for Course #" + (y+1)));
                gradeString = JOptionPane.showInputDialog(null,
                        "Enter Grade for course: " + courseId);
                gradeChar = Character.toUpperCase(gradeString.charAt(0));
                gradeString = "" + gradeChar;
                while(!valid){
                    if (Arrays.asList(POSSIBLE_GRADES).contains(gradeString)){
                        valid = true;
                    }
                    else{
                        gradeString = JOptionPane.showInputDialog(null,
                                "Invalid grade...  Enter Grade for course: " + courseId);
                        gradeChar = Character.toUpperCase(gradeString.charAt(0));
                        gradeString = "" + gradeChar;
                    }
                }
                gradeChar = gradeString.charAt(0);
                students[x].setSubject(y,new CollegeCourse(courseId,CREDIT_HOURS,gradeChar));
            }
            System.out.println(students[x].getString());
        }

    }
}

