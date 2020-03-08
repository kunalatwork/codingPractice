package FirstProject;

import java.util.Calendar;

public class calender {

	static int CurrentDate = 0, CurrentMonth = 0, CurrentYear = 0;

	static int TargetDate = 0, TargetMonth = 0, TargettYear = 0;

	static int JumpMonthby = 0;

	//static boolean increment = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Targetsetdate = "16/02/2020";
		
		GetCurrentDateMonthAndYear();
		System.out.println(CurrentDate+" "+CurrentMonth+" "+CurrentYear);

	}

	public static void GetCurrentDateMonthAndYear() {
		Calendar cal = Calendar.getInstance();
		CurrentDate = cal.get(Calendar.DAY_OF_MONTH);
		CurrentMonth = cal.get(Calendar.MONTH)+1;
		CurrentYear = cal.get(Calendar.YEAR);
	}

}
