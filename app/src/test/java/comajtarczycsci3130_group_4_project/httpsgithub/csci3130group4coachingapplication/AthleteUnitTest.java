package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by robertnickerson on 2018-03-07.
 */

public class AthleteUnitTest {

    Athlete testAthlete = new Athlete();
    Activity testActivity = new Activity();
    Coach testCoach = new Coach();

    @Test
    public void addGetActivityAreCorrect()
    {
        testAthlete.addActivity(testActivity);

        assertTrue(testAthlete.getActivities().contains(testActivity));

    }

    @Test
    public void addGetCoachesAreCorrect()
    {
        testAthlete.addCoach(testCoach);

        assertTrue(testAthlete.getCoaches().contains(testCoach));
    }

    @Test
    public void removeCoachIsCorrect()
    {
        testCoach.setUsername("test");
        testAthlete.addCoach(testCoach);
        testAthlete.removeCoach("test");

        assertFalse(testAthlete.getCoaches().contains(testCoach));
    }

    @Test
    public void removeActivityIsCorrect()
    {
        testCoach.setUsername("test");
        testAthlete.addCoach(testCoach);
        testAthlete.removeCoach("test");

        assertFalse(testAthlete.getCoaches().contains(testCoach));
    }
}
