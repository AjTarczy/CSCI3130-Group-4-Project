package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

/**
 * Created by lizzie on 2018-03-08.
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

public class US5test {


    @Rule
    public IntentsTestRule<cmainpage> intentsTestRule =
            new IntentsTestRule<>(cmainpage.class);


    @Test
    public void Button5_IsWorking() {
        onView(withId(R.id.button5)).perform(click());
        intended(hasComponent(editProfile.class.getName()));
    }

    @Test
    public void Button6_IsWorking() {
        onView(withId(R.id.button7)).perform(click());
        intended(hasComponent(manageAthlete.class.getName()));
    }

    @Test
    public void Button7_IsWorking() {
        onView(withId(R.id.button6)).perform(click());
        intended(hasComponent(ListOfAthletes.class.getName()));
    }

}