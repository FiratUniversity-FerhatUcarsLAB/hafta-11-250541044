//EREN BİLGE KOÇAK
//TEKNOLOJİ FAKÜLTESİ
//YAZILIM MÜHENDİSLİĞİ
//B SINIFI
//ÖDEV 1




public class dsd{

    // Amerikan Formati: Day, Month Date, Year (Ornek: Monday, July 22, 2019)
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("Amerikan Formati");
        // String birlestirme (concatenation)
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa Formati: Date Month Year, Day (Ornek: 22 July 2019, Monday)
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("Avrupa Formati");
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
        // Degiskenlerin tanimlanmasi
        String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        // Metotlarin cagirilmasi
        printAmerican(day, date, month, year);

        // Cikti karismasin diye araya bosluk ekledim
        System.out.println();

        printEuropean(day, date, month, year);
    }
}
