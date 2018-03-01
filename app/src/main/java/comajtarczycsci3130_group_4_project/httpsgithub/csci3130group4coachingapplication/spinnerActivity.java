package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.app.Activity;
import android.widget.AdapterView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;
/**
 * Created by Aj on 2/28/2018.
 */

public class spinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {

    private TextView tvTasksCompleted = (TextView) findViewById(R.id.tvTasksCompleted);
    private TextView tvCaloriesBurned = (TextView) findViewById(R.id.tvCaloriesBurned);
    private TextView tvDistanceTraveled = (TextView) findViewById(R.id.tvDistanceTraveled);
    private TextView tvChangeInDistanceTraveled = (TextView) findViewById(R.id.tvChangeInDistanceTraveled);
    private Spinner spinTimeMeasurement = (Spinner) findViewById(R.id.spinTimeMeasurement);

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        String lstrTimeMeasurement = spinTimeMeasurement.getSelectedItem().toString();

        if (lstrTimeMeasurement.equals("Today")){
            setTasksCompleted(lstrTimeMeasurement);
            setCaloriesBurned(lstrTimeMeasurement);
            setDistanceTraveled(lstrTimeMeasurement);
            setChangedInDistanceTraveled(lstrTimeMeasurement);
        }

        else if (lstrTimeMeasurement.equals("This Week")){
            setTasksCompleted(lstrTimeMeasurement);
            setCaloriesBurned(lstrTimeMeasurement);
            setDistanceTraveled(lstrTimeMeasurement);
            setChangedInDistanceTraveled(lstrTimeMeasurement);
        }

        else if (lstrTimeMeasurement.equals("This Month")){
            setTasksCompleted(lstrTimeMeasurement);
            setCaloriesBurned(lstrTimeMeasurement);
            setDistanceTraveled(lstrTimeMeasurement);
            setChangedInDistanceTraveled(lstrTimeMeasurement);
        }

        else if (lstrTimeMeasurement.equals("All Time")){
            setTasksCompleted(lstrTimeMeasurement);
            setCaloriesBurned(lstrTimeMeasurement);
            setDistanceTraveled(lstrTimeMeasurement);
            setChangedInDistanceTraveled(lstrTimeMeasurement);
        }

    }

    public void onNothingSelected(AdapterView<?> parent) {
        // do nothing, as nothing changes
    }
    public void setTasksCompleted(String timeMeasurement) {
        //Today, This Week, This Month, All Time
        if (timeMeasurement.equals("Today")) {
            tvTasksCompleted.setText("You have completed " + StatisticsPage.getCompletedDailyTasks() + " / " + StatisticsPage.getTotalDailyTasks() +
                    " tasks for " + timeMeasurement + ".");
        } else if (timeMeasurement.equals("This Week")) {
            tvTasksCompleted.setText("You have completed " + StatisticsPage.getCompletedWeeklyTasks() + " / " + StatisticsPage.getTotalWeeklyTasks() +
                    " tasks for " + timeMeasurement + ".");
        } else if (timeMeasurement.equals("This Month")) {
            tvTasksCompleted.setText("You have completed " + StatisticsPage.getCompletedMonthlyTasks() + " / " + StatisticsPage.getTotalMonthlyTasks() +
                    " tasks for " + timeMeasurement + ".");
        } else if (timeMeasurement.equals("All Time")) {
            tvTasksCompleted.setText("You have completed " + StatisticsPage.getCompletedAllTimeTasks() + " / " + StatisticsPage.getTotalAllTimeTasks() +
                    " tasks since you started using this app.");
        }

    }

    public void setCaloriesBurned(String timeMeasurement) {
        if (timeMeasurement.equals("Today")) {
            tvCaloriesBurned.setText("You have burned " + StatisticsPage.getDailyCalsBurned() + " today.");
        } else if (timeMeasurement.equals("This Week")) {
            tvCaloriesBurned.setText("You have burned " + StatisticsPage.getWeeklyCalsBurned() + " this week.");
        } else if (timeMeasurement.equals("This Month")) {
            tvCaloriesBurned.setText("You have burned " + StatisticsPage.getMonthlyCalsBurned() + " this month.");
        } else if (timeMeasurement.equals("All Time")) {
            tvCaloriesBurned.setText("You have burned " + StatisticsPage.getAllTimeCalsBurned() + " since you started " +
                    "using this app.");
        }


    }

    public void setDistanceTraveled(String timeMeasurement) {
        if (timeMeasurement.equals("Today")) {
            tvDistanceTraveled.setText("You have traveled " + StatisticsPage.getDailyDistanceRan() + "m in " + StatisticsPage.getDailyTimeSpentRunning() +
                    " minutes today.");
        } else if (timeMeasurement.equals("This Week")) {
            tvDistanceTraveled.setText("You have traveled " + StatisticsPage.getWeeklyDistanceRan() + "m in " + StatisticsPage.getWeeklyTimeSpentRunning() +
                    " minutes this week.");
        } else if (timeMeasurement.equals("This Month")) {
            tvDistanceTraveled.setText("You have traveled " + StatisticsPage.getMonthlyDistanceRan() + "m in " + StatisticsPage.getMonthlyTimeSpentRunning() +
                    " minutes this month.");
        } else if (timeMeasurement.equals("All Time")) {
            tvDistanceTraveled.setText("You have traveled " + StatisticsPage.getAllTimeDistanceRan() + "m in " + StatisticsPage.getAllTimeTimeSpentRunning() +
                    " since you started using this app.");
        }

    }

    public void setChangedInDistanceTraveled(String timeMeasurement) {
        double ldubCurrentDistance; //keeps track of distance traveled for current measurement
        double ldubPastDistance; //keeps track of the past distance for that measurement
        double ldubTravelDelta; //keeps track of the change between the two above variables
        if (timeMeasurement.equals("Today")) {
            ldubCurrentDistance = StatisticsPage.getDailyDistanceRan();
            ldubPastDistance = StatisticsPage.getDistanceRanYesterday();

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
            ldubCurrentDistance = StatisticsPage.getWeeklyDistanceRan();
            ldubPastDistance = StatisticsPage.getDistanceRanLastWeek();

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
            ldubCurrentDistance = StatisticsPage.getMonthlyDistanceRan();
            ldubPastDistance = StatisticsPage.getDistanceRanLastMonth();

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
