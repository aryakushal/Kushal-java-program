package p11.com;

public class Vowelsconstraints {

	public static void main(String[] args) {
		String str="edu bridge";
		int v=0,c=0;
		
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v++;
			}
			else if((ch>='a'&&ch<='z')) {
				c++;
			}
		}
System.out.println("number of vowels :"+v);
System.out.println("number of consonants :"+c);
	}

}
