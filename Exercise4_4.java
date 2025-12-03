//EREN BİLGE KOÇAK
//YAZILIM MÜHENDİSİ
//TEKNOLOJİ FAKÜLTESİ
//SINIFI B
public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        /* CEVAP 1:
           Kod sorunsuz bir şekilde derlenir ve çalışır. Hiçbir hata veya uyarı vermez.
           Metot çalışır, hesaplamasını yapar ancak döndürdüğü değer (42) hiçbir 
           değişkene atanmadığı için anında kaybolur (discarded). Java'da dönüş 
           değerini görmezden gelmek yasaldır.
        */

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        /* CEVAP 2:
           Bu satırın yorumunu kaldırırsanız "Derleme Hatası" (Compile-time Error) alırsınız.
           
           Hata Mesajı: "Operator '+' cannot be applied to 'void' and 'int'" 
           (veya benzeri: "void type not allowed here")
           
           Açıklama: void metotlar geriye bir veri (sayı, string vb.) döndürmez. 
           Olmayan bir değerle (hiçlik ile) 7 sayısını toplayamazsınız. 
           Bu yüzden Java bu ifadeyi derleyemez.
        */
    }
}
