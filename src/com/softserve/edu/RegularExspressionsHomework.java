package com.softserve.edu;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dshevch on 14.11.2016.
 */
public class RegularExspressionsHomework {

    public static ArrayList <String> doHomework(String input) {

        ArrayList<String> result = new ArrayList<String>();

        String[]lines = input.split("\n");
        for(String tmpLine : lines) {
            Pattern p = Pattern.compile("<tr>.*<td>(.*)</td>.*<td>");
            Matcher m = p.matcher(tmpLine);
            if(m.find()) {
                result.add(m.group(1));
            }

        }

        return result;
    }

}
