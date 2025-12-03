//EREN BİLGE KOÇAK
//TEKNOLOJİ FAKÜLTESİ
//YAZILIM MÜHENDİSLİĞİ
//ÖDEV 1
public class Exercise4_2 {

    public static void main(String[] args) {
        zippo("rattle", 13);               // 1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);         // 5
        zippo("ping", -5);                 // 6
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {                    // 2, 7
            System.out.println(quince + " zoop"); // 8
        } else {
            System.out.println("ik");      // 3
            baffle(quince);                // 4
            System.out.println("boo-wa-ha-ha");   // 9
        }
    }
}

/*
GÖREV SORULARININ CEVAPLARI:

1. Çalışma sırası yukarıdaki kod satırlarının yanına (// 1, // 2...) şeklinde işlenmiştir.

2. baffle metodu ilk çağrıldığında blimp parametresinin değeri nedir?
   Cevap: "rattle"

3. Programın ürettiği tüm çıktı:
   ik
   rattle
   ping zoop
   boo-wa-ha-ha

4. Hangi satırlar birden fazla kez çalışmıştır?
   Cevap: "if (flag < 0)" satırı (Sıra 2 ve 7'de olmak üzere iki kez çalışmıştır).
*/
