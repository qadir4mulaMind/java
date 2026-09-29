package entity;

public class Customer {
    private int id;
    private String name;
    private String phone;


    public Customer(int id,String phone, String name) {
        this.phone = phone;
        this.name = name;
        this.id = id;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "[Customer id: " + id + ", Name: " + name + ", Phone: " + phone + "]";
    }
}
