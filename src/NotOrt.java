import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] not= new int[5];
        int puanort= 0;
        int basarilisayisi=0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("lütfen not giriniz..");
            not[i]=scan.nextInt();

        }
        for (int j = 0; j <5; j++) {
            if (not[j]>=50){
                puanort+=not[j];
                basarilisayisi++;
            }
        }
        System.out.println("Puan ortalaması :"+(puanort/basarilisayisi));

    }
}
