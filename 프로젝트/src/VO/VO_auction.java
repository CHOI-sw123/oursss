package VO;

import java.sql.Date;

public class VO_auction {

	private int auction_number;
	private String id;
	private String bookname;
	private int last_price;
	private Date auction_term;

	public VO_auction(int auction_number, String id, String bookname, int last_price, Date auction_term) {
		this.auction_number = auction_number;
		this.id = id;
		this.bookname = bookname;
		this.last_price = last_price;
		this.auction_term = auction_term;
	}

	public int getAuction_number() {
		return auction_number;
	}

	public void setAuction_number(int auction_number) {
		this.auction_number = auction_number;
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

	public int getLast_price() {
		return last_price;
	}

	public void setLast_price(int last_price) {
		this.last_price = last_price;
	}

	public Date getAuction_term() {
		return auction_term;
	}

	public void setAuction_term(Date auction_term) {
		this.auction_term = auction_term;
	}

}