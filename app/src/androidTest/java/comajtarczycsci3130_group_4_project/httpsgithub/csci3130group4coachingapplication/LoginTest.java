package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;

/**
 * Created by robertnickerson on 2018-03-20.
 */

public class LoginTest
{


    private String username = "Rob";
    private String password = "test";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class)
    {


    };


    @Test
    public void testUsername()
    {
        onView(withId(R.id.main_username_input)).perform(typeText(username), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.main_username_input)).check(matches(withText(username)));

    }


    @Test
    public void testPassword()
    {
        onView(withId(R.id.main_password)).perform(typeText(password), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.main_password)).check(matches(withText(password)));

    }


    @Test
    public void testLogin()
    {
        ViewActions.closeSoftKeyboard();

        onView(withId(R.id.main_username_input)).perform(typeText(username), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.main_password)).perform(typeText(password), ViewActions.closeSoftKeyboard());


        onView(withId(R.id.login_button)).perform(click());

        intended(hasComponent(Dashboard.class.getName()));


    }

}


