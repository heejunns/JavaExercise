package javaexercise;

class Mymath {

    int x;

    static long add(long a, long b){ // 두 값을 받아서 두 값을 더한 값을 반환하는 메서드
        long result = a+b;
        return result;
    }
    long sub(long a,long b){ // 두 값을 받아서 두 값을 뺀 값을 반환하는 메서드
        long result = a-b;
        return result;
    }
    long mul(long a,long b){ // 두 값을 받아서 두 값을 곱한 값을 반환하는 메서드
        long result = a*b;
        return result;
    }
    long div(long a,long b){ // 두 값을 받아서 두 값을 나눈 값을 반환하는 메서드
        long result = a/b;
        return result;
    }
    int maxSelect(int a,int b){ // 두 값을 받아서 둘중에 큰 값을 반환하는 메서드
        if(a>=b){
            return a;
        }else{
            return b;
        }
    }
    int minSelect(int a,int b){ // 두 값을 받아서 둘중에 작은 값을 반환하는 메서드
        if (a >= b) {
            return b;
        }else{
            return a;
        }
    }

}

public class JavaExercise_23 { // 객체지향 실습, 다양한 메서드 만들기(더하기,빼기,곱하기,나누기,큰수찾기,작은수찾기)
    public static void main(String[] args) {
        Mymath mymath = new Mymath();
        long result_a = mymath.add(3L,5L);
        long result_s = mymath.sub(3L,5L);
        long result_m = mymath.mul(3L,5L);
        double result_d = mymath.div(10L,5L);
        System.out.println("3,5를 입력한 add 메서드의 결과 : "+result_a);
        System.out.println("3,5를 입력한 sub 메서드의 결과 : "+result_s);
        System.out.println("3,5를 입력한 mul 메서드의 결과 : "+result_m);
        System.out.println("3,5를 입력한 div 메서드의 결과 : "+result_d);
        System.out.println("3,5를 입력한 maxSelect 메서드의 결과 : "+mymath.maxSelect(3,5));
        System.out.println("3,5를 입력한 minSelect 메서드의 결과 : "+mymath.minSelect(3,5));
    }
}
