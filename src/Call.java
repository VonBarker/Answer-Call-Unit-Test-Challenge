public class Call {

    String callerCode;
    boolean sameAreaCode;
    String currentTime;

    public Call(String CallerCode, boolean SameAreaCode, String CurrentTime)
    {
        callerCode = CallerCode;
        sameAreaCode = SameAreaCode;
        currentTime = CurrentTime;
    }

    public boolean answerCall()
    {
        boolean answer = false;

        String currentHourString = currentTime.substring(0,2);
        int currentHour = Integer.valueOf(currentHourString);
        if(currentHour > 7 && currentHour < 22)
        {
            if(callerCode.equals("F") || callerCode.equals("R")) answer = true;
            else if(callerCode.equals("U") && sameAreaCode) answer = true;
        }
        return answer;
    }
}
