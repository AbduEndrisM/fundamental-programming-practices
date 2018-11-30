package lesson3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDates {
public static  void name(String []args) throws ParseException {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    Date firstDate = sdf.parse("01/01/2014");
    Date secondDate = sdf.parse("15/03/2014");

    if(firstDate.before(secondDate)){
        System.out.println("firstDate <  secondDate");
    }
    else if(firstDate.after(secondDate)){
        System.out.println("firstDate >  secondDate");
    }
    else if(firstDate.equals(secondDate)){
        System.out.println("firstDate = secondDate");
    }
	
}
}
