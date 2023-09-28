package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobID() {
        Job jobTest1 = new Job();
        Job jobTest2 = new Job();
        assertNotEquals(jobTest1.getId(), jobTest2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");
        Job testConstructorFields1 = new Job("Product tester", employer, location, positionType, coreCompetency);

        assertEquals("Product tester", testConstructorFields1.getName());
        assertEquals(employer, testConstructorFields1.getEmployer());
        assertEquals(location, testConstructorFields1.getLocation());
        assertEquals(positionType, testConstructorFields1.getPositionType());
        assertEquals(coreCompetency, testConstructorFields1.getCoreCompetency());

    }

    @Test
    public void testJobsForEquality(){
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");
        Job identicalObjectOne = new Job("Product tester", employer, location, positionType, coreCompetency);
        Job identicalObjectTwo = new Job("Product tester", employer, location, positionType, coreCompetency);

        assertNotEquals(identicalObjectOne, identicalObjectTwo);
    }
}

// Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class and value of each field.
// Your test should have 5 assert statements of each type.
//The instanceof keyword can be used to check the class of an object. The result of the comparison is a boolean.

