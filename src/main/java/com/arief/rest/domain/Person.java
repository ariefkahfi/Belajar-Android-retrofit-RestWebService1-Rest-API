package com.arief.rest.domain;

import javax.persistence.*;

/**
 * Created by Arief on 9/10/2017.
 */
@Entity
@Table(name="person")
public class Person {


    @Id
    @Column(name="id")@GeneratedValue
    private int id;


    @Column(name="nama")
    private String nama;


    @Column(name="gender")
    private String gender;

    public Person() {
    }

    public Person( String nama, String gender) {
        this.nama = nama;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
