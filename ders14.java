import java.util.Scanner;

public class ders14 {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen aşağıya üç sayı giriniz ");
        System.out.print("a sayısı:");
        a=input.nextInt();
        System.out.print("b sayısı:");
        b=input.nextInt();
        System.out.print("c sayısı:");
        c=input.nextInt();

        if((a>b)&&(a>c)){
            if(b>c){
                System.out.print("a>b>c");
            }else if(b==c){
                System.out.print("a>b=c");
            }else {
                System.out.print("a>c>b");
            }
        }else if((b>a) &&(b>c)){
            if(a>c){
                System.out.print("b>a>c");
            }else if(a==c){
                System.out.print("b>a=c");
            }else{
                System.out.print("b>c>a");
            }
        }else if((c>a) && (c>b)){
            if(a>b){
                System.out.print("c>a>b");
            }else if(a==b){
                System.out.print("c>a=b");
            }else{
                System.out.print("c>b>a");
            }
        }else{
            System.out.print("a=b=c");
        }

        
    }
}
