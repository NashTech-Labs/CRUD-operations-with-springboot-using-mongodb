package com.example.crudoperationwithmongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The type Student.
 */
@Document(collection = "students")
public class Student {
    private int id;
    private String name;
    private String city;
    private String college;

    /**
     * Instantiates a new Student.
     *
     * @param id      the id
     * @param name    the name
     * @param city    the city
     * @param college the college
     */
    public Student(int id, String name, String city, String college) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.college = college;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets college.
     *
     * @return the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * Sets college.
     *
     * @param college the college
     */
    public void setCollege(String college) {
        this.college = college;
    }
}
