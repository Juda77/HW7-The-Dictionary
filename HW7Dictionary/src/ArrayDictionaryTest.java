import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
	/*
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
    }
*/
    @Test
    public void remove() {
        // homework
    	
    	
    	
        assertTrue(false);  // place holder
    }

    @Test
    public void contains() {
        // homework
    	
    	int[] capacities = {0, 1, 2, 3, 3, 4};
    	int[][] keys = {
    			{},
    			{0},
    			{0, 1},
    			{0, 1},
    			{0, 1, 2},
    			{0, 1, 2, 4}
    	};
    	int[][] values = {
    			{},
    			{103},
    			{103, 105},
    			{103, 105},
    			{103, 105, 206},
    			{103, 105, 206, 407}
    	};

    	ArrayDictionary[] testDictionaries = new ArrayDictionary[6];  
    	//construct test dictionaries
    	for (int i = 0; i < keys.length; i++) {
    		ArrayDictionary testDictionary = new ArrayDictionary(capacities[i]);
    		for (int j = 0; j < keys[i].length; j++) {
    			testDictionary.add(keys[i][j], values[i][j]);
    			
    		}
    		testDictionaries[i] = testDictionary;
    	}
    	
    	int[][] testKeys = {
    			{-1, 0, 1},
    			{2, 0},
    			{0, 1, 2, 3},
    			{3}, 
    			{1},
    			{1, 4, 7, 8}
    	};
    	
    	boolean[][] expected = {
    			{false, false, false},
    			{false, true},
    			{true, true, false, false},
    			{false},
    			{true},
    			{true, true, false, false}
    			
    	};
    	
    	
    	for (int i = 0; i < testDictionaries.length; i++) {
    		for (int j = 0; j < testKeys[i].length; j++) {
    			assertEquals(expected[i][j], testDictionaries[i].contains(testKeys[i][j]));
 
    		}
    		
    	}
    	
    	
        
    }
}