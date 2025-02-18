package org.example;

import java.util.Date;

public class Championship {
    int blub_idfs;
    int id;
    int year;
    Date date_from;
    Date date_to;
    String championship;
    String city;
    String country;
    Date event_date;
    String event_time_from;
    String event_time_to;
    String event_title;

    public Championship(int blub_idfs, int id, int year, Date date_from, Date date_to, String championship, String city, String country, Date event_date, String event_time_from, String event_time_to, String event_title) {
        this.blub_idfs = blub_idfs;
        this.id = id;
        this.year = year;
        this.date_from = date_from;
        this.date_to = date_to;
        this.championship = championship;
        this.city = city;
        this.country = country;
        this.event_date = event_date;
        this.event_time_from = event_time_from;
        this.event_time_to = event_time_to;
        this.event_title = event_title;
    }

    public int getBlub_idfs() {
        return blub_idfs;
    }

    public void setBlub_idfs(int blub_idfs) {
        this.blub_idfs = blub_idfs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getDate_from() {
        return date_from;
    }

    public void setDate_from(Date date_from) {
        this.date_from = date_from;
    }

    public Date getDate_to() {
        return date_to;
    }

    public void setDate_to(Date date_to) {
        this.date_to = date_to;
    }

    public String getChampionship() {
        return championship;
    }

    public void setChampionship(String championship) {
        this.championship = championship;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getEvent_date() {
        return event_date;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }

    public String getEvent_time_from() {
        return event_time_from;
    }

    public void setEvent_time_from(String event_time_from) {
        this.event_time_from = event_time_from;
    }

    public String getEvent_time_to() {
        return event_time_to;
    }

    public void setEvent_time_to(String event_time_to) {
        this.event_time_to = event_time_to;
    }

    public String getEvent_title() {
        return event_title;
    }

    public void setEvent_title(String event_title) {
        this.event_title = event_title;
    }

    @Override
    public String toString() {
        return "Championship{" +
                "blub_idfs=" + blub_idfs +
                ", id=" + id +
                ", year=" + year +
                ", date_from=" + date_from +
                ", date_to=" + date_to +
                ", championship='" + championship + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", event_date=" + event_date +
                ", event_time_from='" + event_time_from + '\'' +
                ", event_time_to='" + event_time_to + '\'' +
                ", event_title='" + event_title + '\'' +
                '}';
    }
}
