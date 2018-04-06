package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import java.util.ArrayList;

/**
 * Created by robertnickerson on 2018-03-02.
 */

public class Coach extends User
{
    private ArrayList<String> athletes;
    private ArrayList<String> Requests;


    public Coach()
    {

    }

    public Coach(String username, String email, String password, String firstName, String lastName, String dob, double height, double weight, String gender, String role)
    {
        super(username, email, password, firstName, lastName, dob, height, weight, gender, role);
        this.athletes.add("not emty");
        this.Requests.add("not emty");

    }

    /**
     * return this coaches list of athletes
     * @return
     */
    public ArrayList<String> getAthletes()
    {
        return athletes;
    }

    /**
     * return this coaches list of requests
     * @return
     */

    public ArrayList<String> getRequests()
    {
        return Requests;
    }

    /**
     * add an athlete to this coach's list of athletes
     * @param athlete
     */
    public void addAthlete(String athlete)
    {
        athletes.add(athlete);
    }

    /**
     * remove an athlete with a specific username from this coach's list
     * @param athlete
     */

    public void removeAthlete(String athlete)
    {
        for (int i = 0; i < athletes.size(); i++)
        {

            if (athlete.equals(athletes.get(i)))
            {
                athletes.remove(i);
            }
        }
    }

    public void IgnoreRequest(String athlete)
    {
        for (int i = 0; i < Requests.size(); i++)
        {
            if (athlete.equals(Requests.get(i)))
            {
                Requests.remove(i);
            }
        }
    }

    public void AcceptRequest(String athlete)
    {
        for (int i = 0; i < Requests.size(); i++)
        {
            if (athlete.equals(Requests.get(i)))
            {
                athletes.add(athlete);
                Requests.remove(i);
            }
        }
    }
}
