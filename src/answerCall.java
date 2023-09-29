public class answerCall {

    boolean answer = false;

    public answerCall(String callerCode, boolean sameAreaCode, String currentTime)
    {
        String currentHourString = currentTime.substring(0,2);
        int currentHour = Integer.valueOf(currentHourString);
        if(currentHour > 7 && currentHour < 22)
        {
            answer = true;
        }
        System.out.println(answer);
    }
}
