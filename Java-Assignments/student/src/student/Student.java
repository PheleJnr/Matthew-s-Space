package student;

public class Student {
    private final int MIN_GRADE_LEVEL = 1;
    private final int MAX_GRADE_LEVEL = 12;
    private final int PASS_SCORE = 50;

    private String name;
    private int gradeLevel;

    public Student(String name, int gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
        validateGradeLevel();
    }

    public String getName() {
        return name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    private void validateGradeLevel() {
        if (gradeLevel < MIN_GRADE_LEVEL) {
            throw new IllegalArgumentException("Invalid grade level");
        } else if (gradeLevel > MAX_GRADE_LEVEL) {
            throw new IllegalArgumentException("Invalid grade level");
        }
    }

    public String introduce() {
        String message = String.format("Hi, I'm %s and I'm in grade %d.", name, gradeLevel);
        System.out.println(message);
        return message;
    }

    public void promote() {
        if (gradeLevel >= MAX_GRADE_LEVEL) {
            throw new IllegalArgumentException("Student is already in the final grade level");
        }
        gradeLevel += 1;
    }

    public boolean hasPassed(int score) {
        return score >= PASS_SCORE;
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public boolean isGraduating() {
        return gradeLevel == MAX_GRADE_LEVEL;
    }
}
