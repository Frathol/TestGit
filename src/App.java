import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner oke = new Scanner(System.in);

        String wadah = "";
        System.out.print("Masukkan Angka : ");
        String angka = oke.nextLine();

        for(int i = angka.length();i >= 0;i--){
            wadah = wadah + angka.charAt(i);
        }

        System.out.println("Jika Dibalik : " + wadah);

        oke.close();
    }
}
