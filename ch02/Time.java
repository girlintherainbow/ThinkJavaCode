public class Time
{
    public static void main(String[] args)
    {
       int hour = 15;
       int minute = 5;
       int second  = 15;

System.out.print("Number of seconds since midnight: ");
System.out.println(hour * 60 * 60 + minute * 60 + second);

int day = 24;

int secondssincemidnight = 54315;
int secondsperday = 86400;

System.out.print("Number of Seconds Remaining in Day: ");
System.out.println(day * 60 * 60 - secondssincemidnight);

System.out.print("Percentage of Day Passed: ");
System.out.println(secondsperday / secondssincemidnight);

int hour1 = 15;
int minute1 = 52;
int second1 = 30;

System.out.println("Time Elapsed: ");
System.out.print(minute1 * 60);
System.out.print(" seconds");
    }
}
