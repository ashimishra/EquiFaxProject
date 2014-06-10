package com.pojo.vo;

import java.util.ArrayList;
import java.util.List;

public class BookList {
	
	private List<BookVO> bookList;

	public List<BookVO> getBookList() {
		if(this.bookList == null)
			bookList = new ArrayList<BookVO>();
		return bookList;
	}

	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}

	

}
