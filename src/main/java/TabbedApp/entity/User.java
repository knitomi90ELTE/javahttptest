package TabbedApp.entity;

import java.sql.Date;

public class User {

    Integer id;
    String first_name;
    String last_name;
    Date birth_date;

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
}
