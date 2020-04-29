package com;

public class MoodAnalyser {
    private String happyOrSadMessage;
    public MoodAnalyser(String happyOrSadMessage) {
        this.happyOrSadMessage = happyOrSadMessage;
    }
    public String analyseMood() {
        if(happyOrSadMessage.contains("Sad")){
            return "SAD";
        }else {
            return "HAPPY";
        }
    }
}
