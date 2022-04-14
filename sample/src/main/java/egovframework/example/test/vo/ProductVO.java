package egovframework.example.test.vo;

public class ProductVO {
	private int p_id;
	private	String p_name; 
	private	String p_img; 
	private	float p_price; 
	private	int p_total; 
	private	int p_discount;
	private	float p_star;
	private	int p_review; 
	private	int p_QnA; 
	
	
	public ProductVO() {
	}

	public ProductVO(int p_id, String p_name, String p_img, float p_price, int p_total, int p_discount, float p_star,
			int p_review, int p_QnA) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_img = p_img;
		this.p_price = p_price;
		this.p_total = p_total;
		this.p_discount = p_discount;
		this.p_star = p_star;
		this.p_review = p_review;
		this.p_QnA = p_QnA;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}

	public float getP_price() {
		return p_price;
	}

	public void setP_price(float p_price) {
		this.p_price = p_price;
	}

	public int getP_total() {
		return p_total;
	}

	public void setP_total(int p_total) {
		this.p_total = p_total;
	}

	public int getP_discount() {
		return p_discount;
	}

	public void setP_discount(int p_discount) {
		this.p_discount = p_discount;
	}

	public float getP_star() {
		return p_star;
	}

	public void setP_star(float p_star) {
		this.p_star = p_star;
	}

	public int getP_review() {
		return p_review;
	}

	public void setP_review(int p_review) {
		this.p_review = p_review;
	}

	public int getP_QnA() {
		return p_QnA;
	}

	public void setP_QnA(int p_QnA) {
		this.p_QnA = p_QnA;
	}

	@Override
	public String toString() {
		return "ProductVO [p_id=" + p_id + ", p_name=" + p_name + ", p_img=" + p_img + ", p_price=" + p_price
				+ ", p_total=" + p_total + ", p_discount=" + p_discount + ", p_star=" + p_star + ", p_review="
				+ p_review + ", p_QnA=" + p_QnA + "]";
	}
	
	
	
	
}
