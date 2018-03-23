package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

/**
 * Created by Jessi on 2018-02-21.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Spinner;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
public class StatisticsPage extends AppCompatActivity {

    MyApplicationData appState;
    private TextView tvTasksCompleted;
    private TextView tvCaloriesBurned;
    private TextView tvDistanceTraveled;
    private TextView tvChangeInDistanceTraveled;
    private Spinner spinTimeMeasurement;


    //create database reference
    final FirebaseDatabase database = FirebaseDatabase.getInstance();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //required lines of code for the override
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_page);
        appState = (MyApplicationData)getApplicationContext();
        tvTasksCompleted = (TextView) findViewById(R.id.tvTasksCompleted);
        tvCaloriesBurned = (TextView) findViewById(R.id.tvCaloriesBurned);
        tvDistanceTraveled = (TextView) findViewById(R.id.tvDistanceTraveled);
        tvDistanceTraveled = (TextView) findViewById(R.id.tvDistanceTraveled);
        tvChangeInDistanceTraveled = (TextView) findViewById(R.id.tvChangeInDistanceTraveled);
        spinTimeMeasurement = (Spinner) findViewById(R.id.spinTimeMeasurement);


        setTasksCompleted("Today");
        setCaloriesBurned("Today");
        setDistanceTraveled("Today");
        setChangedInDistanceTraveled("Today");
    }

    public static int getTotalDailyTasks() {
        return 3;
    }

    public static int getTotalWeeklyTasks() {
        return 3;
    }

    public static int getTotalMonthlyTasks() {
        return 3;
    }

    public static int getTotalAllTimeTasks() {
        return 3;
    }

    public static int getCompletedDailyTasks() {
        return 3;
    }

    public static int getCompletedWeeklyTasks() {
        return 3;
    }

    public static int getCompletedMonthlyTasks() {
        return 3;
    }

    public static int getCompletedAllTimeTasks() {
        return 3;
    }

    public static double getDailyCalsBurned() {
        return 3;
    }

    public static double getWeeklyCalsBurned() {
        return 3;
    }

    public static double getMonthlyCalsBurned() {
        return 3;
    }

    public static double getAllTimeCalsBurned() {
        return 3;
    }

    public static double calculateCalsBurned(String lstrSex, int lintAge, double ldubWeight,
                                             double lintTimeSpentExercising) {

        double ldubAgeConst = 0, ldubWeightConst = 0, ldubHeartRateConst = 0,
                ldubTimeSpentExercisingConst = 0, ldubConstant = 0;

        if (lstrSex.equalsIgnoreCase("male")) {
            ldubAgeConst = 0.2017;
            ldubWeightConst = 0.09036;
            ldubHeartRateConst = 120 * 0.6309;
            ldubTimeSpentExercisingConst = 4.184;
            ldubConstant = 55.0969;
        } else if (lstrSex.equalsIgnoreCase("female")) {
            ldubAgeConst = 0.074;
            ldubWeightConst = 0.05741;
            ldubHeartRateConst = 120 * 0.4472;
            ldubTimeSpentExercisingConst = 4.184;
            ldubConstant = 20.4022;
        }

        double result = Math.round(((lintAge * ldubAgeConst) + (ldubWeight * ldubWeightConst) + (ldubHeartRateConst -
                ldubConstant)) * (lintTimeSpentExercising / ldubTimeSpentExercisingConst)*100.0)/100.0;

        return result;
    }

    public static double getDailyDistanceRan() {
        return 3;
    }

    public static double getWeeklyDistanceRan() {
        return 3;
    }

    public static double getMonthlyDistanceRan() {
        return 3;
    }

    public static double getAllTimeDistanceRan() {
        return 3;
    }

    public static double getDailyTimeSpentRunning() {
        return 3;
    }

    public static double getWeeklyTimeSpentRunning() {
        return 3;
    }

    public static double getMonthlyTimeSpentRunning() {
        return 3;
    }

    public static double getAllTimeTimeSpentRunning() {
        return 3;
    }

    public static double getDistanceRanYesterday() {
        return 3;
    }

    public static double getDistanceRanLastWeek() {
        return 3;
    }

    public static double getDistanceRanLastMonth() {
        return 3;
    }

    public static double getComparedDistanceTodayVsYesterday() {
        double result = getDailyDistanceRan() / getDistanceRanYesterday();
        return Math.round(result * 100.0) / 100.0;
    }

    public static double getComparedDistanceThisWeekVsLastWeek() {
        double result = getWeeklyDistanceRan() / getDistanceRanLastWeek();
        return Math.round(result * 100.0) / 100.0;
    }

    public static double getComparedDistanceThisMontVsLastMonth() {
        double result = getMonthlyDistanceRan() / getDistanceRanLastMonth();
        return Math.round(result * 100.0) / 100.0;
    }

    public void setTasksCompleted(String timeMeasurement) {
        //Today, This Week, This Month, All Time
        if (timeMeasurement.equals("Today")) {
            tvTasksCompleted.setText("You have completed " + getCompletedDailyTasks() + " / " + getTotalDailyTasks() +
                    " tasks for " + timeMeasurement + ".");
        } else if (timeMeasurement.equals("This Week")) {
            tvTasksCompleted.setText("You have completed " + getCompletedWeeklyTasks() + " / " + getTotalWeeklyTasks() +
                    " tasks for " + timeMeasurement + ".");
        } else if (timeMeasurement.equals("This Month")) {
            tvTasksCompleted.setText("You have completed " + getCompletedMonthlyTasks() + " / " + getTotalMonthlyTasks() +
                    " tasks for " + timeMeasurement + ".");
        } else if (timeMeasurement.equals("All Time")) {
            tvTasksCompleted.setText("You have completed " + getCompletedAllTimeTasks() + " / " + getTotalAllTimeTasks() +
                    " tasks since you started using this app.");
        }

    }

    public void setCaloriesBurned(String timeMeasurement) {
        if (timeMeasurement.equals("Today")) {
            tvCaloriesBurned.setText("You have burned " + getDailyCalsBurned() + " today.");
        } else if (timeMeasurement.equals("This Week")) {
            tvCaloriesBurned.setText("You have burned " + getWeeklyCalsBurned() + " this week.");
        } else if (timeMeasurement.equals("This Month")) {
            tvCaloriesBurned.setText("You have burned " + getMonthlyCalsBurned() + " this month.");
        } else if (timeMeasurement.equals("All Time")) {
            tvCaloriesBurned.setText("You have burned " + getAllTimeCalsBurned() + " since you started " +
                    "using this app.");
        }


    }

    public void setDistanceTraveled(String timeMeasurement) {
        if (timeMeasurement.equals("Today")) {
            tvDistanceTraveled.setText("You have traveled " + getDailyDistanceRan() + "m in " + getDailyTimeSpentRunning() +
                    " minutes today.");
        } else if (timeMeasurement.equals("This Week")) {
            tvDistanceTraveled.setText("You have traveled " + getWeeklyDistanceRan() + "m in " + getWeeklyTimeSpentRunning() +
                    " minutes this week.");
        } else if (timeMeasurement.equals("This Month")) {
            tvDistanceTraveled.setText("You have traveled " + getMonthlyDistanceRan() + "m in " + getMonthlyTimeSpentRunning() +
                    " minutes this month.");
        } else if (timeMeasurement.equals("All Time")) {
            tvDistanceTraveled.setText("You have traveled " + getAllTimeDistanceRan() + "m in " + getAllTimeTimeSpentRunning() +
                    " since you started using this app.");
        }

    }

    public void setChangedInDistanceTraveled(String timeMeasurement) {
        double ldubCurrentDistance; //keeps track of distance traveled for current measurement
        double ldubPastDistance; //keeps track of the past distance for that measurement
        double ldubTravelDelta; //keeps track of the change between the two above variables
        if (timeMeasurement.equals("Today")) {
            ldubCurrentDistance = getDailyDistanceRan();
            ldubPastDistance = getDistanceRanYesterday();

            if (ldubCurrentDistance > ldubPastDistance) {
                ldubTravelDelta = (ldubCurrentDistance / ldubPastDistance);
                tvChangeInDistanceTraveled.setText("You have traveled " + ldubTravelDelta + "% more then yesterday.");
            } else if (ldubCurrentDistance < ldubPastDistance) {
                ldubTravelDelta = 1 - (ldubCurrentDistance / ldubPastDistance);
                tvChangeInDistanceTraveled.setText("You have traveled " + ldubTravelDelta + "% less then yesterday.");
            } else if (ldubCurrentDistance == ldubPastDistance) {
                tvChangeInDistanceTraveled.setText("You have traveled the same distance as yesterday.");
            }


        } else if (timeMeasurement.equals("This Week")) {
            ldubCurrentDistance = getWeeklyDistanceRan();
            ldubPastDistance = getDistanceRanLastWeek();

            if (ldubCurrentDistance > ldubPastDistance) {
                ldubTravelDelta = (ldubCurrentDistance / ldubPastDistance);
                tvChangeInDistanceTraveled.setText("You have traveled " + ldubTravelDelta + "% more then last week.");
            } else if (ldubCurrentDistance < ldubPastDistance) {
                ldubTravelDelta = 1 - (ldubCurrentDistance / ldubPastDistance);
                tvChangeInDistanceTraveled.setText("You have traveled " + ldubTravelDelta + "% less then last week.");
            } else if (ldubCurrentDistance == ldubPastDistance) {
                tvChangeInDistanceTraveled.setText("You have traveled the same distance as last week.");
            }
        } else if (timeMeasurement.equals("This Month")) {
            ldubCurrentDistance = getMonthlyDistanceRan();
            ldubPastDistance = getDistanceRanLastMonth();

            if (ldubCurrentDistance > ldubPastDistance) {
                ldubTravelDelta = (ldubCurrentDistance / ldubPastDistance);
                tvChangeInDistanceTraveled.setText("You have traveled " + ldubTravelDelta + "% more then last month.");
            } else if (ldubCurrentDistance < ldubPastDistance) {
                ldubTravelDelta = 1 - (ldubCurrentDistance / ldubPastDistance);
                tvChangeInDistanceTraveled.setText("You have traveled " + ldubTravelDelta + "% less then last month.");
            } else if (ldubCurrentDistance == ldubPastDistance) {
                tvChangeInDistanceTraveled.setText("You have traveled the same distance as last month.");
            }
        } else if (timeMeasurement.equals("All Time")) {
            tvChangeInDistanceTraveled.setText("");
        }


    }
}




