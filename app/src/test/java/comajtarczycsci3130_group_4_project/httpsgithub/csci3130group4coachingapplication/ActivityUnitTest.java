package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by robertnickerson on 2018-03-09.
 */

public class ActivityUnitTest {

    Activity testActivity = new Activity();

    String testString;
    int testInt;
    boolean testBoolean;

    @Test
    public void setGetIDAreCorrect()
    {
        testInt = 1;

        testActivity.setID(testInt);

        assertEquals(testInt, testActivity.getID());
    }

    @Test
    public void setGetCompletedAreCorrect()
    {
        testBoolean = true;

        testActivity.setCompleted(testBoolean);

        assertEquals(testBoolean, testActivity.isCompleted());
    }

    @Test
    public void setGetDescriptionAreCorrect()
    {
        testString = "test";

        testActivity.setDescription(testString);

        assertEquals(testString, testActivity.getDescription());
    }

    @Test
    public void setGetDateAreCorrect()
    {
        testString = "test";

        testActivity.setDate(testString);

        assertEquals(testString, testActivity.getDate());
    }
}
