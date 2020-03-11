import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
	
	
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);

        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
    }

    @Test
    public void remove() {
        // homework
    	
    	ArrayDictionary[] testDictionaries = new ArrayDictionary[6]; 
    	int[] capacities = {0, 3, 3, 2, 3, 2};
    	int[][] keys = {
    			
    			{}, //empty dict
    			{1, 3}, //no collision, key = 3, cap 3
    			{1, 2, 3}, //no collision, key = 4 			
    			{1, 2, 3}, //collision, key = 3
    			
    			{1, 2, 3, 6}, //collision, capacity: 3, key = 1
    			{2, 3, 4} //collision, key = 5 cap 2
    			
    	};
    	
    	//populate test dictionaries
    	for (int i = 0; i < testDictionaries.length; i++) {
    		ArrayDictionary test = new ArrayDictionary(capacities[i]);
    		for (int j = 0; j < keys[i].length; j++) {
    			//value does not matter; inset 1 for every value
    			test.add(keys[i][j], 1);;
    		}	
    		testDictionaries[i] = test;
    		//System.out.println(i + " " + test);
    	}
    	
    	String[] expectedStrings = {
    			"", 
    			"dictionary[0] = null\ndictionary[1] = {(1, 1)}\ndictionary[2] = null\n",
    			"dictionary[0] = {(3, 1)}\ndictionary[1] = {(1, 1)}\ndictionary[2] = {(2, 1)}\n",
    			"dictionary[0] = {(2, 1)}\ndictionary[1] = {(1, 1)}\n",
    			"dictionary[0] = {(3, 1)(6, 1)}\ndictionary[1] = null\ndictionary[2] = {(2, 1)}\n",
    			"dictionary[0] = {(2, 1)(4, 1)}\ndictionary[1] = {(3, 1)}\n"	
    	};
    	
    	boolean[] expectedBooleans = {false, true, false, true, true, false};
    	
    	int[] keysToRemove = {3, 3, 4, 3, 1, 5};
    	
    	for (int i = 0; i < testDictionaries.length; i++) {
    		//test if return values are correct
    		assertEquals(expectedBooleans[i], testDictionaries[i].remove(keysToRemove[i]));
    		
    		//test if dictionaries are correct after removal
    		assertEquals(expectedStrings[i], testDictionaries[i].toString());
    		
    	}
    	
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