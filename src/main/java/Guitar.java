public class Guitar {

    Integer id;
    String brand;
    String type;
    Integer year;

    public Guitar(Integer id, String brand, String type, Integer year) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Guitar{" + "id=" + id + ", brand=" + brand + ", type=" + type + ", year=" + year + '}';
    }
}
