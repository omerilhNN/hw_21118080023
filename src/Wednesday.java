public class Wednesday extends Day implements IFitness,IConcert {
    private String artist,concertPlace,bodyPartToWorkout;

    public Wednesday(String breakfast, String lunch, String dinner, String sleepHour, String wakeUpHour
    ,String artist,String concertPlace,String bodyPartToWorkout) {
        super(breakfast, lunch, dinner, sleepHour, wakeUpHour);
        this.artist = artist;
        this.concertPlace = concertPlace;
        this.bodyPartToWorkout = bodyPartToWorkout;
    }

    @Override
    public void concert() {
        System.out.println("We have gone to "+artist+"'s concert at "+concertPlace);
    }

    @Override
    public void workout() {
        System.out.println("I have gone to fitness and worked "+bodyPartToWorkout);
    }

    @Override
    public void eatAtMorning() {
        System.out.println("I ate "+super.breakfast+" at morning");
    }

    @Override
    public void eatAtAfternoon() {
        System.out.println("I ate "+super.lunch+" at the afternoon");
    }

    @Override
    public void eatAtEvening() {
        System.out.println("I ate "+super.dinner+" at dinner");
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
