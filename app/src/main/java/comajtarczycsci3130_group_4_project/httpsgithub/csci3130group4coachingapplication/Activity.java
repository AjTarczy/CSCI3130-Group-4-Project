package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

/**
 * Created by robertnickerson on 2018-03-02.
 * Class to hold data about activities assigned to Athletes
 */

public class Activity
{
    int ID;
    private boolean completed;
    private String description;
    private String date;

    public Activity()
    {

    }

    public Activity(int ID, boolean completed, String description, String date)
    {
        this.ID = ID;
        this.completed = completed;
        this.description = description;
        this.date = date;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDate()
    {
        return date;
    }

    public int getID()
    {
        return ID;
    }


}
