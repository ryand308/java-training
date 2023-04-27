import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Intercalary
{
	public static void main(String[] args)
	{
		/*被 4 整除  => 閏年
		  被 100 整除=> 平年
		  被 400 整除=> 閏年*/
		String yearString = JOptionPane.showInputDialog("請輸入年份數值:");
		int year = Integer.parseInt(yearString);
		boolean what;
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					//閏
					what = true;
				}else{
					//平
					what = false;
				}
			}else{
				//閏
				what = true;
			}
		}else{
			//平
			what = false;
		}

		if(what){
			JOptionPane.showMessageDialog(null, "閏年");
		}else{
			JOptionPane.showMessageDialog(null, "平年");
		}
	}
}
