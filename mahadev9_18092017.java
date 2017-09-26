package mahadev9;

import java.util.Scanner;

public class mahadev9_18092017 {

	public static void main(String[] args) {
		Scanner name_phone = new Scanner(System.in);
		int n = name_phone.nextInt();
		String name[] = new String[n];
		long phone[] = new long[n];
		for(int i=0; i<n;i++) {
			name[i] = name_phone.next();
			phone[i] = name_phone.nextLong();
			
		}
		while(name_phone.hasNext()) {
			String check_name = name_phone.next();
			for(int i=0;i<n;i++) {
				if(name[i].compareTo(check_name) == 0) {
					System.out.println(name[i] + "=" + phone[i]);
					break;
				}
				if(i == (n-1)) {
					System.out.println("Not Found");
				}
			}
		}
		
	}

}
