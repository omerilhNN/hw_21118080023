public class Monday extends Day implements ISocialize,IHobbies,ICoding{

    private String group,programmingLanguage;
    private String meetingPlace,book,game,music,song;

    public Monday(String breakfast, String lunch,
                  String dinner, String sleepHour,
                  String wakeUpHour,String group,
                  String meetingPlace,String book,
                  String game,String music,
                  String song,String progLang) {
        super(breakfast, lunch, dinner, sleepHour, wakeUpHour);
        this.group = group;
        this.meetingPlace = meetingPlace;
        this.book = book;
        this.game = game;
        this.music = music;
        this.song = song;
        this.programmingLanguage = progLang;
    }


    @Override
    public void socialize() {
        System.out.println("Today I have socialized with " +group+ " at " + meetingPlace);
    }

    @Override
    public void playGame() {
        System.out.println("I have played "+game+ " and that game is my favourite one.");
    }

    @Override
    public void playElectricGuitar() {
        System.out.println("I have played " +song+"on guitar.");
    }

    @Override
    public void readBook() {
        System.out.println("I have read "+book+" today. This book is type of philosophy and I love it");

    }

    @Override
    public void listenMusic() {
        System.out.println("I have listened "+music+" types of music.");
    }

    @Override
    public void eatAtMorning() {
        System.out.println("I have ate " +super.breakfast+ " this morning, student type");
    }

    @Override
    public void eatAtAfternoon() {
        System.out.println("I have ate " +super.lunch+ " this afternoon");
    }

    @Override
    public void eatAtEvening() {
        System.out.println("I have ate " +super.dinner+ " this evening");
    }

    @Override
    public void sleep() {
        System.out.println("I have slept at " +sleepHour+ " today");
    }

    @Override
    public void wakeUp() {
        System.out.println("I woke up at" +wakeUpHour);
    }

    @Override
    public void code() {
        System.out.println("I have been working on "+programmingLanguage+" lately.");
    }
}
