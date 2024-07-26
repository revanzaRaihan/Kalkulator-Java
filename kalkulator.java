import java.util.Scanner;

class kalkulator{
    public static void main(String[] args) {
        
        char operator;
        Double angka1, angka2, result;

        //buat objek scanner class
        Scanner angka = new Scanner(System.in);

        //pilihan operasi
        System.out.println("Masukan operasi, + - * /.");
        operator = angka.next().charAt(0);

        //masukan angka 1
        System.out.println("Angka pertama : ");
        angka1 = angka.nextDouble();

        //masukan angka 2
        System.out.println("Angka kedua : ");
        angka2 = angka.nextDouble();

        switch (operator) {
            //operasi penjumlahan.
            case '+':
                result = angka1 + angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + result);
                break;
            //operasi pengurangan
            case '-':
                result = angka1 - angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + result);
                break;
            //operasi perkalian
            case '*':
                result = angka1 * angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + result);
                break;
            //operasi pembagian
            case '/':
                result = angka1 / angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + result);
                break;
            //operasi invalid
            default:
            System.out.println("Operasi Invalid");
                break;
        }
    angka.close();
    }
}