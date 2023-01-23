package com.example.order;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class OrderApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void BookTest(){
		Product product = productTest(ProductTypes.Book);
		Assert.assertEquals(true,product.listOfitems.contains("A packing slip for shipping"));
	}

	@Test
	void BookTestDuplicateSlip(){
		Product product = productTest(ProductTypes.Book);
		Assert.assertEquals(true,product.listOfitems.contains("Duplicate packing slip for the royalty department"));
	}

	@Test
	void VideoTest(){
		Product product = productTest(ProductTypes.Video);
		Assert.assertEquals(true,product.listOfitems.contains("A packing slip for shipping"));
	}

	@Test
	void VideoTestFirstAid(){
		Product product = productTest(ProductTypes.Video);
		Assert.assertEquals(true,product.listOfitems.contains("Added a free “First Aid” video to the packing slip"));
	}

	@Test
	void VideoTestError(){
		Product product = productTest(ProductTypes.Video);
		Assert.assertEquals(false,product.listOfitems.contains("Added free “First Aid” video to the packing slip"));
	}


	@Test
	void ActiveMemberShipTest(){
		Product product = productTest(ProductTypes.ActiveMembership);
		Assert.assertEquals(true,product.listOfitems.contains("Activate Membership"));
	}

	@Test
	void ActiveMemberShipTestEamil(){
		Product product = productTest(ProductTypes.ActiveMembership);
		Assert.assertEquals(true,product.listOfitems.contains("Email sent"));
	}


	@Test
	void UpgradeMemberShipTest(){
		Product product = productTest(ProductTypes.UpgradeMembership);
		Assert.assertEquals(true,product.listOfitems.contains("Upgrade Membership"));
	}

	@Test
	void UpgradeMembershipTestEamil(){
		Product product = productTest(ProductTypes.UpgradeMembership);
		Assert.assertEquals(true,product.listOfitems.contains("Email sent"));
	}

	private Product productTest(ProductTypes productTypes) {
		OrderApplication orderApplication= new OrderApplication();
		return orderApplication.payment(productTypes);

	}

}
