package egovframework.example.test.vo;

public class MemberVO {
	private int m_no;
	private String m_name;
	private String m_email;
	private String m_password;
	private String m_address;
	private String m_phone;
	
	
	public MemberVO() {
		
	}
	
	public MemberVO(int m_no, String m_name, String m_email, String m_password, String m_address, String m_phone) {
		super();
		this.m_no = m_no;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_password = m_password;
		this.m_address = m_address;
		this.m_phone = m_phone;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_address() {
		return m_address;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	@Override
	public String toString() {
		return "MemberVO [m_no=" + m_no + ", m_name=" + m_name + ", m_email=" + m_email + ", m_password=" + m_password
				+ ", m_address=" + m_address + ", m_phone=" + m_phone + "]";
	}
	
	
	
}
