public class Main {
    public static void main(String[] args) {
        // Do-While döngüsü ile 1'den 5'e kadar sayıları yazdırma
        System.out.println("Do-While Döngüsü:");
        int i = 1;
        do {
            System.out.println("Sayı: " + i);
            i++;
        } while (i <= 5);

        // While döngüsü ile 1'den 5'e kadar sayıları yazdırma (Karşılaştırma)
        System.out.println("\nWhile Döngüsü:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Sayı: " + j);
            j++;
        }

        // Do-While döngüsü ile en az bir kere koşulu sağlayan örnek
        System.out.println("\nKoşul Başta Sağlanmayan Durum (Do-While):");
        int x = 10;
        do {
            System.out.println("Sayı (Do-While): " + x);
            x++;
        } while (x <= 5);  // Koşul sağlanmasa bile döngü en az bir kere çalışır

        // While döngüsü ile aynı durumun kontrolü
        System.out.println("\nKoşul Başta Sağlanmayan Durum (While):");
        int y = 10;
        while (y <= 5) {
            System.out.println("Sayı (While): " + y);  // Bu kısım hiç çalışmayacak
        }
    }
}