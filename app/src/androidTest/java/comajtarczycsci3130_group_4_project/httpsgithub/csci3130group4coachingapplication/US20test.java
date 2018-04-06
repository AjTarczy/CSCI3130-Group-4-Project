package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

/**
 * Created by Gashin on 2/27/2018.
 */

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest


//update for new version of ListOfAthletes
public class US20test {


    @Rule
    public IntentsTestRule<Athletes> intentsTestRule =
            new IntentsTestRule<>(Athletes.class);


    @Test
    public void Button1_IsWorking() {
        onView(withId(R.id.button5)).perform(click());
        intended(hasComponent(Statistics.class.getName()));
    }

    @Test
    public void Button2_IsWorking() {
        onView(withId(R.id.button7)).perform(click());
        intended(hasComponent(Statistics.class.getName()));
    }

    @Test
    public void Button3_IsWorking() {
        onView(withId(R.id.button11)).perform(click());
        intended(hasComponent(Statistics.class.getName()));
    }

    @Test
    public void Button4_IsWorking() {
        onView(withId(R.id.button13)).perform(click());
        intended(hasComponent(Statistics.class.getName()));
    }

    @Test
    public void Button5_IsWorking() {
        onView(withId(R.id.button15)).perform(click());
        intended(hasComponent(Statistics.class.getName()));
    }

    @Test
    public void Button6_IsWorking() {
        onView(withId(R.id.button6)).perform(click());
        intended(hasComponent(plans.class.getName()));
    }

    @Test
    public void Button7_IsWorking() {
        onView(withId(R.id.button10)).perform(click());
        intended(hasComponent(plans.class.getName()));
    }

    @Test
    public void Button8_IsWorking() {
        onView(withId(R.id.button12)).perform(click());
        intended(hasComponent(plans.class.getName()));
    }

    @Test
    public void Button9_IsWorking() {
        onView(withId(R.id.button14)).perform(click());
        intended(hasComponent(plans.class.getName()));
    }

    @Test
    public void Button10_IsWorking() {
        onView(withId(R.id.button16)).perform(click());
        intended(hasComponent(plans.class.getName()));
    }

    @Test
    public void textviews_IsWorking() {
        onView(withId(R.id.textView2))
                .check(matches(isDisplayed()));
        onView(withId(R.id.textView8))
                .check(matches(isDisplayed()));
        onView(withId(R.id.textView9))
                .check(matches(isDisplayed()));
        onView(withId(R.id.textView10))
                .check(matches(isDisplayed()));
        onView(withId(R.id.textView11))
                .check(matches(isDisplayed()));
    }





}