package javaexercise;

class MyMath4 {
    int add(int a, int b) {
        System.out.println("int add(int a,int b) 메서드 호출");
        return a + b;
    }
    long add(long a,long b){
        System.out.println("long add(long a,long b) 메서드 호출");
        return a+b;
    }
    int add(int[] a){
        System.out.println("int add(int[] a) 메서드 호출");
        int total = 0 ;
        for (int i=0; i<a.length; i++){
            total+=a[i];
        }
        return total;
    }
}


public class JavaExercise_29 { // 오버로딩 실습 (각각의 오버로딩한 메서드들이 잘 호출 되는지 확인)
    public static void main(String[] args) {
        MyMath4 myMath4 = new MyMath4();
        int result1 = myMath4.add(3,5);
        System.out.println("int add(int a,int b) 메서드의 반환 값 : "+result1);

        long result2 = myMath4.add(3,5L); // long(long a,long b) 메서드 호출
        System.out.println("long add(long a,long b) 메서드의 반환 값 : "+result2);

        long result3 = myMath4.add(3L,5); // long(long a,long b) 메서드 호출
        System.out.println("long add(long a,long b) 메서드의 반환 값 : "+result3);

        long result4 = myMath4.add(3L,5L);
        System.out.println("long add(long a,long b) 메서드의 반환 값 : "+result4);

        int[] a = {1,2,3,4,5};
        int result5 = myMath4.add(a);
        System.out.println("int add(int[] a) 메서드의 반환 값 : "+result5);

    }
}
