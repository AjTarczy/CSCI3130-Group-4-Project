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

    public static double getDailyCalsBurned(){ return 3;}
    public static double getWeeklyCalsBurned(){ return 3;}
    public static double getMonthlyCalsBurned(){ return 3;}
    public static double getAllTimeCalsBurned(){ return 3;}

    public static double calculateCalsBurned(String lstrSex, int lintAge, double ldubWeight,
                                             double ldubTimeSpentExercising){

        double ldubAgeConst=0, ldubWeightConst=0, ldubHeartRateConst=0,
                ldubTimeSpentExercisingConst=0, ldubConstant=0;

        if(lstrSex.equalsIgnoreCase("male")) {
            ldubAgeConst = 0.2017;
            ldubWeightConst = 0.09036;
            ldubHeartRateConst = 120*0.6309;
            ldubTimeSpentExercisingConst = 4.184;
            ldubConstant = 55.0969;
        }

        else if(lstrSex.equalsIgnoreCase("female")){
            ldubAgeConst = 0.074;
            ldubWeightConst = 0.05741;
            ldubHeartRateConst = 120*0.4472;
            ldubTimeSpentExercisingConst = 4.184;
            ldubConstant = 20.4022;
        }

        double result = (lintAge*ldubAgeConst + ldubWeight*ldubWeightConst + ldubHeartRateConst -
                ldubConstant)*(ldubTimeSpentExercising/ldubTimeSpentExercisingConst);

        return Math.round(result * 100.0)/100.0;
    }

    public static double getDailyDistanceRan(){ return 3;}
    public static double getWeeklyDistanceRan(){ return 3;}
    public static double getMonthlyDistanceRan(){ return 3;}
    public static double getAllTimeDistanceRan(){ return 3;}

    public static double getDailyTimeSpentRunning(){ return 3;}
    public static double getWeeklyTimeSpentRunning(){ return 3;}
    public static double getMonthlyTimeSpentRunning(){ return 3;}
    public static double getAllTimeTimeSpentRunning(){ return 3;}

    public static double getDistanceRanYesterday(){return 3;}
    public static double getDistanceRanLastWeek(){return 3;}
    public static double getDistanceRanLastMonth(){return 3;}

    public static double getComparedDistanceTodayVsYesterday(){
        double result = getDailyDistanceRan()/getDistanceRanYesterday();
        return Math.round(result * 100.0)/100.0;
    }

    public static double getComparedDistanceThisWeekVsLastWeek(){
        double result = getWeeklyDistanceRan()/getDistanceRanLastWeek();
        return Math.round(result * 100.0)/100.0;
    }

    public static double getComparedDistanceThisMontVsLastMonth(){
        double result = getMonthlyDistanceRan()/getDistanceRanLastMonth();
        return Math.round(result * 100.0)/100.0;
    }

}
