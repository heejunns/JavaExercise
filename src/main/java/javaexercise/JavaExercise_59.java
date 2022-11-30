package javaexercise;

class JavaExercise_59 {
    public static void main(String[] args) { // Math 클래스 메서드
        for (double d = 0.0; d < 2.0; d += 0.1){
            double d1 = Math.rint(d);
            double d2 = Math.round(d);

            System.out.printf("%.1f %.1f %.1f\n",d,d1,d2);

        }

    }
}

