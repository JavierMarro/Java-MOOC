package JavaMOOCI.Part6.Exercise13.src.test.java;

import org.junit.Test;

import JavaMOOCI.Part6.Exercise13.src.main.java.ExerciseManagement;

import static org.junit.Assert.*;
// Line 2, wild card to access all different tests within Assert. One can also only import the specific test needed. For example:
// import static org.junit.Assert.assertEquals; 
// import static org.junit.Assert.assertTrue; 
// import static org.junit.Assert.assertFalse; 

import org.junit.Before;

public class ExerciseManagementTest{
// It's best to refactor instead of having the same line repeated in every test (lines 21, 27 and 34)
// a new instance of ExerciseManagement is needed for each test so it's best to create a method called 'initialize' with a @Before
// This @Before needs importing and it guides the program to execute this method before each test
    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }
    @Test
    public void exerciseListEmptyAtBeginning(){
        // ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        // ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        // ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }
}
