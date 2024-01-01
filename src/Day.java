public abstract class Day implements IRoutines {

    //Protected değişkenler oluşturdum çünkü bu classtan extend eden gün classları da bu değişkenlere erişebilsin
    protected String breakfast;
    protected String lunch;
    protected String dinner;
    protected String sleepHour,wakeUpHour;

    //Constructors
    public Day(String breakfast,String lunch,String dinner,String sleepHour,String wakeUpHour){
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
        this.sleepHour = sleepHour;
        this.wakeUpHour = wakeUpHour;
    }

//Getter Setters
    public String getBreakfast() {
        return breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public String getSleepHour() {
        return sleepHour;
    }

    public String getWakeUpHour() {
        return wakeUpHour;
    }

}
