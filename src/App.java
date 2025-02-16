import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Oke!!!!!!!!!");

        Thread.sleep(2000);

        System.out.println("Coba Fitur Sederhana");
        ubah1();
    }

    public static void ubah1(){
        Scanner oke = new Scanner(System.in);

        String wadah = "";
        System.out.print("Masukkan inputan : ");
        String inputan = oke.nextLine();

        for(int i = inputan.length()-1;i >= 0;i--){
            wadah = wadah + inputan.charAt(i);
        }

        System.out.println("Jika Dibalik : " + wadah);

        oke.close();
    }
}
