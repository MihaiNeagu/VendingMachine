package data;

public class Coin {

    private Integer code;
    private Integer value;

    public Coin(Integer code, Integer value) {
        this.code = code;
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer cod) {
        this.code = code;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Coin{" + "code=" + code + ", value=" + value + '}';
    }
}