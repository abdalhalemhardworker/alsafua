package Entities;

public class Product {

    int id;
    String name;
    String soileType;

    public Product() {
    }

    public Product(String name, String soileType) {
        this.name = name;
        this.soileType = soileType;
    }

    public Product(int id, String name, String soileType) {
        this.id = id;
        this.name = name;
        this.soileType = soileType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoileType() {
        return soileType;
    }

    public void setSoileType(String soileType) {
        this.soileType = soileType;
    }

    

    public Object[] get_jTable_row() {
        return new Object[]{getId(), getName(), getSoileType()};
    }
}
