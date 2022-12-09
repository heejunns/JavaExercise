package javaexercise;

import java.util.ArrayList;
import java.util.Scanner;

class Fruit2 {
    public String toString(){
        return "Fruit2";
    }
}
class Grape extends Fruit2{
    public String toString(){
        return "Grape";
    }
}
class Banana extends Fruit2{
    public String toString(){
        return "Banana";
    }
}
class Juice{
    String name;
    Juice(String name){
        this.name = name + "Juice";
    }
    public String toString(){
        return name;
    }
}
class Juicer {
    static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
        String tmp = "";

        for (Fruit2 f : box.getList()) {
            tmp += f + " ";

        }
        return new Juice(tmp);
    }
}


class JavaExercise_83 {
    public static void main(String[] args) { // 지네릭스 사용해보기 (와일드 카드)
        FruitBox2 <Fruit2> fruitBox = new FruitBox2<Fruit2>();
        FruitBox2<Grape> fruitBox2 = new FruitBox2<Grape>();
        FruitBox2<Banana> fruitBox3 = new FruitBox2<Banana>();
        Box2<Fruit2> box2 = new FruitBox2<Fruit2>();
        Box2<Grape> box21 = new Box2<Grape>();

        fruitBox.add(new Banana());
        fruitBox.add(new Grape());
        fruitBox.add(new Fruit2());
        fruitBox2.add(new Grape());
        fruitBox3.add(new Banana());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(fruitBox2));
        System.out.println(Juicer.makeJuice(fruitBox3));

    }
}

class FruitBox2<T extends Fruit2>  extends Box2<T>{

}
class Box2<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item){list.add(item);}
    T get(int index){return list.get(index);}
    int size(){
        return list.size();
    }
    public String toString(){
        return list.toString();
    }
    ArrayList<T> getList(){
        return list;
    }
}





