package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.Espresso.onData;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by robertnickerson on 2018-03-10.
 */

@RunWith(AndroidJUnit4.class)
public class UpdateUserTest
{
    private String test;
    @Rule
    public ActivityTestRule<UpdateUser> mActivityRule = new ActivityTestRule<>(UpdateUser.class);

    @Test
    public void testUsername()
    {
        test = "test";
        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.username_update)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.username_update)).check(matches(withText(test)));

    }

    @Test
    public void testEmail()
    {
        test = "test@test.com";
        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.email_update)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.email_update)).check(matches(withText(test)));

    }

    @Test
    public void testPassword()
    {
        test = "testP@ssword";
        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.password_update)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.password_update)).check(matches(withText(test)));

    }

    @Test
    public void testFirstName()
    {
        test = "first";
        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.first_name_update)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.first_name_update)).check(matches(withText(test)));

    }

    @Test
    public void testLastName()
    {
        test = "last";
        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.last_name_update)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.last_name_update)).check(matches(withText(test)));

    }

    @Test
    public void testDoB()
    {
        test = "1988/03/15";
        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.dob_update)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.dob_update)).check(matches(withText(test)));

    }

    @Test
    public void testHeight()
    {
        test = "150.1";
        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.height_update)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.height_update)).check(matches(withText(test)));

    }

    @Test
    public void testWeight()
    {
        test = "74.2";
        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.weight_update)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.weight_update)).check(matches(withText(test)));

    }

    @Test
    public void testGender()
    {
        test = "Male";

        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.gender_update)).perform(click());

        onData(allOf(is(instanceOf(String.class)), is(test))).perform(click());

        onView(withId(R.id.gender_update)).check(matches(withSpinnerText(containsString(test))));

    }

    @Test
    public void testRole()
    {
        test = "Athlete";

        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.role_update)).check(matches(withText(test)));

        test = "Coach";

        onView(withId(R.id.role_update)).perform(click());

        onView(withId(R.id.role_update)).check(matches(withText(test)));




    }

    @Test
    public void testRegister()
    {
        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.update_button)).perform(click());


    }

}
