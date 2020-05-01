package com.analysemood;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyseTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void moodAnalyseShouldReturnSAD() throws MoodException {
        MoodAnalyser moodAnalyser=new MoodAnalyser("Im in a Sad Mood");
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void moodAnalyseShouldReturnHAPPY() throws MoodException {
        MoodAnalyser moodAnalyser=new MoodAnalyser("Im in a Happy Mood");
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullShouldReturnHappy() throws MoodException {
    MoodAnalyser moodAnalyser= new MoodAnalyser(null);
    try{
        moodAnalyser.analyseMood();
    }catch (MoodException e){
        Assert.assertEquals(MoodException.ExceptionType.ENTERED_NULL,e.type);
    }

    }
    @Test
    public void givenEmptyShouldReturnHappy() throws MoodException {
        MoodAnalyser moodAnalyser= new MoodAnalyser("");
        try{
            moodAnalyser.analyseMood();
        }catch (MoodException e){
            Assert.assertEquals(MoodException.ExceptionType.ENTERED_EMPTY,e.type);
        }

    }



     }



