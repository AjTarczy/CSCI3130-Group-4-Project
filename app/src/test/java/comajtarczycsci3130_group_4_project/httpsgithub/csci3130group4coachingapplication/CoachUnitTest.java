package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by robertnickerson on 2018-03-07.
 */

public class CoachUnitTest
{
    Coach testCoach = new Coach();

    Athlete testAthlete = new Athlete();

    @Test
    public void addGetAthleteIsCorrect()
    {
        testCoach.addAthlete(testAthlete);

        assertTrue(testCoach.getAthletes().contains(testAthlete));
    }

    @Test
    public void removeAthleteIsCorrect()
    {
        testAthlete.setUsername("test");
        testCoach.addAthlete(testAthlete);
        testCoach.removeAthlete(testAthlete);

        assertFalse(testCoach.getAthletes().contains(testAthlete));
    }
}
