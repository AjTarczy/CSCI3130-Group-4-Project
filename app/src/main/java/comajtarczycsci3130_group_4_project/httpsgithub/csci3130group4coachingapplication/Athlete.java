package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import java.util.ArrayList;

/**
 * Created by robertnickerson on 2018-03-02.
 * Class to hold data about Athletes
 */

public class Athlete extends User
{
    private ArrayList<Activity> activities = new ArrayList<Activity>();
    private ArrayList<Coach> coaches = new ArrayList<Coach>();
    private ArrayList<Coach> Requests;

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
     * return this athelete list of requests
     * @return
     */

    public ArrayList<Coach> getRequests()
    {
        return Requests;
    }


    public void IgnoreRequest(Coach coach)
    {
        for (int i = 0; i < Requests.size(); i++)
        {
            if (coach.getUsername().equals(Requests.get(i).getUsername()))
            {
                Requests.remove(i);
            }
        }
    }

    public void AcceptRequest(Coach coach)
    {
        for (int i = 0; i < Requests.size(); i++)
        {
            if (coach.getUsername().equals(Requests.get(i).getUsername()))
            {
                coaches.add(coach);
                Requests.remove(i);
            }
        }
    }

    /**
     * add a coach to the athlete's current list of coaches
     * @param coach
     */
    public void addCoach(Coach coach)
    {
        coaches.add(coach);
    }

    /**
     * return the athlete's current list of coaches
     * @return
     */
    public ArrayList<Coach> getCoaches()
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
            if (username.equals(coaches.get(i).getUsername()))
            {
                coaches.remove(i);
            }
        }

    }

    /**
     * remove an activity with a given ID from the athlete's list of activities
     * @param ID
     */
    public void removeActivity(int ID)
    {
        for (int i = 0; i < activities.size(); i++)
        {
            if (ID == activities.get(i).getID())
            {
                activities.remove(i);
            }
        }

    }



}
