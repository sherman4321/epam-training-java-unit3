package Unit3.Student;

public class Student {
    public static final int N = 5;
    private String fullName;
    private int group;
    private int [] academicPerformance;

    public Student() {
        this.fullName = "UNKNOWN";
        this.group = 0;
        this.academicPerformance = new int[]{0, 0, 0, 0, 0};
    }

    public Student(String fullName, int group, int[] academicPerformance) {
        this.fullName = fullName;
        this.group = group;
        this.academicPerformance = academicPerformance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    public int getAcademicPerformanceElement(int i) {
        return academicPerformance[i];
    }
}
