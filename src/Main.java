import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 1, ebob = 0, k = 1, ekok = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println(" Birinci sayıyı giriniz : ");
        int n1 = inp.nextInt();
        System.out.println(" Birinci sayıyı giriniz : ");
        int n2 = inp.nextInt();

        if (n1 < n2) {
            while (i < n1) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Ebob : " + ebob);

            while (k < n1 * n2) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ekok = k;
                }
                k++;
            }
            System.out.println("Ekok : " + (n1*n2)/ebob);
        }

        else {
            while (i < n2) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Ebob : " + ebob);

            while (k < n1 * n2) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ekok = k;
                }
                k++;
            }
            System.out.println("Ekok : " + (n1*n2)/ebob);
        }
        }
    }
