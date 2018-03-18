package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.support.test.espresso.intent.rule.IntentsTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Gashin on 3/18/2018.
 */

public class us11test {

    @Rule
    public IntentsTestRule<manageCoach> intentsTestRule =
            new IntentsTestRule<>(manageCoach.class);

    /**
     * this is the test to make sure text view are shown
     */
    @Test
    public void TextView_IsWorking() {
        onView(withId(R.id.addCoach)).check(matches(isDisplayed()));
        onView(withId(R.id.coach1)).check(matches(isDisplayed()));
        onView(withId(R.id.coach2)).check(matches(isDisplayed()));
        onView(withId(R.id.coach3)).check(matches(isDisplayed()));
        onView(withId(R.id.coach4)).check(matches(isDisplayed()));
        onView(withId(R.id.coach5)).check(matches(isDisplayed()));
    }
    /**
     * This is the test to make sure  buttons work well.
     */
    @Test
    public void ButtonS_AreWorking() {
        onView(withId(R.id.addCoach))
                .check(matches(withText(("Request"))));
        onView(withId(R.id.coachDelete1))
                .check(matches(withText(("Delete"))));
        onView(withId(R.id.coachDelete2))
                .check(matches(withText(("Delete"))));
        onView(withId(R.id.coachDelete3))
                .check(matches(withText(("Delete"))));
        onView(withId(R.id.coachDelete4))
                .check(matches(withText(("Delete"))));
        onView(withId(R.id.coachDelete5))
                .check(matches(withText(("Delete"))));

    }
}
