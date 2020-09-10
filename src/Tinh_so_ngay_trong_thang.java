import java.util.Scanner;

public class Tinh_so_ngay_trong_thang {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int month= sc.nextInt();
        System.out.println("So ngay trong thang "+month+" la: "+countDays(month) );

    }
    public static int countDays(int month){
        if(month<8){
            if(month==2) return 28;
            if(month%2==0) return 30;
            return 31;
        }else{
            if(month%2==0) return 31;
            return 30;
        }

    }
}
