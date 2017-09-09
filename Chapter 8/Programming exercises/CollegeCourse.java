public class CollegeCourse {
    private String courseID;
    private int creditHours;
    private char grade;

    //Constructor
    CollegeCourse(String iD, int hour, char mark){
        this.courseID = iD;
        this.creditHours = hour;
        this.grade = mark;
    }

    //Methods
    public String getCourseID() {
        return courseID;
    }
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    public String getString(){
        return "Course ID: " + this.courseID + " Credit Hours: " + this.creditHours + " Grade: " + this.grade;
    }
}
