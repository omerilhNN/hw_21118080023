public class Sunday extends Day implements ISocialize,IHobbies,ICoding{
    private String friends,game,musicType,progLang;
    public Sunday(String breakfast, String lunch, String dinner, String sleepHour, String wakeUpHour,
                  String friends,String game,String musicType,String progLang) {
        super(breakfast, lunch, dinner, sleepHour, wakeUpHour);
        this.friends = friends;
        this.game = game;
        this.musicType = musicType;
        this.progLang = progLang;
    }

    @Override
    public void playGame() {
        System.out.println("I have played "+game+ " like 1 hour and this is my favourite game to play. " );

    }

    @Override
    public void playElectricGuitar() {
        System.out.println("I played "+musicType+" types of music on my Telecaster guitar which sounds perfect for these songs");

    }

    @Override
    public void readBook() {

        System.out.println("I haven't started a new book today.");
    }

    @Override
    public void listenMusic() {
        System.out.println("I have listened "+musicType +" type of music. Which is one of my favourites");

    }

    @Override
    public void eatAtMorning() {
        System.out.println("I haven't ate something in morning");

    }

    @Override
    public void eatAtAfternoon() {
        System.out.println("I ate "+lunch+" at lunch. It was pretty simple and regular");

    }

    @Override
    public void eatAtEvening() {
        System.out.println("I ate " + dinner + "at the evening.");

    }

    @Override
    public void sleep() {
        System.out.println("I have slept at "+sleepHour);

    }

    @Override
    public void wakeUp() {
        System.out.println("I woke up at "+wakeUpHour);

    }

    @Override
    public void socialize() {
        System.out.println("I have met with my friends: "+friends);
    }

    @Override
    public void code() {
        System.out.println("I have worked on some Open Source Android projects with "+progLang+" and tried to comprehend what is their logic");
    }
}
