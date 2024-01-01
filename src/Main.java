import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Monday monday = new Monday("Cereal", "Soup,Chicken", "Pasta", "1 AM", "7 AM",
                "Friends", "Cafe", "Sorgulayan Denemeler", "COD Warzone", "Blues", "Stairway to Heaven", "Kotlin");
        Tuesday tuesday = new Tuesday("Cake,Coffee","Pasta with Chicken",
                "Hatay Zurna","23.00","8.00",
                "Kotlin","Sorgulayan Denemeler",
                "COD Warzone","Megadeth","Duman-Tövbe");

        Wednesday wednesday = new Wednesday("Cereal","Pasta,Chicken","Potato with Chicken","1 AM","8 AM","CanOzan","JollyJoker","Chest,shoulders,biceps");

        Thursday thursday = new Thursday("Nothing","Soup,Pasta","Kuru fasulye","23.00","8 AM","Kotlin","Differantial Equations");
        Friday friday = new Friday("Cereal","Pasta,Chicken","Burger","24.00","7.00","Kotlin","Back,Biceps","COD Warzone","Texas Flood","Blues");
        Saturday saturday = new Saturday("Cereal,Coffee","Pasta,Chicken","Potato","24.00","8.30","Kotlin","Legs,Shoulders","COD Warzone","Marry had a little lamb","Blues","Nothing","Eren,Duygu,Kerem");
        Sunday sunday = new Sunday("Pogaca,Coffee","Pasta","Potato Fries","01.00","7.00","Kerem,Eren","COD Warzone","Blues","Kotlin");


        while(true){
            //Sonsuz döngü kullanarak kullanıcı benim hakkımda bilgi edinmek istediği günü ve etkinliği seçtikten sonra
            // döngüden çıktığında tekrardan gün seçip başka bir günüm hakkında bilgi edinmesini sağlamak
            System.out.println(" ");
            System.out.println("Choose a day that you want to know what's going on in my life :)");
            System.out.println("-Monday");
            System.out.println("-Tuesday");
            System.out.println("-Wednesday");
            System.out.println("-Thursday");
            System.out.println("-Friday");
            System.out.println("-Saturday");
            System.out.println("-Sunday");
            System.out.print(">");
            String day = scanner.nextLine();//gün değişkenini kullanıcıdan girdi olarak aldık

            switch (day.toLowerCase()){//oluşabilecek büyük küçük harf hatalarını önlemek için
                case "monday":
                    //Kullanıcıdan benim hakkımda bilgi edinmek istediği aktiviteyi seçmesini sağla
                    System.out.println(" ");
                    System.out.println("Choose an activity to get to know me?");
                    System.out.println("  - Game");
                    System.out.println("  - Hobbies");
                    System.out.println("  - Routines");
                    System.out.println("  - Music");
                    System.out.println("  - Socialize");
                    System.out.println("  - Coding");
                    System.out.println("  - Other");
                    System.out.print(">");
                    String activity = scanner.nextLine();

                    //Kullanıcı aktiviteyi de seçtikten sonra şuanda monday hakkında bilgi edinmek istediği için
                    //monday içerisinde bulunan metodları monday objesi üzerinden burada çağırıyorum
                    //bunu her gün için ayrı ayrı switch bloklarında kontrol et
                    switch (activity.toLowerCase()) {
                        case "game":
                            monday.playGame();
                            break;
                        case "hobbies":
                            monday.playElectricGuitar();
                            monday.readBook();
                            break;
                        case "routines":
                            monday.wakeUp();
                            monday.eatAtMorning();
                            monday.eatAtAfternoon();
                            monday.eatAtEvening();
                            monday.sleep();
                            break;
                        case "music":
                            monday.listenMusic();
                            break;
                        case "socialize":
                            monday.socialize();
                            break;
                        case "coding":
                            monday.code();
                            break;
                        case "other":
                            System.out.println("I have watched some Youtube videos about Jimi Hendrix's life.");
                            break;
                        default:
                            System.out.println("Invalid activity choice.");
                    }
                    break;
                case "tuesday":
                    //Kullanıcının monday seçiminde yaptığı gibi burada da önce aktivite seçmesini sonra da
                    // seçtiği aktivitenin tuesday objesi üzerinden içeriğini öğrenmesini sağlıyorum
                    System.out.println(" ");
                    System.out.println("Choose an activity to get to know me?");
                    System.out.println("  - Game");
                    System.out.println("  - Hobbies");
                    System.out.println("  - Routines");
                    System.out.println("  - Music");
                    System.out.println("  - Socialize");
                    System.out.println("  - Coding");
                    System.out.println("  - Other");
                    System.out.print(">");
                    String activity1 = scanner.nextLine();


                    switch (activity1.toLowerCase()) {
                        case "game":
                            tuesday.playGame();
                            break;
                        case "hobbies":
                            tuesday.playElectricGuitar();
                            tuesday.readBook();
                            break;
                        case "routines":
                            tuesday.wakeUp();
                            tuesday.eatAtMorning();
                            tuesday.eatAtAfternoon();
                            tuesday.eatAtEvening();
                            tuesday.sleep();
                            break;
                        case "music":
                            tuesday.listenMusic();
                            break;
                        case "socialize":
                            System.out.println("I haven't go out today, I was at home and pretty enjoyed by myself");
                            break;
                        case "coding":
                            tuesday.code();
                            break;
                        case "other":
                            System.out.println("I have watched Rick&Morty's 6.season, it was great");
                            break;
                        default:
                            System.out.println("Invalid activity choice.");
                    }
                    break;

                case "wednesday":
                    System.out.println(" ");
                    System.out.println("Choose an activity to get to know me?");
                    System.out.println("  - Game");
                    System.out.println("  - Hobbies");
                    System.out.println("  - Routines");
                    System.out.println("  - Music");
                    System.out.println("  - Socialize");
                    System.out.println("  - Coding");
                    System.out.println("  - Other");
                    String activity2 = scanner.nextLine();


                    switch (activity2.toLowerCase()) {
                        case "game":
                            System.out.println("I was too busy to play games, I wish that you are not playing games while you are busy");
                            break;
                        case "hobbies":
                           System.out.println("I haven't done anything about my hobbies except feeling well :)");
                            break;
                        case "routines":
                            wednesday.wakeUp();
                            wednesday.eatAtMorning();
                            wednesday.eatAtAfternoon();
                            wednesday.eatAtEvening();
                            wednesday.sleep();
                            break;
                        case "music":
                            System.out.println("I haven't go outside however we went to a concert.");
                            break;
                        case "socialize":
                            wednesday.concert();
                            break;
                        case "coding":
                            System.out.println("Pity me, I didn't code any line");
                            break;
                        case "other":
                            System.out.println("I did my workout and it felt prety fresh");
                            break;
                        default:
                            System.out.println("Invalid activity choice.");
                    }

                    break;
                case "thursday":
                    System.out.println(" ");
                    System.out.println("Choose an activity to get to know me?");
                    System.out.println("  - Game");
                    System.out.println("  - Hobbies");
                    System.out.println("  - Routines");
                    System.out.println("  - Music");
                    System.out.println("  - Socialize");
                    System.out.println("  - Coding");
                    System.out.println("  - Other");
                    System.out.println(">");
                    String activity3 = scanner.nextLine();


                    switch (activity3.toLowerCase()) {
                        case "game":
                            System.out.println("I was too busy to play games, I wish we could play later ;)");
                            break;
                        case "hobbies":
                            System.out.println("I haven't done anything about my hobbies and that makes me feel bad sometimes :)");
                            break;
                        case "routines":
                            thursday.wakeUp();
                            thursday.eatAtMorning();
                            thursday.eatAtAfternoon();
                            thursday.eatAtEvening();
                            thursday.sleep();
                            break;
                        case "music":
                            System.out.println("Listening music is my lifestyle, however I gave it a break so that I could enjoy more again.");
                            break;
                        case "socialize":
                            System.out.println("I was at home, except the times that I was at school. Nowadays, I love being at home all alone :)");
                            break;
                        case "coding":
                            thursday.code();
                            break;
                        case "other":
                            System.out.println("I watched Nefes which is a film about Turkish Soldiers around 1990's, that was my 3rd time. Besides, it has a special meaning for me.");
                            break;
                        default:
                            System.out.println("Invalid activity choice.");
                    }

                    break;
                case "friday":
                    System.out.println(" ");
                    System.out.println("Choose an activity to get to know me?");
                    System.out.println("  - Game");
                    System.out.println("  - Hobbies");
                    System.out.println("  - Routines");
                    System.out.println("  - Music");
                    System.out.println("  - Socialize");
                    System.out.println("  - Coding");
                    System.out.println("  - Other");
                    System.out.println(">");
                    String activity4 = scanner.nextLine();


                    switch (activity4.toLowerCase()) {
                        case "game":
                            friday.playGame();
                            break;
                        case "hobbies":
                            friday.playElectricGuitar();
                            friday.readBook();
                            break;
                        case "routines":
                            friday.wakeUp();
                            friday.eatAtMorning();
                            friday.eatAtAfternoon();
                            friday.eatAtEvening();
                            friday.sleep();
                            break;
                        case "music":
                            friday.listenMusic();
                            break;
                        case "socialize":

                            System.out.println("I was at home today, except I was at gym. Nowadays, I love being at home all alone :)");
                            break;
                        case "coding":
                            friday.code();
                            break;
                        case "other":
                            System.out.println("I have started watching Rick&Morty's 7.season. Which is a great series that I love.");
                            break;
                        default:
                            System.out.println("Invalid activity choice.");
                    }

                    break;
                case "saturday":
                    System.out.println(" ");
                    System.out.println("Choose an activity to get to know me?");
                    System.out.println("  - Game");
                    System.out.println("  - Hobbies");
                    System.out.println("  - Routines");
                    System.out.println("  - Music");
                    System.out.println("  - Socialize");
                    System.out.println("  - Coding");
                    System.out.println("  - Other");
                    System.out.println(">");
                    String activity5 = scanner.nextLine();


                    switch (activity5.toLowerCase()) {
                        case "game":
                            saturday.playGame();
                            break;
                        case "hobbies":
                            saturday.playElectricGuitar();
                            saturday.readBook();
                            break;
                        case "routines":
                            saturday.wakeUp();
                            saturday.eatAtMorning();
                            saturday.eatAtAfternoon();
                            saturday.eatAtEvening();
                            saturday.sleep();
                            break;
                        case "music":
                            saturday.listenMusic();
                            break;
                        case "socialize":
                            saturday.socialize();
                            break;
                        case "coding":
                            System.out.println("I haven't write any line of codes. I felt too bad so I'm gonna make it better.");
                            break;
                        case "other":
                            System.out.println("I have started watching Rick&Morty's 7.season. Which is a great series that I love.");
                            break;
                        default:
                            System.out.println("Invalid activity choice.");
                    }
                    break;
                case "sunday":
                    System.out.println(" ");
                    System.out.println("Choose an activity to get to know me?");
                    System.out.println("  - Game");
                    System.out.println("  - Hobbies");
                    System.out.println("  - Routines");
                    System.out.println("  - Music");
                    System.out.println("  - Socialize");
                    System.out.println("  - Coding");
                    System.out.println("  - Other");
                    System.out.println(">");
                    String activity6 = scanner.nextLine();


                    switch (activity6.toLowerCase()) {
                        case "game":
                            sunday.playGame();
                            break;
                        case "hobbies":
                            sunday.playElectricGuitar();
                            sunday.readBook();
                            break;
                        case "routines":
                            sunday.wakeUp();
                            sunday.eatAtMorning();
                            sunday.eatAtAfternoon();
                            sunday.eatAtEvening();
                            sunday.sleep();
                            break;
                        case "music":
                            sunday.listenMusic();
                            break;
                        case "socialize":
                            sunday.socialize();
                            break;
                        case "coding":
                            sunday.code();
                            break;
                        case "other":
                            System.out.println("I have started watching Rick&Morty's 7.season. Which is a great series that I love.");
                            break;
                        default:
                            System.out.println("Invalid activity choice.");
                    }
                    break;
                default:
                    System.out.println("Invalid day chosen");
                    break;
            }


        }


    }
}
