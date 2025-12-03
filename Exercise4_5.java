
//EREN BİLGE KOÇAK
//YAZILIM MÜHENDİSİ
//TEKNOLOJİ FAKÜLTESİ
//SINIFI Bpublic class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping(" not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop(" just for ", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It ’s ");
        zoop(" breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println(" any " + strangStrung + " more ");
    }
}

/* -------------------------------------------------------------------------
   SORU 1: STACK DIYAGRAMI
   (zoop metodu İKİNCİ kez çağrıldığında -clink içinden- hafıza durumu)
   -------------------------------------------------------------------------
   
   |-----------------------------|
   | zoop                        | <-- AKTİF METOT
   | fred: " breakfast "         |
   | bob: 4                      |
   |-----------------------------|
   | clink                       | <-- zoop'u çağırdı, bekliyor
   | fork: 4                     |
   |-----------------------------|
   | main                        | <-- clink'i çağırdı, bekliyor
   | bizz: 5                     |
   | buzz: 2                     |
   | args: [ ... ]               |
   |-----------------------------|


   -------------------------------------------------------------------------
   SORU 2: PROGRAMIN TAM CIKTISI
   (Boşluklar ve satır sonları birebir analiz edilmiştir)
   -------------------------------------------------------------------------
   
 just for 
 any  not  more 
It ’s  breakfast 
!

*/
