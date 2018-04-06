package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import java.io.Serializable;

/**
 * Created by robertnickerson on 2018-03-02.
 * Class to hold data about activities assigned to Athletes
 */

public class Activity implements Serializable
{
    private boolean completed;
    private String description;
    private String date;
    private String id;

    /**
     * empty constructor
     */
    public Activity()
    {

    }

    /**
     * constructor
     * @param id
     * @param completed
     * @param description
     * @param date
     */
    public Activity(String id, boolean completed, String description, String date)
    {
        this.id = id;
        this.completed = completed;
        this.description = description;
        this.date = date;
    }

    /**
     * sets whether an activity has been completed
     * @param completed
     */
    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    /**
     * sets the activity description
     * @param description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * sets the date of the activity
     * @param date
     */
    public void setDate(String date)
    {
        this.date = date;
    }

    /**
     * returns whether the activity has been completed
     * @return completed boolean
     */
    public boolean isCompleted()
    {
        return completed;
    }

    /**
     * returns the activity description
     * @return activity description string
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * returns the activity date
     * @return activity date String
     */
    public String getDate()
    {
        return date;
    }

    /**
     * returns the activity id
     * @return activity id String
     */
    public String getId() { return id; }


}
