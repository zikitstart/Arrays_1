public class Main {
    public static void main(String[] args) {
        //Задание-1.

        int [] integer = new int [3];
        integer [0] = 1;
        integer [1] = 2;
        integer [2] = 3;


        double [] fractional = {1.57, 7.654, 9.986,};


        int [] arbitrary = new int [3];
        arbitrary [0] = 4;
        arbitrary [1] = 8;
        arbitrary [2] = 16;

        //Задание-2.
        System.out.println("Задание-2.");

        System.out.println(integer[0] + "," + integer[1] + "," + integer[2]);
        System.out.println(fractional[0] + "," + fractional[1] + "," + fractional[2]);
        System.out.println(arbitrary[0] + "," + arbitrary[1] + "," + arbitrary[2]);

        //Задание-3.
        System.out.println("Задание-3.");

        System.out.println(integer[2] + "," + integer[1] + "," + integer[0]);
        System.out.println(fractional[2] + "," + fractional[1] + "," + fractional[0]);
        System.out.println(arbitrary[2] + "," + arbitrary[1] + "," + arbitrary[0]);

        //Задание-4.
        System.out.println("Задание-4.");

        for (int i = 0; i < integer.length; i++) {
            if (integer [i] % 2 !=0) {
                integer [i] += 1;
            }
            System.out.println(integer [i]);
        }
    }
}