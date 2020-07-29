package VO;

import java.sql.Date;

public class rental {

	private int rental_number;
	private String id;
	private String bookname;
	private Date rental_term;

	public rental(int rental_number, String id, String bookname, Date rental_term) {
		this.rental_number = rental_number;
		this.id = id;
		this.bookname = bookname;
		this.rental_term = rental_term;
	}

	public int getRental_number() {
		return rental_number;
	}

	public void setRental_number(int rental_number) {
		this.rental_number = rental_number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public Date getRental_term() {
		return rental_term;
	}

	public void setRental_term(Date rental_term) {
		this.rental_term = rental_term;
	}

}