package data;

public class Coin {

    private Integer code;
    private String value;

    public Coin(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer cod) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Coin{" + "code=" + code + ", value=" + value + '}';
    }
}
