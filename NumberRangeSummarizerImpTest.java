package org.example;

import static junit.framework.Assert.assertEquals;

public class NumberRangeSummarizerImpTest {
    @Test
    void NumberRangeSummarizerTest(){
        NumberRangeSummarizerImpl numberTest = new NumberRangeSummarizerImpl();
        assertEquals("1,3,6,7,{8,12},13,14,{15,21},22,23,24,31","1, 3, 6-8, 12-15, 21-24, 31");
    }
    
}
