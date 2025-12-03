//EREN BİLGE KOÇAK
//YAZILIM MÜHENDİSİ
//TEKNOLOJİ FAKÜLTESİ
//SINIFI B
public class Multadd {

    // 1. multadd metodu: a * b + c islemini yapar ve yazdirir.
    public static void multadd(double a, double b, double c) {
        double result = a * b + c;
        System.out.println(result);
    }

    // 2. expSum metodu: Verilen formulu multadd kullanarak hesaplar.
    // Formul: x * e^-x + sqrt(1 - e^-x)
    public static void expSum(double x) {
        double a = x;                     // a kismi: x
        double b = Math.exp(-x);          // b kismi: e^-x
        double c = Math.sqrt(1.0 - b);    // c kismi: sqrt(1 - e^-x)
        
        System.out.print("expSum(" + x + ") sonucu: ");
        multadd(a, b, c);
    }

    public static void main(String[] args) {
        
        // --- Adim 3: Basit Test ---
        System.out.println("--- Basit Test ---");
        System.out.print("multadd(1.0, 2.0, 3.0) -> 1*2+3 = ");
        multadd(1.0, 2.0, 3.0); // Beklenen: 5.0
        
        System.out.println("\n--- Matematiksel Ifadeler ---");

        // --- Adim 4a: sin(pi/4) + cos(pi/4)/2 ---
        // Strateji: 1.0 * sin(pi/4) + (cos(pi/4)/2)
        double angle = Math.PI / 4.0;
        double sinVal = Math.sin(angle);
        double cosValDiv2 = Math.cos(angle) / 2.0;
        
        System.out.print("sin(pi/4) + cos(pi/4)/2 = ");
        multadd(1.0, sinVal, cosValDiv2);

        // --- Adim 4b: log 10 + log 20 ---
        // Strateji: 1.0 * log(10) + log(20)
        // Not: Java'da Math.log() dogal logaritmadir (ln). 
        // Soruda "log 10" dendigi icin Math.log10 kullanildi.
        double log10 = Math.log10(10);
        double log20 = Math.log10(20);
        
        System.out.print("log(10) + log(20) = ");
        multadd(1.0, log10, log20);

        System.out.println("\n--- expSum Testi ---");
        
        // --- Adim 5: expSum cagrilari ---
        expSum(1.0); // Ornek olarak x = 1.0 icin test
        expSum(2.0); // Ornek olarak x = 2.0 icin test
    }
}
