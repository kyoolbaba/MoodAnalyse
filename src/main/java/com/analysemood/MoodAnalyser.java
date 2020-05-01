package com.analysemood;

public class MoodAnalyser {
    private String happyOrSadMessage;
    public MoodAnalyser(String happyOrSadMessage) {
        this.happyOrSadMessage = happyOrSadMessage;
    }
    public String analyseMood() throws MoodException {
        try {
            if (happyOrSadMessage.length()==0)
                throw new MoodException(MoodException.ExceptionType.ENTERED_EMPTY,"No Mood Entered");
            else if(happyOrSadMessage.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodException(MoodException.ExceptionType.ENTERED_NULL,"No Mood Entered");
        }


    }
}
