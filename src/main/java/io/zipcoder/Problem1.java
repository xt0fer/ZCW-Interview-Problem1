package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    private static Map<Character, Character> map = new HashMap<Character, Character>()
    {
        {
            // { ‘f’ : ‘7’, ‘s’:’$’, ‘1’:’!’, ‘a’.:’@’}
            put('f' , '7');
            put('s', '$');
            put('a', '@');
            put('1', '!');
        }
    };
    public static String inputString = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
    public static String outputString = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";

    public String convertToGibberish(String stringToChange) {
        String outString = "";
        for (char ch: stringToChange.toCharArray()) {
            char lch = Character.toLowerCase(ch);
            if (map.containsKey(lch)){
                outString = outString + map.get(lch);
            } else {
                outString = outString + ch ;
            }
        }
        return outString;
    }

    public String recurseToGibberish(String stringToChange) {
            if (stringToChange.length() == 0)
                return stringToChange;
            //Calling Function Recursively
            Character ch = stringToChange.charAt(0);
            Character tc = Character.toLowerCase(ch);
            if (map.containsKey(tc)){
                tc =  map.get(tc);
            } else {
                tc = ch;
            }
            return  tc + recurseToGibberish(stringToChange.substring(1));
    }

}
