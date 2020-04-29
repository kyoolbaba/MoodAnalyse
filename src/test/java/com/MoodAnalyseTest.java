package com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyseTest {
    private   MoodAnalyser moodAnalyser;
    @Before
    public void setUp() throws Exception {
         moodAnalyser = new MoodAnalyser();
    }

    @Test
    public void moodAnalyseShouldReturnSAD() {
        String mood=moodAnalyser.analyseMood("Im in Sad Mood");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void moodAnalyseShouldReturnHAPPY() {
        String mood=moodAnalyser.analyseMood("Im in any Mood");
        Assert.assertEquals("HAPPY",mood);
    }
}
