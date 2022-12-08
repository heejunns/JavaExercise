package javaexercise;

import java.util.ArrayList;
import java.util.HashMap;
interface Eatable{
}
class Fruit implements Eatable {

    public String toString(){
        return "Fruit";
    }
}
class Apple extends Fruit{
    public String toString(){
        return "Apple";
    }
}
class Melon extends Fruit{
    public String toString(){
        return "Melon";
    }
}
class Toy implements Eatable {
    public String toString(){
        return "Toy";
    }

}


class JavaExercise_82 {
    public static void main(String[] args) { // 지네릭스 사용해보기 (제한된 제네릭스)
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> fruitBox2 = new FruitBox<Apple>();
        FruitBox<Melon> fruitBox3 = new FruitBox<Melon>();
//        FruitBox<Melon> fruitBox4 = new FruitBox<Apple>(); 타입 불일치 에러 발생
//        FruitBox<Toy> fruitBox5 = new FruitBox<Toy>(); 제한된 제네릭스 타입의 클래스나 인터페이스에게 Toy 클래스는 자식 클래스가 아니기때문에 에러 발생
        Box<Toy> box = new Box<Toy>(); // 가능
        Box<Eatable> box2 = new Box<Eatable>(); // 가능
        box2.add(new Toy());
        System.out.println(box2.get(0).toString());
        fruitBox2.add(new Apple());

    }
}

class FruitBox<T extends Fruit>  extends Box<T>{

}
class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item){list.add(item);}
    T get(int index){return list.get(index);}
    int size(){
        return list.size();
    }
    public String toString(){
        return list.toString();
    }
}





