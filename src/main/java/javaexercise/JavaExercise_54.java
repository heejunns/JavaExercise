package javaexercise;
class Value {
    int value;

    Value(int value ){
        this.value = value;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Value) { // obj가 Value로 형 변환이 가능한지 판단
            Value v = (Value) obj; // 참이라면 obj의 타입은 Object이기 때문에 Value로 형변환
            return this.value == v.value; // 값이 같다면 true, 다르다면 false
        } else {
            return false; // 형변환이 불가능하다면 false
        }
    }
}
class JavaExercise_54 {
    public static void main(String[] args) { // Object 클래스의 equals() 오버라이딩
        Value v1 = new Value(20);
        Value v2 = new Value(20);

        if (v1.equals(v2)) {
            System.out.println("v1과 v2의 value 값이 같습니다.");
        } else {
            System.out.println("v1과 v2의 value 값이 다릅니다.");
        }
    }
}

