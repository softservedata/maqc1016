package com.softserve.my;
	import java.util.regex.*;    
	public class RegexTest {    
		public static void main(String args[ ]) {        
	String pattern = ">[A-Za-z]+[^<]+<";        
	String text = "<table>  <tr>     <th>Month</th>    <th>Count of days</th>   </tr>  <tr>     <td>January</td>     <td>30</td>    </tr>  <tr>      <td>February</td>   <td>28</td>   </tr>  <tr>      <td>March</td>       <td>31</td>    </tr></table>";        
			Pattern p = Pattern.compile(pattern);        
			Matcher m = p.matcher(text);        
				while (m.find( )) {           
	System.out.print(text.substring(m.start( ), m.end( ))+"*");    
				}
		}
	}