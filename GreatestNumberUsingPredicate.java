package pack.com;

import java.util.function.Predicate;

public class GreatestNumberUsingPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>gt = (i) -> i>10;
boolean b=gt.test(20);
if(b) {
	System.out.println("greater then 10");
}else {
	System.out.println("less than 10");
}
	}

}
