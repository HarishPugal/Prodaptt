package newpackages;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
 
public class FriendShipFinder {
	public static void main(String[] args) {
		List<FriendshipAreaCriteria<String, String>> friendslist = new ArrayList<>();
		friendslist.add(new FriendshipAreaCriteria<>("Preethi", "Sengalsoolai"));
		friendslist.add(new FriendshipAreaCriteria<>("Ashwin", "Tuticorin"));
		friendslist.add(new FriendshipAreaCriteria<>("Rajesh", "Tuticorin"));
		friendslist.add(new FriendshipAreaCriteria<>("Amirtha", "Hosur"));
		friendslist.add(new FriendshipAreaCriteria<>("Dharani", "Maiyiladadurai"));
		friendslist.add(new FriendshipAreaCriteria<>("Priya", "Chennai"));
		friendslist.add(new FriendshipAreaCriteria<>("JV", "KKK Nagar"));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter the Location you want..?");
		String targetLocation = sc.next();
		
		List<FriendshipAgeCriteria<String, Integer>> friendslist1 = new ArrayList<>();
		friendslist1.add(new FriendshipAgeCriteria<>("Preethi", 21));
		friendslist1.add(new FriendshipAgeCriteria<>("Ashwin", 22));
		friendslist1.add(new FriendshipAgeCriteria<>("Rajesh", 23));
		friendslist1.add(new FriendshipAgeCriteria<>("Amirtha", 24));
		friendslist1.add(new FriendshipAgeCriteria<>("Dharani", 24));
		friendslist1.add(new FriendshipAgeCriteria<>("Priya", 25));
		friendslist1.add(new FriendshipAgeCriteria<>("JV", 22));
 
		for (FriendshipAreaCriteria<String, String> friend : friendslist) {
			if (friend.getAttribute().equalsIgnoreCase(targetLocation)) {
				System.out.println(friend.getName() + " is a nearest friend.");
			}
		}
		System.out.println( "Enter the Age you want..?");
		int targetage = sc.nextInt();
		for (FriendshipAgeCriteria<String, Integer> friend : friendslist1) {
			if (friend.getage()==targetage) {
				System.out.println(friend.getName() + " is a same age friend.");
			}
		}
		sc.close();
	}
}
 

