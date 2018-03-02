package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import java.util.ArrayList;

/**
 * Created by robertnickerson on 2018-03-02.
 */

public class Coach extends User
{
    private ArrayList<Athlete> athletes;


    public Coach()
    {

    }

    /**
     * return this coaches list of athletes
     * @return
     */
    public ArrayList<Athlete> getAthletes()
    {
        return athletes;
    }

    /**
     * add an athlete to this coach's list of athletes
     * @param athlete
     */
    public void addAthlete(Athlete athlete)
    {
        athletes.add(athlete);
    }

    /**
     * remove an athlete with a specific username from this coach's list
     * @param athlete
     */

    public void removeAthlete(Athlete athlete)
    {
        for (int i = 0; i < athletes.size(); i++)
        {
            if (athlete.getUsername().equals(athletes.get(i).getUsername()))
            {
                athletes.remove(i);
            }
        }
    }

}
