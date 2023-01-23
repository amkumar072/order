package com.example.order;

public class OrderApplication {

	public static void main(String[] args) {

		OrderApplication orderApplication= new OrderApplication();
		orderApplication.payment(ProductTypes.Video);
		orderApplication.payment(ProductTypes.Book);

		orderApplication.payment(ProductTypes.ActiveMembership);
		orderApplication.payment(ProductTypes.UpgradeMembership);
	}

	public Product payment(ProductTypes productTypes){
		Product product = null;
		switch (productTypes) {
			case Book:
				System.out.println("Calling Book");
				product = new Book();
				break;
			case Video:
				System.out.println("Calling Video");
				product = new Video("Learning to Ski");
				break;
			case ActiveMembership:
				System.out.println("Calling ActiveMembership");
				product = new ActiveMemberShip();
				break;
			case UpgradeMembership:
				System.out.println("Calling UpgradeMembership");
				product = new UpgradeMemberShip();
				break;
		}

		return product;
	}

}
