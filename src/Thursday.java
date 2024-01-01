public class Thursday extends Day implements ISchool,ICoding {
    private String lesson,programmingLanguage;
    public Thursday(String breakfast, String lunch, String dinner, String sleepHour, String wakeUpHour
    ,String programmingLanguage,String lesson) {
        super(breakfast, lunch, dinner, sleepHour, wakeUpHour);
        this.programmingLanguage = programmingLanguage;
        this.lesson = lesson;
    }

    @Override
    public void code() {
        System.out.println("I worked on "+programmingLanguage+"and I want to be an Android Developer");
    }

    @Override
    public void eatAtMorning() {
        System.out.println("I ate "+super.breakfast+" student type of breakfast :)");
    }

    @Override
    public void eatAtAfternoon() {
        System.out.println("I ate "+super.lunch+" at school");
    }

    @Override
    public void eatAtEvening() {
        System.out.println("I ate "+super.dinner);
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
    public void lesson() {
        System.out.println("I have attended "+lesson+" classes");
    }
}
