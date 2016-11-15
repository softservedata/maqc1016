package com.string.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHomeWork {

	public static void main(String[] args) {
		List<String> result = new ArrayList<>();
		String pattern = "r> *<t[hd]>([a-zA-Z]*)<";
		String text = 	"<table>" + 
						"<tr>     <th>Month</th>    <th>Count of days</th>   </tr>" +
						"<tr>     <td>January</td>     <td>30</td>    </tr>" +
						"<tr>      <td>February</td>   <td>28</td>   </tr>" +
						"<tr>      <td>March</td>       <td>31</td>    </tr>" +
						"</table>";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		while (m.find()) {
			result.add(m.group(1));
		}
		System.out.println("[First Table Column:]");
		for (String element : result) {
			System.out.print(element + "\n");
		}
		System.out.print("[The End]");
	}

}
