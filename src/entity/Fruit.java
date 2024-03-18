package entity;

/**
 * 水果类
 */
public abstract class Fruit {

    //无参构造
    public Fruit() {
    }

    public Fruit(String name, double price, double discount, double weight) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.weight = weight;
    }

    public Fruit(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Fruit(String name) {
        this.name = name;
    }

    //水果名
    String name;
    //价格(每斤)
    double price;

    //打折,默认不打折(打一折为0.1，两折为0.2)
    double discount = 1;

    //买了多少斤水果,默认0
    double weight = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSumPrice() {
        return price * weight * discount;
    }
}
