import java.util.HashMap;

public class TimeZoneDemo
{
    HashMap<String, Integer> hashMap = new HashMap();
    public static void main(String[] args)
    {
        TimeZoneDemo timeZoneDemo = new TimeZoneDemo();
        timeZoneDemo.demo();

    }
    private void demo()
    {
        hashMap.put("EST", -5);
        hashMap.put("CST", -6);
        hashMap.put("MST", -7);
        hashMap.put("PST", -8);
        hashMap.put("GMT", 0);

       System.out.println("Result: " + getTimeDiff("PST","EST"));

    }
    private int getTimeDiff(String timeZone1, String timeZone2)
    {

        int time1 = hashMap.get(timeZone1);
        int time2 = hashMap.get(timeZone2);

       int answer = time1-time2;
       return answer;

    }
}
