public class CDate {
	private int day,month,year;
	public boolean whatYear(int y) {//计算是闰年还是平年
		if(y%4==0) {
			this.year=y;
			return true;
		}
		else {
			this.year=y;
			return false;
		}
	}
	public int daysInMonth(int m) {//计算某个月的天数（在某一年内）
		this.month=m;
		if(whatYear(year)==true&&month==2) {
			return 29;
		}
		if(whatYear(year)!=true&&month==2) {
			return 28;
		}
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			return 31;
		}
		if(month==4||month==6||month==9||month==11) {
			return 30;
		}
		return 0;
	}
	public int howManyDays(int d) {//计算某一日期在该年内算第几天
		this.day=d;
		int s=day;
		for(month=month-1;month>0;month--) {
			s+=daysInMonth(month);
		}
		return s;
	}
}
