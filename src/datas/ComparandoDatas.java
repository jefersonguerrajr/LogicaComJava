package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparandoDatas {
	
	public static void main(String args[]) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d1 = sdf.parse("06/06/1998");
		Date d2 = sdf.parse("06/06/2001");
		Date d3 = sdf.parse("06/06/1998");
		
		if (d1.equals(d2)) 
			System.out.println("d1 é igual a d2"); //f
		if (d1.equals(d3)) 
			System.out.println("d1 é igual a d3"); //v
		
		if(d2.after(d1))
			System.out.println("d2 é antes de d3");
		if(d1.before(d2))
			System.out.println("d1 é depois de d3");
		
		
	}

}
