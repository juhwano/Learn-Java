import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex11_Format_Date {

	public static void main(String[] args) throws Exception {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
		System.out.println(dateFormat.format(cal.getTime()));

		
		DecimalFormat df = new DecimalFormat("#,###.0");
		String result = df.format(1234567.89);
		System.out.println(result);
		
		
		 Date date = new Date();
		    long mstime =  date.getTime();
		    //getTime은 Date object가 January 1, 1970, 00:00:00 
		    //GMT부터 몇 밀리초나 지났는지 리턴해주는 역할을 합니다.
		    System.out.println("mstime :" + mstime);
		    
		    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			Date d1 = format.parse("02:10:10");
			System.out.println("d1 : " + d1);
			Date d2 = format.parse("01:05:07");
			System.out.println("d2 : "  + d2);
			long diff = d1.getTime() - d2.getTime();
			long sec = diff / 1000;
			long m = diff / 60000;
			long h = diff / 3600000;
			System.out.println("dif : " + diff + " "+  sec + "초 , " + m  + "분 , " + h  + "시 차이 발생");
		    /*
			 1000밀리초는 1초니까, getTime()으로 구한 값을 1000으로 나누면 초를 얻습니다.
	                마찬가지로 분을 구할 때는 1000*60=60000으로 나누고,
	                시를 구할 때는 1000*60*60=3600000으로 나눕니다.
			*/
			
			System.out.println(diffOfDate("20180101", "20180110"));
		}

		public static long diffOfDate(String begin, String end) throws Exception {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

			Date beginDate = formatter.parse(begin);
			Date endDate = formatter.parse(end);
			System.out.println("beginDate : " + beginDate);

			long diff = endDate.getTime() - beginDate.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000);

			return diffDays;
		}
}