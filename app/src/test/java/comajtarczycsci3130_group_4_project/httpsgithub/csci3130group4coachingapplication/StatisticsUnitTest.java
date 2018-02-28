package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jessi on 2018-02-16.
 */

public class StatisticsUnitTest {
/*    @BeforeClass
    public void createUser(){}
*/
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
        assertEquals(3, StatisticsPage.getDailyCalsBurned(), 0);
    }
    @Test
    public void weeklyCalsBurned(){
        assertEquals(3, StatisticsPage.getWeeklyCalsBurned(), 0);
    }
    @Test
    public void monthlyCalsBurned(){
        assertEquals(3.0, StatisticsPage.getMonthlyCalsBurned(), 0);
    }
    @Test
    public void allTimeCalsBurned(){
        assertEquals(3.0, StatisticsPage.getAllTimeCalsBurned(), 0);
    }

    @Before
    public void createMaleUserData(){
        String sex = "male";
        int age = 37;
        double weight = 197;
        double time = 127;
    }

    @Test
    public void calculateMaleCaloriesBurned(){
        String sex = "male";
        int age = 37;
        double weight = 197;
        double time = 127;
        assertEquals(1392.47, StatisticsPage.calculateCalsBurned(sex, age, weight, time), 0);
    }



    @Test
    public void calculateFemaleCaloriesBurned(){
        String sex = "female";
        int age = 37;
        double weight = 197;
        double time = 127;
        assertEquals(1436.02, StatisticsPage.calculateCalsBurned(sex, age, weight, time), 0);
    }



    //tests to check total distance ran by user in meters
    @Test
    public void dailyDistanceRan(){
        assertEquals(3.0, StatisticsPage.getDailyDistanceRan(), 0);
    }
    @Test
    public void weeklyDistanceRan(){
        assertEquals(3.0, StatisticsPage.getWeeklyDistanceRan(), 0);
    }
    @Test
    public void monthlyDistanceRan(){
        assertEquals(3.0, StatisticsPage.getMonthlyDistanceRan(), 0);
    }
    @Test
    public void allTimeDistanceRan(){
        assertEquals(3.0, StatisticsPage.getAllTimeDistanceRan(), 0);
    }

    //tests to check amount of time user spent running in minutes
    @Test
    public void dailyTimeSpentRunning(){
        assertEquals(3.0, StatisticsPage.getDailyTimeSpentRunning(), 0);
    }
    @Test
    public void weeklyTimeSpentRunning(){
        assertEquals(3.0, StatisticsPage.getWeeklyTimeSpentRunning(), 0);
    }
    @Test
    public void monthlyTimeSpentRunning(){
        assertEquals(3.0, StatisticsPage.getMonthlyTimeSpentRunning(), 0);
    }
    @Test
    public void allTimeTimeSpentRunning(){
        assertEquals(3.0, StatisticsPage.getAllTimeTimeSpentRunning(), 0);
    }


    //tests for distance ran previously
    //tests to check amount of time user spent running in minutes
    @Test
    public void distanceRanYesterday(){
        assertEquals(3.0, StatisticsPage.getDistanceRanYesterday(), 0);
    }
    @Test
    public void distanceRanLastWeek(){
        assertEquals(3.0, StatisticsPage.getDistanceRanLastWeek(), 0);
    }
    @Test
    public void distanceRanLastMonth(){
        assertEquals(3.0, StatisticsPage.getDistanceRanLastMonth(), 0);
    }

    //tests for compared distance ran
    @Test
    public void comparedDistanceTodayVsYesterday(){
        assertEquals(1, StatisticsPage.getComparedDistanceTodayVsYesterday(), 0.001);
    }
    @Test
    public void comparedDistanceThisWeekVsLastWeek(){
        assertEquals(1, StatisticsPage.getComparedDistanceThisWeekVsLastWeek(), 0.001);
    }
    @Test
    public void comparedDistanceThisMonthVsLastMonth(){
        assertEquals(1, StatisticsPage.getComparedDistanceThisMontVsLastMonth(), 0.001);
    }

/*
    @AfterClass
    public void removeUser(){}
*/

}
