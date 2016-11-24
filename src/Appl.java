import com.softserve.edu.RegularExspressionsHomework;
import com.softserve.LoginTest;



public class Appl {

	public static void main(String[] args) {

		String param = "<table>\n" +
				"\t<tr>     <th>Month</th>    <th>Count of days</th>   </tr>\n" +
				"\t<tr>     <td>January</td>     <td>30</td>    </tr>\n" +
				"\t<tr>      <td>February</td>   <td>28</td>   </tr>\n" +
				"\t<tr>      <td>March</td>       <td>31</td>    </tr>\n" +
				"\t</table>";

		System.out.println(RegularExspressionsHomework.doHomework(param));

//		WebDriver driver = ?new FirefoxDriver( );

		LoginTest.runtest();
	}

/*	*/

}
