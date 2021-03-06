package data;

import static data.CurrencyType.RON;

public class Product {

    private Integer code;
    private String name;
    private Integer price;
    private String size;

    public Product(Integer code, String name, Integer price, String size) {
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
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
        return "Product{" + "code=" + code + ", name='" + name + '\'' + ", price=" + price + RON + ", size='" + size + '\'' + '}';

    }

}
