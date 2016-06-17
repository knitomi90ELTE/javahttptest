package TabbedApp.entity;

import javafx.beans.property.SimpleStringProperty;

public class Guitar {

    private Integer id;
    private String brand;
    private String type;
    private Integer year;

    private final SimpleStringProperty p_id = new SimpleStringProperty("");
    private final SimpleStringProperty p_brand = new SimpleStringProperty("");
    private final SimpleStringProperty p_type = new SimpleStringProperty("");
    private final SimpleStringProperty p_year = new SimpleStringProperty("");


    public Guitar() {
    }

    public Guitar(Integer id, String brand, String type, Integer year) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.year = year;

        setP_id(id.toString());
        setP_brand(brand);
        setP_type(type);
        setP_year(year.toString());
    }

    @Override
    public String toString() {
        return id + " " + brand + " " + type + " " + year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getP_id() {
        return p_id.get();
    }

    public SimpleStringProperty p_idProperty() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id.set(p_id);
    }

    public String getP_brand() {
        return p_brand.get();
    }

    public SimpleStringProperty p_brandProperty() {
        return p_brand;
    }

    public void setP_brand(String p_brand) {
        this.p_brand.set(p_brand);
    }

    public String getP_type() {
        return p_type.get();
    }

    public SimpleStringProperty p_typeProperty() {
        return p_type;
    }

    public void setP_type(String p_type) {
        this.p_type.set(p_type);
    }

    public String getP_year() {
        return p_year.get();
    }

    public SimpleStringProperty p_yearProperty() {
        return p_year;
    }

    public void setP_year(String p_year) {
        this.p_year.set(p_year);
    }
}
