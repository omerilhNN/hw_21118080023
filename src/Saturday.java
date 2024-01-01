public class Saturday extends Day implements IFitness,IHobbies,ISocialize{
    private String programmingLanguage,bodyPartToWorkout,game,song,musicType,book,friends;
    public Saturday(String breakfast, String lunch, String dinner, String sleepHour, String wakeUpHour
            ,String programmingLanguage,String bodyPartToWorkout,String game,
                    String song,String musicType,String book,String friends) {
        super(breakfast, lunch, dinner, sleepHour, wakeUpHour);
        this.programmingLanguage = programmingLanguage;
        this.bodyPartToWorkout = bodyPartToWorkout;
        this.game =game;
        this.song =song;
        this.musicType = musicType;
        this.book = book;
        this.friends = friends;
    }

    @Override
    public void workout() {
        System.out.println("I have done "+bodyPartToWorkout+ " exercises");

    }

    @Override
    public void playGame() {
        System.out.println("I have played "+game+ " like 1 hour and I love it. " );

    }

    @Override
    public void playElectricGuitar() {
        System.out.println("I played "+song+" on my Telecaster guitar which sounds perfect for these songs");

    }

    @Override
    public void readBook() {
        System.out.println("I have finished reading my" +book+" today");

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
        System.out.println("I ate "+lunch+" at lunch because of workout I needed to get required amount of protein");

    }

    @Override
    public void eatAtEvening() {
        System.out.println("I ate " + dinner + "at the evening. It was delicious");

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
        System.out.println("I socialized with "+friends);
    }
}
