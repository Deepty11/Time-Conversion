import java.util.*;
public class timeConversion {
	

	public static void main(String[] args) {
		input();

	}
	public static  void input(){
		Scanner scanner= new Scanner(System.in);
		String time;
		time=scanner.next();
		char c= time.charAt(8);
		String hh=time.substring(0,2);
		String mm=time.substring(3,5);
		String ss=time.substring(6,8);
		int hour=Integer.parseInt(hh);
		String newHour=new String();
		if(c=='P'){
			
			if(hour<12){
			hour=hour+12;
			 newHour=Integer.toString(hour);
			}
			else{
			 newHour=Integer.toString(hour);
			}
			StringBuilder newTime= new StringBuilder();
			newTime.append(newHour).append(":").append(mm).append(":").append(ss).append("\n");
			
		    System.out.print(newTime);
		    
			
		}
		else if(c=='A'){
			if(hour==12){
				hh="00";
				StringBuilder newTime= new StringBuilder();
				newTime.append(hh).append(":").append(mm).append(":").append(ss).append("\n");
				System.out.print(newTime);
				
			}
			else{
				StringBuilder newTime= new StringBuilder();
				newTime.append(hh).append(":").append(mm).append(":").append(ss).append("\n");
				System.out.print(newTime);
				
			}
		}
		
	}

}
