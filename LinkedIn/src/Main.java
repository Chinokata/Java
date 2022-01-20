public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //sout tab
        System.out.println(420);
        System.out.println(3+2);
        System.out.println(3./21);
        System.out.println(3-2);
        System.out.println(3*2);
        System.out.println(3%2);
        System.out.println(5*6*17);
        System.out.println(510./(52*17)*100 + "%");

        //Favorite number
        int favoriteNumber = 8;
        favoriteNumber = 21;
        System.out.println("A kedvenc számom a " + favoriteNumber);

        //variableMutation
        int a = 3;
        a+=10;
        System.out.println(a);

        int b = 100;
        b-=7;
        System.out.println(b);

        int c = 44;
        c*=2;
        System.out.println(c);

        int d = 125;
        d/=5;
        System.out.println(d);

        int e = 8;
        e*=3;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        System.out.println(f1>f2);

        int g1 = 350;
        int g2 = 200;
        System.out.println(g1<g2*2);

        int h = 135798745;
        System.out.println(h%11 == 0);

        int i1 = 10;
        int i2 = 3;
        System.out.println(i1>i2*i2 && i2<i2*i2*i2);

        int j = 1521;
        System.out.println(j%3==0 || j%5==0);

        // Cuboid
        int sideA = 3;
        int sideB = 2;
        System.out.println("A ker-lete: " + (sideA + sideB)*2);
        System.out.println("A ter-lete " + (sideA*sideB));

    }
}
