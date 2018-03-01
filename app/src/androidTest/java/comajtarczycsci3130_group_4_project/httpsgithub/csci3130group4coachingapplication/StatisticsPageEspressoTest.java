package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
/**
 * Created by Jessi on 2018-02-28.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class StatisticsPageEspressoTest {

    @Rule
    public ActivityTestRule<StatisticsPage> statisticsPageRule = new ActivityTestRule<>(StatisticsPage.class);

    @Test
    public void checkTodayStats(){}

    @Test
    public void checkThisWeekStats(){}

    @Test
    public void checkThisMonthStats(){}

    @Test
    public void checkAllTimeStats(){}

}
