import java.util.Scanner;

public class HitungLuasKeliling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Persegi
        System.out.print("Masukkan panjang sisi persegi: ");
        float sisi = input.nextFloat();
        float luasPersegi = sisi * sisi;
        float kelilingPersegi = 4 * sisi;
        System.out.println("Luas Persegi: " + luasPersegi);
        System.out.println("Keliling Persegi: " + kelilingPersegi);

        // Segitiga
        System.out.print("\nMasukkan alas segitiga: ");
        float alas = input.nextFloat();
        System.out.print("Masukkan tinggi segitiga: ");
        float tinggi = input.nextFloat();
        float luasSegitiga = 0.5f * alas * tinggi;
        System.out.println("Luas Segitiga: " + luasSegitiga);

        // Lingkaran
        float phi = 3.14f; // Default float needs 'f' suffix
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        float r = input.nextFloat();
        float luasLingkaran = phi * (r * r);
        float kelilingLingkaran = 2 * phi * r;
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        // Kubus (Volume)
        System.out.print("\nMasukkan panjang sisi kubus: ");
        float sisiKubus = input.nextFloat();
        float volumeKubus = sisiKubus * sisiKubus * sisiKubus;
        System.out.println("Volume Kubus: " + volumeKubus);

        input.close();
    }
}
