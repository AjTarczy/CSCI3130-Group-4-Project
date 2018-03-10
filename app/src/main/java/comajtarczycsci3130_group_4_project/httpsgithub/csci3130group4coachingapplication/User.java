package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import java.io.Serializable;

/**
 * Created by robertnickerson on 2018-02-20.
 */

//class to store User data for entry into database
public class User implements Serializable {

    public String username;
    public String email;
    public String password;
    public String firstName;
    public String lastName;
    public String dob;
    public double height;
    public double weight;
    public String gender;
    public String role;

    /**
     * empty constructor
     */
    public User()
    {

    }

    /**
     * constructor
     * @param username
     * @param email
     * @param password
     * @param firstName
     * @param lastName
     * @param dob
     * @param height
     * @param weight
     * @param gender
     * @param role
     */
    public User(String username, String email, String password, String firstName, String lastName, String dob, double height, double weight, String gender, String role)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.role = role;

    }

    /**
     * returns username
     * @return string username
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * returns user email
     * @return string email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * returns user password
     * @return return string password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * return first name
     * @return string firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * return last name
     * @return string lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * return dob
     * @return string dob
     */
    public String getdob()
    {
        return dob;
    }

    /**
     * return height
     * @return double height
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * return weight
     * @return double weight
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * return gender
     * @return string gender
     */
    public String getGender()
    {
        return gender;
    }

    /**
     * return role
     * @return string role
     */
    public String getRole()
    {
        return role;
    }

    /**
     * set username
     * @param username
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * set user email
     * @param email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * set user password
     * @param password
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * set user first name
     * @param firstName
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * set user last name
     * @param lastName
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * set user dob
     * @param dob
     */
    public void setdob(String dob)
    {
        this.dob = dob;
    }

    /**
     * set user height
     * @param height
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     * set user weight
     * @param weight
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /**
     * set user gender
     * @param gender
     */
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    /**
     * set user role
     * @param role
     */
    public void setRole(String role)
    {
        this.role = role;
    }
}