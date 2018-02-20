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
 * Created by robertnickerson on 2018-02-20.
 */

@RunWith(AndroidJUnit4.class)
public class RegistrationTest
{
    private String test;
    @Rule
    public ActivityTestRule<RegistrationActivity> mActivityRule = new ActivityTestRule<>(RegistrationActivity.class);

    @Test
    public void testUsername()
    {
        test = "test";
        onView(withId(R.id.username_input)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.username_input)).check(matches(withText(test)));

    }


    @Test
    public void testEmail()
    {
        test = "test@test.com";
        onView(withId(R.id.email)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.email)).check(matches(withText(test)));

    }

    @Test
    public void testPassword()
    {
        test = "testP@ssword";
        onView(withId(R.id.password)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.password)).check(matches(withText(test)));

    }

    @Test
    public void testFirstName()
    {
        test = "first";
        onView(withId(R.id.first_name_input)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.first_name_input)).check(matches(withText(test)));

    }

    @Test
    public void testLastName()
    {
        test = "last";
        onView(withId(R.id.last_name_input)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.last_name_input)).check(matches(withText(test)));

    }

    @Test
    public void testDoB()
    {
        test = "1988/03/15";
        onView(withId(R.id.dob_input)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.dob_input)).check(matches(withText(test)));

    }

    @Test
    public void testHeight()
    {
        test = "150.1";
        onView(withId(R.id.height_input)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.height_input)).check(matches(withText(test)));

    }

    @Test
    public void testWeight()
    {
        test = "74.2";
        onView(withId(R.id.weight_input)).perform(typeText(test), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.weight_input)).check(matches(withText(test)));

    }

    @Test
    public void testGender()
    {
        test = "Male";

        ViewActions.closeSoftKeyboard();



        onView(withId(R.id.gender_input)).perform(click());

        onData(allOf(is(instanceOf(String.class)), is(test))).perform(click());

        onView(withId(R.id.gender_input)).check(matches(withSpinnerText(containsString(test))));

    }

    @Test
    public void testRegister()
    {
         ViewActions.closeSoftKeyboard();

        onView(withId(R.id.register_button)).perform(click());


    }

}
