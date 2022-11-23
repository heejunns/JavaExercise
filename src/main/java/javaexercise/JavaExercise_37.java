package javaexercise;


class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price/5.0); // this 생략 가능 , 보너스 포인트 가격의 5퍼센트 주기

    }
}
class TvPro extends Product {
    TvPro() {
        super(300);
    }

    @Override
    public String toString() {
        return "tv";
    }
}
class ComputerPro extends Product{
    ComputerPro() {
        super(500);
    }

    @Override
    public String toString(){
        return "computer";
    }
}
class Buyer{
    private int money = 1000;
    private int point = 0;

    Product[] cart = new Product[10]; // 구입한 물건을 저장하기 위한 배열
    int i = 0;
    void buy(Product p){
        if(p.price > money){
            System.out.println("가지고 있는 금액이 부족해 물건을 구매할 수 없습니다.");
        }else if(p.price <= money) {
            money -= p.price;
            point += p.bonusPoint;
            cart[i++] = p;
            System.out.println("구매하신 제품은 " + p.toString() + "입니다.");
            System.out.println("현재 남은 금액은 " + money + "원 입니다.");
            System.out.println("현재 포인트는 " + point + "점 입니다.");
        }
    }
    void cartList(){
        int sum = 0;
        String productList = ""; //  구매 리스트
        for(int i=0; i< cart.length; i++){
            if(cart[i]!= null){
                productList+=cart[i].toString()+",";
                sum+= cart[i].price;
            }else if(cart[i]==null){ // null 이면 cart에 물건이 안담겨 있으니까 break 한다.
                break;
            }
        }
        productList = productList.substring(0,productList.length()-1); // 마지막 구매 리스트 문자열에서 "," 제거하기
        System.out.println("구입한 물건의 리스트는 "+productList+" 입니다.");
        System.out.println("구입한 물건의 총 가격 합계는 : "+sum+"원 입니다.");
    }

}

public class JavaExercise_37 { // 매개변수의 다형성, 여러 종류의 객체를 배열로 다루기 (전자제품 구입하는 프로그램)
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
      //  Product p = new TvPro();
      //  buyer.Buy(p);     이 두 코드가 아래의  buyer.Buy(new TvPro()); 코드와 같다. 
        buyer.buy(new TvPro());
        buyer.cartList();
        buyer.buy(new ComputerPro());
        buyer.cartList();
        buyer.buy(new ComputerPro());
        buyer.cartList();
    }
}
