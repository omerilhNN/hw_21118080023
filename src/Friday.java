public class Friday extends Day implements IFitness,ICoding,IHobbies{
    private String programmingLanguage,bodyPartToWorkout,game,song,musicType;

    public Friday(String breakfast, String lunch, String dinner, String sleepHour,
                  String wakeUpHour,String programmingLanguage,String bodyPartToWorkout,String game,
                  String song,String musicType) {
        super(breakfast, lunch, dinner, sleepHour, wakeUpHour);
        this.programmingLanguage = programmingLanguage;
        this.bodyPartToWorkout = bodyPartToWorkout;
        this.game =game;
        this.song =song;
        this.musicType = musicType;
    }

    @Override
    public void code() {
        System.out.println("I wrote code with "+ programmingLanguage);
    }

    @Override
    public void workout() {
        System.out.println("I have done "+bodyPartToWorkout+ " exercises");
    }

    @Override
    public void playGame() {
        System.out.println("I have played "+game+ " and I love it. " );
    }

    @Override
    public void playElectricGuitar() {
        System.out.println("I played "+song+" on my Telecaster guitar which sounds perfect for these songs");
    }

    @Override
    public void readBook() {
        System.out.println("I haven't read any book today");
    }

    @Override
    public void listenMusic() {
        System.out.println("I have listened "+musicType +" type of music. Which is my favourite one");
    }

    @Override
    public void eatAtMorning() {
        System.out.println("I ate "+ super.breakfast +" at morning");
    }

    @Override
    public void eatAtAfternoon() {
        System.out.println("I ate "+lunch+" at lunch");
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
}
