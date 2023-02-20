package dataStructurePractice.linklist;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class test {
	
	
	public static void main(String[] args) {
		
		List<Double> list = new ArrayList<>();
		
		list.add(66232.95);
		list.add(13254.15);
		System.out.println(list.stream().mapToDouble(a -> a).sum());
		DecimalFormat df = new DecimalFormat("#.00");
		double ll = Double.parseDouble(df.format(list.stream().mapToDouble(a -> a).sum()));
		System.out.println(ll);
		System.out.println(df.format(list.stream().mapToDouble(a -> a).sum()));
		
		
	}

}
