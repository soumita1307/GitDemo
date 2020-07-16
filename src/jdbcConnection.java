import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcConnection {
	public static void main(String[] args) throws SQLException
	{
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt","root","Soujune@2020");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employeeinfo where name='soumita'");
		
		while(rs.next())
		{
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(rs.getString("name"));
		//System.out.println(rs.getInt("id"));
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(rs.getString("name"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		int k=0;
		for(int i=0;i<4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				k++;
				System.out.print(k);
				System.out.print("\t");
			}
			System.out.println();
		}
		int l=0;
		for(int i=4;i>0;i--)
		{
			for(int j=0;j<=4-i;j++)
			{
				l++;
				System.out.print(l);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		int arr[][]= {{4,2,3},{1,7,6},{5,9,10}};
		int index=0;
		int min=arr[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(min>arr[i][j])
				{
					min=arr[i][j];
					index=j;
				}
			}
		}
		System.out.println("The smallest number is"+min);
		
		int max=min;
		for(int i=0;i<3;i++)
		{
			if(arr[i][index]>max)
			{
				max=arr[i][index];
			}
		}
		System.out.println("The maximum number in the same column is"+max);
		Date d=new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdt=new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdt.format(d));
		System.out.println(d.toString());
		
		Calendar cal=Calendar.getInstance();
		System.out.println(sdt.format(cal.getTime()));
		System.out.println(cal.DAY_OF_MONTH);
	}

}
