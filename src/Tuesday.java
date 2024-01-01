public  class Tuesday extends Day implements ICoding,IHobbies {
    private String programmingLanguage;
    private String book,game,music,song;
    public Tuesday(String breakfast, String lunch, String dinner, String sleepHour, String wakeUpHour,
                   String programmingLanguage,String book, String game,String music,String song) {
        super(breakfast, lunch, dinner, sleepHour, wakeUpHour);
        this.programmingLanguage =programmingLanguage;
        this.book = book;
        this.game = game;
        this.music = music;
        this.song = song;
    }

    @Override
    public void eatAtMorning() {
       System.out.println("I ate" +super.breakfast+"this morning, student style");
    }

    @Override
    public void eatAtAfternoon() {
        System.out.println("I ate " +super.lunch+" this afternoon");

    }

    @Override
    public void eatAtEvening(){
        System.out.println("I ate" +super.dinner+"this");
    }

    @Override
    public void sleep() {
        System.out.println("I slept at " +sleepHour);
    }

    @Override
    public void wakeUp() {
        System.out.println("I woke up at " + wakeUpHour);
    }

    @Override
    public void code() {
        System.out.println("I have written code with "+programmingLanguage +" and I will shape my future on that field");
    }

    @Override
    public void playGame() {
        System.out.println("I have played "+game+" today and I love it");
    }

    @Override
    public void playElectricGuitar() {
        System.out.println("I played" +song+ " on guitar.Which is one of my favourite");
    }

    @Override
    public void readBook() {
        System.out.println("I have read "+book+"before I sleep");
    }

    @Override
    public void listenMusic() {
        System.out.println("I didn't listen to music today because I wanted to stop dopamine rush");
    }
}
