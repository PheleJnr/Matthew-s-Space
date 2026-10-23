package student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStudent {
    @Test
    public void testThatStudentAccountCanBeCreatedByNameAndGradeLevel(){
        Student student = new Student("Matthew", 5);
        assertEquals("Matthew", student.getName());
        assertEquals(5, student.getGradeLevel());
    }

    @Test
    public void testThatWhenStudentAccountIsCreated_studentGradeLevelCannotBeLessThanMinGradeLevel(){
        assertThrows(IllegalArgumentException.class, () -> new Student("Matthew", -2));
    }

    @Test
    public void testThatWhenStudentAccountIsCreated_studentGradeLevelCannotBeHigherThanMaxGradeLevel(){
        assertThrows(IllegalArgumentException.class, () -> new Student("Matthew", 14));

    }

    @Test
    public void testThatStudentGradeLevelAcceptsMinAndMaxBoundaries() {
        assertEquals(1, new Student("Matthew", 1).getGradeLevel());
        assertEquals(12, new Student("Matthew", 12).getGradeLevel());
    }

    @Test
    public void testThatWhenStudentIsCreated_StudentCanBeIntroducedByNameAndByGrade() {
        String message = new Student("Matthew", 8).introduce();
        assertTrue(message.contains("Matthew"));
        assertTrue(message.contains("8"));
    }

    @Test
    public void testThatWhenStudentIsCreated_StudentCanBePromotedUpByOneGradeLevel() {
        Student student = new Student("Matthew", 1);
        student.promote();
        assertEquals(2, student.getGradeLevel());
    }

    @Test
    public void testThatWhenStudentIsCreated_StudentCanBePromotedUpToTheFinalGradeLevel() {
        Student student = new Student("Matthew", 11);
        student.promote();
        assertEquals(12, student.getGradeLevel());
    }

    @Test
    public void testThatWhenStudentIsCreated_StudentCannotBePromotedAboveTheFinalGradeLevel() {
        Student student = new Student("Matthew", 12);
        assertThrows(IllegalArgumentException.class, student::promote);
        assertEquals(12, student.getGradeLevel());
    }

    @Test
    public void testThatWhenStudentIsCreated_StudentScoresAboveThePassScoreCanPass() {
        Student student = new Student("Matthew", 1);
        assertTrue(student.hasPassed(75));
    }

    @Test
    public void testThatWhenStudentIsCreated_StudentScoresBelowPassScoresDoesNotPass() {
        Student student = new Student("Matthew", 1);
        assertFalse(student.hasPassed(30));
    }

    @Test
    public void testThatWhenStudentIsCreated_StudentCanUpdateTheirNameToANewName() {
        Student pupil = new Student("matthew", 10);
        pupil.updateName("joshua");
        assertEquals("joshua", pupil.getName());
    }


    @Test
    public void testThatWhenStudentIsCreated_StudentInFinalGradeLevelCanGraduate() {
        Student pupil = new Student("Matthew", 12);
        assertTrue(pupil.isGraduating());
    }

    @Test
    public void testThatStudentCanNotGraduateWhenNotInFinalGradeLevel() {
        Student pupil = new Student("Matthew", 11);
        assertFalse(pupil.isGraduating());
    }
}
