package com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyseTest {

    @Test
    public void moodAnalyseShouldReturnSAD() {
        MoodAnalyser moodAnalyser=new MoodAnalyser("Im in a Sad Mood");
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void moodAnalyseShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser=new MoodAnalyser("Im in a Happy Mood");
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}
