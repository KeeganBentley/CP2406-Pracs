public class Student {
    private int idNum;
    private CollegeCourse[] subjects = new CollegeCourse[4];

    //Constructor
    Student(int id){
        this.idNum = id;
    }

    //Methods
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
    public int getIdNum() {
        return idNum;
    }
    public void setSubject(int position, CollegeCourse subject){
        this.subjects[position] = subject;
    }
    public CollegeCourse getSubject(int position){
        return this.subjects[position];
    }
    public String getString(){
        return "Student no.: " + this.idNum + "\nSubjects:\n" + this.subjects[0].getString() + "\n"
                + this.subjects[1].getString() + "\n" + this.subjects[2].getString() + "\n"
                + this.subjects[3].getString();
    }
}
