package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by robertnickerson on 2018-03-07.
 */

public class UserUnitTest
{
    User testUser = new User();

    String testString;
    double testDouble;

    @Test
    public void setGetUsernameAreCorrect()
    {
        testString = "user";

        testUser.setUsername(testString);

        assertEquals(testString, testUser.getUsername());
    }

    @Test
    public void setGetEmailAreCorrect()
    {
        testString = "email";

        testUser.setEmail(testString);

        assertEquals(testString, testUser.getEmail());
    }

    @Test
    public void setGetFirstNameAreCorrect()
    {
        testString = "first";

        testUser.setFirstName(testString);

        assertEquals(testString, testUser.getFirstName());
    }

    @Test
    public void setGetLastNameAreCorrect()
    {
        testString = "user";

        testUser.setLastName(testString);

        assertEquals(testString, testUser.getLastName());
    }

    @Test
    public void setGetDOBAreCorrect()
    {
        testString = "1990/01/01";

        testUser.setdob(testString);

        assertEquals(testString, testUser.getdob());
    }

    @Test
    public void setGetHeightAreCorrect()
    {
        testDouble = 175.0;

        testUser.setHeight(testDouble);

        assertEquals(testDouble, testUser.getHeight(), 0.001);
    }

    @Test
    public void setGetWeightAreCorrect()
    {
        testDouble = 75.0;

        testUser.setWeight(testDouble);

        assertEquals(testDouble, testUser.getWeight(), 0.001);
    }

    @Test
    public void setGetGenderAreCorrect()
    {
        testString = "Male";

        testUser.setGender(testString);

        assertEquals(testString, testUser.getGender());
    }

    @Test
    public void setGetRoleAreCorrect()
    {
        testString = "Coach";

        testUser.setRole(testString);

        assertEquals(testString, testUser.getRole());
    }


}
