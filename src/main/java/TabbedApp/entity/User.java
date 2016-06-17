package TabbedApp.entity;

import java.sql.Date;

public class User {

    Integer id;
    String first_name;
    String last_name;
    Date birth_date;


    public User() { }

    public User(Integer id, String first_name, String last_name, Date birth_date) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
    }

    @Override
    public String toString() {
        return "TabbedApp.entity.User{" + "id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", birth_date=" + birth_date.toString() + "}";
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
