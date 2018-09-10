import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int math(int i) {
        if (i < 10) {
            System.out.println("it's ok");
        } else {
            System.out.println("it's not ok");
        }
        return (i + 1);
    }

    public static void main(String[] args) {
       /* int key = 1;
        int integery = 0;
        int val = 0;
        while(key == 1) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число!");
            integery = sc.nextInt();
            val += Main.math(integery);

            System.out.println("Введите ключ!");
            key = sc.nextInt();

        }

        System.out.println(val);
        int k, j = 1;
        for (int i = 0; i < 10; i++)
        {
            //System.out.print(i);
            j += i;
            k = j;
            while(k > 0)
            {
                System.out.print(" ");
                k--;
            }
            System.out.print(i);
            System.out.print("\n");
        }*/

        //NewCat myCat = NewCat.bornCat("Nyashka", 2);
        NewCat myCat = new NewCat("Matroskin", 5);
        System.out.print("My cat ");
        System.out.println(myCat.name);
        System.out.print("It's ");
        System.out.print(myCat.age);
        System.out.println(" years old ");

       /* NewCat myCat2 = new NewCat("Tishka", 8);
        System.out.print("My cat ");
        System.out.println(myCat2.name);
        System.out.print("It's ");
        System.out.print(myCat2.age);
        System.out.println(" years old ");

        NewCat myCat3 = new NewCat("Nyshka", 2);
        System.out.print("My cat ");
        System.out.println(myCat3.name);
        System.out.print("It's ");
        System.out.print(myCat3.age);
        System.out.println(" years old ");*/

        NewDog dog = new NewDog("Sharik", false);
        System.out.print("There is a dog, it's " + dog.name + " ");
        if (!dog.homeless) {
            System.out.print("and it's my!");
        } else {
            System.out.print("and it's homeless :C ");
        }

        NewDog dog2 = new NewDog("Bsrbos", true);
        System.out.print("\nThere is a dog, it's " + dog2.name + " ");
        if (!dog2.homeless) {
            System.out.print("and it's my!");
        } else {
            System.out.print("and it's homeless :C \n\n");
        }


        for (int i = 0; i < 20; i++) {
            NewCat citty = new NewCat("Lapochka", 1);
            final Random random = new Random();
            int ran = random.nextInt() % 30;

            if (ran < -20) {
                if (ran == -29) {
                    citty.sleep("table");
                } else if (ran == -28 || ran == -27 || ran == -26) {
                    citty.sleep("bed");
                } else if (ran == -25 || ran == -24 || ran == -23) {
                    citty.sleep("notebook");
                } else {
                    citty.sleep("my arms");
                }
            } else if (ran > -20 & ran <= -10) {
                //System.out.print(ran + " ");
                citty.run();
            } else if (ran > -10 & ran <= 0) {
                //System.out.print(ran + " ");
                if(ran < -5) {
                    citty.eat( " eat viscas");
                } else {
                    citty.eat(" drink milk");
                }
            } else if (ran > 0 & ran <= 10) {
                //System.out.print(ran + " ");
                citty.scream();
            } else if (ran > 10 & ran <= 20) {
                //System.out.print(ran + " ");
                if (ran == 11) {
                    citty.fight("fly");
                } else if (ran == 12 || ran == 13 || ran == 14) {
                    citty.fight( "mouse");
                } else if (ran == 15 || ran == 16 || ran == 17) {
                    citty.fight("cat");
                } else {
                    citty.fight("dog");
                }
            } else {
                //System.out.print(ran + " ");
                citty.scatch();
            }
        }

        int a = 7, b = 10;
        System.out.println(Calc.sum(a,b));



        City city1 = new City("Moscow");
        City city2 = new City("Tomsk", 574002);
        City city3 = new City("Amsterdam", 801847, true);
        City city4 = new City("New York", 8622698, false, true);

        city1.print();
        System.out.println("=============");
        city2.print();
        System.out.println("=============");
        city3.print();
        System.out.println("=============");
        city4.print();




    }
}
