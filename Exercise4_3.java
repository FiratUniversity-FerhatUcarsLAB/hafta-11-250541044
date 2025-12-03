//EREN BİLGE KOÇAK
//YAZILIM MÜHENDİSLİĞİ
//TEKNOLOJİ FAKÜLTESİ
//B SINIFI
public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print(" You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No , I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print(" wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
        
        /* * SORU 1: STACK DIYAGRAMI
         * (ping metodu ilk kez çağrıldığında hafıza durumu)
         * * |---------------------------|
         * | ping()                    | <-- Aktif Metot (En üstte)
         * |---------------------------|
         * | baffle()                  | <-- ping'i çağırdı, bekliyor
         * |---------------------------|
         * | zoop()                    | <-- baffle'ı çağırdı, bekliyor
         * |---------------------------|
         * | main(String[] args)       | <-- zoop'u çağırdı, bekliyor
         * |---------------------------|
         */
    }
}

/*
 * SORU 2: PROGRAMIN TAM CIKTISI
 * (Boşluklar ve satır sonları birebir analiz edilmiştir)
 * * No , I  wug.
 * You wugga  wug.
 * I  wug.
 * */
