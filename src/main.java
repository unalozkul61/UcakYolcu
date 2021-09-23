import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int km , yas , yt  ;
        double ucretkm = 0.10 , normalTutar , yasİndirimi, toplamTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Km olarak giriniz :");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipini Giriniz ( 1--> Tek Yön 2 --> Gidiş -- Dönüş");
        yt = input.nextInt();
        normalTutar = km*ucretkm;



        switch (yt) {
            case 1 :
                if(yas <12){
                     yasİndirimi = normalTutar * 0.5 ;
                     toplamTutar= normalTutar-yasİndirimi;
                    System.out.println("Toplam Tutar : " + toplamTutar);
                }else if ((yas >12) &&(yas <24) ) {
                    yasİndirimi = normalTutar*0.1;
                    toplamTutar = normalTutar-yasİndirimi;
                    System.out.println("Toplam Tutar : "+ toplamTutar);
                }else if (yas>65){
                    yasİndirimi = normalTutar*0.3;
                    toplamTutar= normalTutar-yasİndirimi;
                    System.out.println("Toplam Tutar : "+ toplamTutar);
                }
                break;
            case 2 :
                if(yas <12){
                    yasİndirimi = normalTutar * 0.5 ;
                    toplamTutar= ((normalTutar-yasİndirimi)*0.20)*2;
                    System.out.println("Toplam Tutar : " + toplamTutar);
                }else if ((yas >12) &&(yas <24) ) {
                    yasİndirimi = normalTutar*0.1;
                    toplamTutar = ((normalTutar-yasİndirimi)*0.20)*2;
                    System.out.println("Toplam Tutar : "+ toplamTutar);
                }else if (yas>65){
                    yasİndirimi = normalTutar*0.3;
                    toplamTutar= ((normalTutar-yasİndirimi)*0.2)*2;
                    System.out.println("Toplam Tutar : "+ toplamTutar);
                }
                break;

                }
                if ((yas>24) &&(yas<65)){
                 System.out.println("Toplam tutar : " + normalTutar);



                }


        }

}

