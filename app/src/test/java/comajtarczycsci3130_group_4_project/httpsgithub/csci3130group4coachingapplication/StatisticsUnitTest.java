package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jessi on 2018-02-16.
 */

public class StatisticsUnitTest {

    @Test
    public void dailyTotalTasks(){
        assertEquals(3, StatisticsPage.getTotalDailyTasks());
    }

    @Test
    public void weeklyTotalTasks(){
        assertEquals(3, StatisticsPage.getTotalWeeklyTasks());
    }

    @Test
    public void monthlyTotalTasks(){
        assertEquals(3, StatisticsPage.getTotalMonthlyTasks());
    }

    @Test
    public void allTimeTotalTasks(){
        assertEquals(3, StatisticsPage.getTotalAllTimeTasks());
    }

    @Test
    public void dailyCompletedTasks(){
        assertEquals(3, StatisticsPage.getCompletedDailyTasks());
    }

    @Test
    public void weeklyCompletedTasks(){
        assertEquals(3, StatisticsPage.getCompletedWeeklyTasks());
    }

    @Test
    public void monthlyCompletedTasks(){
        assertEquals(3, StatisticsPage.getCompletedMonthlyTasks());
    }

    @Test
    public void allTimeCompletedTasks(){
        assertEquals(3, StatisticsPage.getCompletedAllTimeTasks());
    }


}
