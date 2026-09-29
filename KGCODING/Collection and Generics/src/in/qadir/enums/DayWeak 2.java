package in.qadir.enums;

public enum DayWeak
{
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURESDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private boolean isWeakDay;

    DayWeak(boolean isWeakDay)
    {
        this.isWeakDay = isWeakDay;
    }

    public String getType()
    {
        return isWeakDay ? "Weak Day" : "Weakend";
    }
}
