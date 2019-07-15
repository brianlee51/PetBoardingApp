package sg.edu.rp.c346.petboardingapp;

import java.io.Serializable;

public class Details implements Serializable {
    private String name;
    private String type;
    private String date;
    private int days;
    private boolean vaccinated;

    public Details(String name, String type, String date, int days, boolean vaccinated) {
        this.name = name;
        this.type = type;
        this.date = date;
        this.days = days;
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Details{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", days=" + days +
                ", vaccinated=" + vaccinated +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
