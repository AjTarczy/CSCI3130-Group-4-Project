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
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class US4test {


    @Rule
    public IntentsTestRule<Dashboard> intentsTestRule =
            new IntentsTestRule<>(Dashboard.class);


    @Test
    public void Button1_IsWorking() {
        onView(withId(R.id.button)).perform(click());
        intended(hasComponent(editProfile.class.getName()));
    }

    @Test
    public void Button2_IsWorking() {
        onView(withId(R.id.button2)).perform(click());
        intended(hasComponent(plans.class.getName()));
    }

    @Test
    public void Button3_IsWorking() {
        onView(withId(R.id.button3)).perform(click());
        intended(hasComponent(manageCoach.class.getName()));
    }

    @Test
    public void Button4_IsWorking() {
        onView(withId(R.id.button4)).perform(click());
        intended(hasComponent(StatisticsPage.class.getName()));
    }


}