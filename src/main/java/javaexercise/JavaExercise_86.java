package javaexercise;

enum Direction { EAST, SOUTH, WEST, NORTH}

class JavaExercise_86 {
        public static void main(String[] args) { // 열거형 메서드 사용하기
            Direction d1 = Direction.EAST;
            Direction d2 = Direction.valueOf("WEST");
            Direction d3 = Enum.valueOf(Direction.class, "EAST");

            System.out.println("d1 : "+d1);
            System.out.println("d2 : "+d2);
            System.out.println("d3 : "+d3);

            System.out.println("d1==d2 ? "+(d1==d2));
            System.out.println("d1==d3 ? "+(d1==d3));
            System.out.println("d1.equals(d3) ? "+d1.equals(d3));
//            System.out.println("d1 > d3 ? "+(d1>d3)); 에라 발생, 비교 연산자 사용 불가능
            System.out.println("d1.compareTo(d2) ? "+d1.compareTo(d2));
            System.out.println("d1.compareTo(d3) ? "+d1.compareTo(d3));

            Direction[] dArr = Direction.values();

            switch (d1){
                case EAST:
                    System.out.println("EAST");
                    break;
                case SOUTH:
                    System.out.println("SOUTH");
                    break;
                case WEST:
                    System.out.println("WEST");
                    break;
                case NORTH:
                    System.out.println("NORTH");
                    break;
            }

            for(Direction d : dArr){
                System.out.printf("%s=%d\n",d.name(),d.ordinal());
            }




        }
    }







