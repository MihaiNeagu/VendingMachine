package data;

import java.util.Map;

public class Product {

    private Integer code;
    private String name;
    private String price;
    private String size;

    public Product(Integer code, String name, String price, String size) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.size = size;

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name='" + name + '\'' + ", price=" + price + ", size='" + size + '\'' + '}';

    }

}
