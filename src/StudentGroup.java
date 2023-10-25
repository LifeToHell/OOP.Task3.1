public class StudentGroup {

    private String StudentGroupId;
    private String quantityStudents;

    private String teacher;

    public StudentGroup(String studentGroupId, String quantityStudents, String teacher) {
        this.StudentGroupId = studentGroupId;
        this.quantityStudents = quantityStudents;
        this.teacher = teacher;
    }

    public String getStudentGroupId() {
        return StudentGroupId;
    }

    public void setStudentGroupId(String studentGroupId) {
        StudentGroupId = studentGroupId;
    }

    public String getQuantityStudents() {
        return quantityStudents;
    }

    public void setQuantityStudents(String quantityStudents) {
        this.quantityStudents = quantityStudents;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "StudentGroupId='" + StudentGroupId + '\'' +
                ", quantityStudents=" + quantityStudents +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
