package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

/**
 * Created by Jessi on 2018-02-21.
 */

public class StatisticsPage {

    public static int getTotalDailyTasks(){ return 3;}
    public static int getTotalWeeklyTasks(){ return 3;}
    public static int getTotalMonthlyTasks(){ return 3;}
    public static int getTotalAllTimeTasks(){ return 3;}

    public static int getCompletedDailyTasks(){ return 3;}
    public static int getCompletedWeeklyTasks(){ return 3;}
    public static int getCompletedMonthlyTasks(){ return 3;}
    public static int getCompletedAllTimeTasks(){ return 3;}

    public static int getDailyCalsBurned(){ return 3;}
    public static int getWeeklyCalsBurned(){ return 3;}
    public static int getMonthlyCalsBurned(){ return 3;}
    public static int getAllTimeCalsBurned(){ return 3;}

    public static double calculateCalsBurned(String sex, int age, double weight, int time){
        double ageConst=0, weightConst=0, heartRateConst=0, timeConst=0, constant=0;

        if(sex.equalsIgnoreCase("male")) {
            ageConst = 0.2017;
            weightConst = 0.09036;
            heartRateConst = 120*0.6309;
            timeConst = 4.184;
            constant = 55.0969;
        }

        else if(sex.equalsIgnoreCase("female")){
            ageConst = 0.074;
            weightConst = 0.05741;
            heartRateConst = 120*0.4472;
            timeConst = 4.184;
            constant = 20.4022;
        }

        double result = (age*ageConst + weight*weightConst + heartRateConst - constant)*(time/timeConst);
    }
}
