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
     * TextView_IsWorking() is to make sure text view are shown
     */
    @Test
    public void TextView_IsWorking()
    {
        onView(withId(R.id.request1)).check(matches(isDisplayed()));
        onView(withId(R.id.request2)).check(matches(isDisplayed()));
        onView(withId(R.id.request3)).check(matches(isDisplayed()));
        onView(withId(R.id.coachInfo1)).check(matches(isDisplayed()));
        onView(withId(R.id.coachInfo2)).check(matches(isDisplayed()));
        onView(withId(R.id.coachInfo3)).check(matches(isDisplayed()));
        onView(withId(R.id.coachInfo4)).check(matches(isDisplayed()));
        onView(withId(R.id.coachInfo5)).check(matches(isDisplayed()));
    }
    /**
     *  Button_AreWorking() is to make sure buttons work well
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
        onView(withId(R.id.coachDelete1)).check(matches(withText(("Delete"))));
        onView(withId(R.id.coachDelete2)).check(matches(withText(("Delete"))));
        onView(withId(R.id.coachDelete3)).check(matches(withText(("Delete"))));
        onView(withId(R.id.coachDelete4)).check(matches(withText(("Delete"))));
        onView(withId(R.id.coachDelete5)).check(matches(withText(("Delete"))));
    }
}
