package ua.ithilel.java;

public class DataTypes {
    public static void main(String[] args) {

        char c = 'A';
        System.out.println(c); //печатаем А

        char c1 = '\u0041';
        System.out.println(c1); //печатаем А

        char c2 = 65;
        System.out.println(c2); //печатаем А

        char c3 = '\t';
        System.out.println("Tab: " + c3 + " :end of tab"); //печатаем табуляцию

        byte b = 10;
        System.out.println(b); //печатаем 10

        byte b1 = (byte) 200;
        System.out.println(b1);

        b1 = (byte) 0b11001000;
        System.out.println(b1); //печатаем -56

        byte b2 = (byte) 320; //256+64 i.e 00000000_00000000_00000001_01000000, byte 01000000
        //так как первый бит равен 0, то ничего не мешает определить значение
        System.out.println(b2); //печатаем 64

        short s = 32;
        short s1 = 'A'; //неявное преобразование char в short
        System.out.println(s1); //печатаем 65

        int i = 'A';
        System.out.println(i); //печатаем 65

        long l = 3200L;
        System.out.println(l);

        long l1 = 3200;
        System.out.println(l1);

        float f = 12.34f;
        System.out.println(f);

        byte x, y = 1, z = 2;
        x = (byte) (y + z);
        System.out.println(x);

        boolean A = true;
        System.out.println(A);

        boolean B = false;
        System.out.println(B);



    }
}
