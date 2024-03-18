import entity.Apple;
import entity.Fruit;
import entity.Mango;
import entity.Strawberry;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
    }

    //问题1
    public static void question1() {
        //新建每斤8元的苹果,买两斤
        Fruit app = new Apple();
        app.setName("苹果");
        app.setPrice(8);
        app.setWeight(2);
        //新建每斤13元的草莓,买两斤
        Fruit str = new Strawberry();
        str.setName("草莓");
        str.setPrice(13);
        str.setWeight(2);
        ArrayList<Fruit> list = new ArrayList<>();
        list.add(app);
        list.add(str);
        getTotal(list, false);
    }

    //问题2:新增芒果类继承水果类
    public static void question2() {
        //新建每斤8元的苹果,买两斤
        Fruit app = new Apple();
        app.setName("苹果");
        app.setPrice(8);
        app.setWeight(2);
        //新建每斤13元的草莓,买两斤
        Fruit str = new Strawberry();
        str.setName("草莓");
        str.setPrice(13);
        str.setWeight(2);
        //新建每斤20元的草莓,买两斤
        Fruit mango = new Mango();
        mango.setName("芒果");
        mango.setPrice(20);
        mango.setWeight(2);
        ArrayList<Fruit> list = new ArrayList<>();
        list.add(app);
        list.add(str);
        list.add(mango);
        getTotal(list, false);
    }

    //问题3:将草莓的discount设置为八折(0.8)
    public static void question3() {
        //新建每斤8元的苹果,买两斤
        Fruit app = new Apple();
        app.setName("苹果");
        app.setPrice(8);
        app.setWeight(2);
        //新建每斤13元的草莓,买两斤
        Fruit str = new Strawberry();
        str.setName("草莓");
        str.setPrice(13);
        str.setWeight(2);
        str.setDiscount(0.8);
        //新建每斤20元的草莓,买两斤
        Fruit mango = new Mango();
        mango.setName("芒果");
        mango.setPrice(20);
        mango.setWeight(2);
        ArrayList<Fruit> list = new ArrayList<>();
        list.add(app);
        list.add(str);
        list.add(mango);
        getTotal(list, false);
    }

    //问题4
    public static void question4() {
        //新建每斤8元的苹果,买两斤
        Fruit app = new Apple();
        app.setName("苹果");
        app.setPrice(8);
        app.setWeight(10);
        //新建每斤13元的草莓,买两斤
        Fruit str = new Strawberry();
        str.setName("草莓");
        str.setPrice(13);
        str.setWeight(2);
        str.setDiscount(0.8);
        //新建每斤20元的草莓,买两斤
        Fruit mango = new Mango();
        mango.setName("芒果");
        mango.setPrice(20);
        mango.setWeight(2);
        ArrayList<Fruit> list = new ArrayList<>();
        list.add(app);
        list.add(str);
        list.add(mango);
        getTotal(list, false);
    }


    /**
     * 計算总金额
     * @param fruits      所购买水果的list
     * @param isPromotion 是否促销
     * @return
     */
    public static double getTotal(List<Fruit> fruits, boolean isPromotion) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            System.out.println("购买" + fruit.getName() + fruit.getWeight() + "斤,单价" + fruit.getPrice() + ",打折为" + fruit.getDiscount() + ",小计" + fruit.getSumPrice() + "元");
            sum += fruit.getSumPrice();
        }
        System.out.println("是否满减促销：" + isPromotion);
        sum = isPromotion ? sum - 10 : sum;
        System.out.println("总计：" + sum + "元");
        return sum;
    }
}