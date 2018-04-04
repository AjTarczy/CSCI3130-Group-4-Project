package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.widget.ListView;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.anything;

/**
 * Created by Jessi on 2018-03-30.
 */

public class PlansTest {

    @Rule
    public IntentsTestRule<plans> intentsTestRule = new IntentsTestRule<>(plans.class);

    @Test
    public void createPlanTest() {
        onView(withId(R.id.create)).perform(click());
        intended(hasComponent(CreatePlan.class.getName()));
    }

    @Test
    public void clickPlanTest(){
        onData(anything()).inAdapterView(withId(R.id.planList)).atPosition(0).perform(click());
        intended(hasComponent(CreatePlan.class.getName()));
    }
}

