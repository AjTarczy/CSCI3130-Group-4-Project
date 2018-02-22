package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jessi on 2018-02-16.
 */

public class StatisticsUnitTest {

    //get total task tests
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

    //get completed task tests
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

    //calories burned tests
    @Test
    public void dailyCalsBurned(){
        assertEquals(3, StatisticsPage.getDailyCalsBurned());
    }
    @Test
    public void weeklyCalsBurned(){
        assertEquals(3, StatisticsPage.getWeeklyCalsBurned());
    }
    @Test
    public void monthlyCalsBurned(){
        assertEquals(3, StatisticsPage.getMonthlyCalsBurned());
    }
    @Test
    public void allTimeCalsBurned(){
        assertEquals(3, StatisticsPage.getAllTimeCalsBurned());
    }

 

}
