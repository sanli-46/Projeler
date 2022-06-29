import java.util.Scanner;
public class KullaniciGir {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String userName;
        String password;
        String tempPassword;

        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("dev")) {
            System.out.println("\nGiriş başarılı");
        } else {
            System.out.print("\nGiriş başarısız.\n\nLütfen yeni şifrenizi giriniz: ");
            tempPassword = input.nextLine();
            if (tempPassword.equals(password)) {
                System.out.println("Eski şifre ile yenisi aynı olamaz");
            } else {
                System.out.println("Şifreniz başarılı bir şekilde değiştirildi.");
            }


        }
    }}

