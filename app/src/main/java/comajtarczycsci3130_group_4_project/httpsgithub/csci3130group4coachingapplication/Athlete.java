package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import java.util.ArrayList;

/**
 * Created by robertnickerson on 2018-03-02.
 * Class to hold data about Athletes
 */

public class Athlete extends User
{
    private ArrayList<Activity> activities = new ArrayList<Activity>();
    private ArrayList<String> coaches = new ArrayList<String>();

    public Athlete()
    {

    }

    public Athlete(String username, String email, String password, String firstName, String lastName, String dob, double height, double weight, String gender, String role)
    {
        super(username, email, password, firstName, lastName, dob, height, weight, gender, role);
        this.coaches.add("not empty");
    }


    /**
     * add an Activity object to the athlete's list of activities
     * @param activity
     */
    public void addActivity(Activity activity)
    {
        activities.add(activity);
    }


    /**
     * return the athlete's current list of activities
     * @return activities arraylist
     */
    public ArrayList<Activity> getActivities()
    {
        return activities;
    }



    /**
     * add a coach to the athlete's current list of coaches
     * @param coach
     */
    public void addCoach(String coach)
    {
        coaches.add(coach);
    }

    /**
     * return the athlete's current list of coaches
     * @return
     */
    public ArrayList<String> getCoaches()
    {
        return coaches;
    }

    /**
     * remove a coach with a given username from the athlete's list of coaches
     * @param username
     */
    public void removeCoach(String username)
    {

        for (int i = 0; i < coaches.size(); i++)
        {
            if (username.equals(coaches.get(i)))
            {
                coaches.remove(i);
            }
        }

    }

    /**
     * remove an activity with a given ID from the athlete's list of activities
     * @param ID
     */
    //public void removeActivity(int ID)
    //{
    //    for (int i = 0; i < activities.size(); i++)
    //    {
    //        if (ID == activities.get(i).getID())
    //        {
    //            activities.remove(i);
    //        }
    //    }
    //
    //}



}
