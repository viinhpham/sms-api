package org.vinh.models;

/**
 * Author: Vinh Pham
 * Date: 03/04/2017
 * Time: 12:42
 */
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private int limiteRate;

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getLimiteRate() {
        return limiteRate;
    }

    public User setLimiteRate(int limiteRate) {
        this.limiteRate = limiteRate;
        return this;
    }
}
