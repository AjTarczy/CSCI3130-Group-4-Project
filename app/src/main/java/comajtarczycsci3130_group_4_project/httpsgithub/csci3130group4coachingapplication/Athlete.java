package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import java.util.ArrayList;

/**
 * Created by robertnickerson on 2018-03-02.
 */

public class Athlete extends User
{
    private ArrayList<Activity> activities = new ArrayList<Activity>();
    private ArrayList<Coach> coaches = new ArrayList<Coach>();


    public void addActivity(Activity activity)
    {
        activities.add(activity);
    }

    public ArrayList<Activity> getActivities()
    {
        return activities;
    }

    public void addCoach(Coach coach)
    {
        coaches.add(coach);
    }

    public ArrayList<Coach> getCoaches()
    {
        return coaches;
    }

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
