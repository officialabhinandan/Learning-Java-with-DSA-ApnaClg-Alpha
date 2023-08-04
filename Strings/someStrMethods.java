package Strings;

import java.util.Scanner;

public class someStrMethods {
    	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.nextLine();
	    String s2 = sc.nextLine();
	    int n = sc.nextInt();
	    String m = sc.next();
	    String o = sc.next();
	    
	    System.out.println(s1.regionMatches(0,s2,0,n));
	    System.out.println(s1.length());
	    System.out.println(s2.length());
	    System.out.println(s1.indexOf(m));
	    System.out.println(s1.lastIndexOf(o));
	    System.out.println(s1.startsWith("h"));
	    System.out.println(s1.endsWith("o"));
	    System.out.println(s1.toUpperCase());
	    System.out.println(s1.toLowerCase());
	    System.out.println(s2.substring(2));
	    System.out.println(s1.substring(2,5));

		String a = "Hello, world";
		System.out.println(a.contains("Hello"));  //return type boolean, checks wheather the part contains in original string or not
		System.out.println(a.isEmpty()); //return type boolean (returns false)
		System.out.println("Replacing Hello with Bolo:- " + a.replace("Hello", "Bolo")); 
		String b = "        Mera desh badal raha, hai age bar raha hai        ";
		System.out.println(b.trim());  // trims the space 
		String c = "Hello,hii,bye,bye";
		String[] arrOfC = c.split(",");
		for(String i : arrOfC){
			System.out.print(i + " ");
		} System.out.println();
        String x = "West ";
		String y = "Bengal";
		System.out.println(x.concat(y));


        sc.close();
	}
}
