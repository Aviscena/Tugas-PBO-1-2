import java.util.Scanner; // Import Scanner for user input

public class Biodata {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Input data dari user
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Kota: ");
        String kota = input.nextLine();

        System.out.print("Masukkan Kode Pos: ");
        String kodePos = input.nextLine();

        System.out.print("Masukkan Telepon: ");
        String telp = input.nextLine();

        System.out.print("Masukkan HP: ");
        String hp = input.nextLine();

        System.out.print("Masukkan Email: ");
        String email = input.nextLine();

        // Tampilan data yang di input
        System.out.println("\n===== BIODATA =====");
        System.out.println("NIM    : " + nim);
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Kota   : " + kota);
        System.out.println("Kode Pos : " + kodePos);
        System.out.println("Telp   : " + telp);
        System.out.println("HP     : " + hp);
        System.out.println("Email  : " + email);

       
        input.close();
    }
}
