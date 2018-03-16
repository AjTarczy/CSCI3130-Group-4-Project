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
 * Created by Lisa on 3/16/2018.
 */

public class US13test
{
    @Rule
    public IntentsTestRule<manageCoach> intentsTestRule = new IntentsTestRule<>(manageCoach.class);

    /**
     * this is the test to make sure text view are shown
     */
    @Test
    public void TextView_IsWorking()
    {
        onView(withId(R.id.request1)).check(matches(isDisplayed()));
        onView(withId(R.id.request2)).check(matches(isDisplayed()));
        onView(withId(R.id.request3)).check(matches(isDisplayed()));
        onView(withId(R.id.athleteInfo1)).check(matches(isDisplayed()));
        onView(withId(R.id.athleteInfo2)).check(matches(isDisplayed()));
        onView(withId(R.id.athleteInfo3)).check(matches(isDisplayed()));
        onView(withId(R.id.athleteInfo4)).check(matches(isDisplayed()));
        onView(withId(R.id.athleteInfo5)).check(matches(isDisplayed()));
    }
    /**
     * This is the test to make sure  buttons work well.
     */
    @Test
    public void Button_AreWorking()
    {
        onView(withId(R.id.requestReject1)).check(matches(withText(("Reject"))));
        onView(withId(R.id.requestReject2)).check(matches(withText(("Reject"))));
        onView(withId(R.id.requestReject3)).check(matches(withText(("Reject"))));
        onView(withId(R.id.requestAccept1)).check(matches(withText(("Accept"))));
        onView(withId(R.id.requestAccept2)).check(matches(withText(("Accept"))));
        onView(withId(R.id.requestAccept3)).check(matches(withText(("Accept"))));
        onView(withId(R.id.athleteDelete1)).check(matches(withText(("Delete"))));
        onView(withId(R.id.athleteDelete2)).check(matches(withText(("Delete"))));
        onView(withId(R.id.athleteDelete3)).check(matches(withText(("Delete"))));
        onView(withId(R.id.athleteDelete4)).check(matches(withText(("Delete"))));
        onView(withId(R.id.athleteDelete5)).check(matches(withText(("Delete"))));
    }



}
