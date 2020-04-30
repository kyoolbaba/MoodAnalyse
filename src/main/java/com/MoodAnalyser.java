package com;

public class MoodAnalyser {
    private String happyOrSadMessage;
    public MoodAnalyser(String happyOrSadMessage) {
        this.happyOrSadMessage = happyOrSadMessage;
    }
    public String analyseMood()throws MoodException {
        try {
            if (happyOrSadMessage.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodException("Please enter proper mood");
        }


    }
}
