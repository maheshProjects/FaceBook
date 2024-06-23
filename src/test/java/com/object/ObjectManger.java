package com.object;

import com.pages.FirstPage;


public class ObjectManger {

	private FirstPage firstPage;
	
	public FirstPage getFirstPage() {

		return (firstPage == null) ? firstPage = new FirstPage() : firstPage;

	}

}
