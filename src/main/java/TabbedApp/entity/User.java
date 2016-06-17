package TabbedApp.entity;

import javafx.beans.property.SimpleStringProperty;

import java.sql.Date;

public class User {

    private Integer id;
    private String first_name;
    private String last_name;
    private Date birth_date;

    private final SimpleStringProperty p_id = new SimpleStringProperty("");
    private final SimpleStringProperty p_first_name = new SimpleStringProperty("");
    private final SimpleStringProperty p_last_name = new SimpleStringProperty("");
    private final SimpleStringProperty p_birth_date = new SimpleStringProperty("");


    public User() { }

    public User(Integer id, String first_name, String last_name, Date birth_date) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;

        setP_id(id.toString());
        setP_first_name(first_name);
        setP_last_name(last_name);
        setP_birth_date(birth_date.toString());

    }

    @Override
    public String toString() {
        return id + " " + first_name + " " + last_name + " " + birth_date;
    }

    public String getFirst_name() { return first_name; }

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


    //FX
    public String getP_id() {
        return p_id.get();
    }

    public SimpleStringProperty p_idProperty() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id.set(p_id);
    }

    public String getP_first_name() {
        return p_first_name.get();
    }

    public SimpleStringProperty p_first_nameProperty() {
        return p_first_name;
    }

    public void setP_first_name(String p_lfirst_name) {
        this.p_first_name.set(p_lfirst_name);
    }

    public String getP_last_name() {
        return p_last_name.get();
    }

    public SimpleStringProperty p_last_nameProperty() {
        return p_last_name;
    }

    public void setP_last_name(String p_last_name) {
        this.p_last_name.set(p_last_name);
    }

    public String getP_birth_date() {
        return p_birth_date.get();
    }

    public SimpleStringProperty p_birth_dateProperty() {
        return p_birth_date;
    }

    public void setP_birth_date(String p_birth_date) {
        this.p_birth_date.set(p_birth_date);
    }
}
