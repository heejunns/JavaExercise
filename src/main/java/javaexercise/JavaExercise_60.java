package javaexercise;

class JavaExercise_60 {
    public static void main(String[] args) { // 래퍼 클래스
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        System.out.println("i1와 i2의 객체는 같은가? "+(i1==i2));
        System.out.println("i1.equals(i2)의 값은? "+i1.equals(i2));
        System.out.println("i1.compareTo(i2)의 값은? "+i1.compareTo(i2));
        System.out.println("i1.toString() = "+i1.toString());

        System.out.println("Integer의 최대 값은? "+Integer.MAX_VALUE);
        System.out.println("Integer의 최소 값은? "+Integer.MIN_VALUE);
        System.out.println("Integer의 크기는? "+Integer.SIZE);
        System.out.println("Integer의 바이트는? "+Integer.BYTES);
        System.out.println("Inteher의 타입은? "+Integer.TYPE);
    }
}

