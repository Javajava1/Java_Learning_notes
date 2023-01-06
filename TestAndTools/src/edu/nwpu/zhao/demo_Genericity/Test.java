package edu.nwpu.zhao.demo_Genericity;


import java.util.ArrayList;
import java.util.List;

/**
 * @author:weilongzhao
 * @time:2021/8/23 21:00
 */
/**
 * 类型通配符一般是使用“？”代替具体的类型实参
 * 所以，类型通配符是类型实参，而不是类型形参
 */

public class Test {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();

        Box<Number> box = new Box<>();
        box.setT(100);
        showBox(box);
        Cat cat = new Cat();

    }
    public static void main1(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        List<MiniCat> miniCatsList = new ArrayList<>();

        //showAnimals(animalList);
        catList.addAll(catList);
        showAnimals(catList);
        showAnimals(miniCatsList);
    }


    /***
     *
     *泛型类型不支持多态
     * @time:2021/7/15
     */
    public static void showBox(Box<Number>box){
       Number number = box.getT();
        System.out.println(number);
    }
    /***
     * 泛型通配符上限
     * 采用泛型通配符上限的集合不能填充元素
     * @time:2021/7/15
     *
     */
    public static void showAnimals(List<? extends Cat >animals){
        //animals.add(new Cat());
        for (int i = 0; i < animals.size(); i++) {
            Cat cat = animals.get(i);
            System.out.println(cat);
        }
    }

}
