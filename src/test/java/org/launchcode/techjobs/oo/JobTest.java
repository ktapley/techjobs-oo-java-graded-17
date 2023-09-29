package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
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
    public void testJobsForEquality() {
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");
        Job identicalObjectOne = new Job("Product tester", employer, location, positionType, coreCompetency);
        Job identicalObjectTwo = new Job("Product tester", employer, location, positionType, coreCompetency);

        assertNotEquals(identicalObjectOne, identicalObjectTwo);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Employer employer = new Employer("ACME");
        Location location = new Location("StL");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Java");
        Job toStringNewLine = new Job("Web Developer", employer, location, positionType, coreCompetency);
        String expected = toStringNewLine.toString();
        assertTrue(expected.startsWith(System.lineSeparator()));
        assertTrue(expected.endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");
        Job toStringTestJob = new Job("Product tester", employer, location, positionType, coreCompetency);

        String expected = System.lineSeparator() + "ID: " + toStringTestJob.getId()
                + System.lineSeparator() + "Name: " + toStringTestJob.getName()
                + System.lineSeparator() + "Employer: " + toStringTestJob.getEmployer()
                + System.lineSeparator() + "Location: " + toStringTestJob.getLocation()
                + System.lineSeparator() + "Position Type: " + toStringTestJob.getPositionType()
                + System.lineSeparator() + "Core Competency: " + toStringTestJob.getCoreCompetency()
                + System.lineSeparator();
        assertEquals(expected, toStringTestJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Employer employer = new Employer("");
        Location location = new Location("StL");
        PositionType positionType = new PositionType("");
        CoreCompetency coreCompetency = new CoreCompetency("Java");
        Job job = new Job("Web Developer", employer, location, positionType, coreCompetency);
        String expected = job.toString();
        assertEquals(expected, job.toString());
    }


}

