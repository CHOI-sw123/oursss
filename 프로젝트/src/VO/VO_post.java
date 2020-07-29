package VO;

import java.sql.Date;

public class VO_post {

	private int post_number;
	private String id;
	private int form;
	private String post_title;
	private int hope_price;
	private String state;
	private Date date_created;
	private String bookname;
	private String author;
	private String publisher;
	private int price;
	private String condition;

	public VO_post(int post_number, String id, int form, String post_title, int hope_price, String state,
			Date date_created, String bookname, String author, String publisher, int price, String condition) {
		this.post_number = post_number;
		this.id = id;
		this.form = form;
		this.post_title = post_title;
		this.hope_price = hope_price;
		this.state = state;
		this.date_created = date_created;
		this.bookname = bookname;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.condition = condition;
	}

	public int getPost_number() {
		return post_number;
	}

	public void setPost_number(int post_number) {
		this.post_number = post_number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getForm() {
		return form;
	}

	public void setForm(int form) {
		this.form = form;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public int getHope_price() {
		return hope_price;
	}

	public void setHope_price(int hope_price) {
		this.hope_price = hope_price;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

}