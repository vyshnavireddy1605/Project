
public class Tourist 
{
	private int RId;
    private String name;
    private String address;
    private String email;
    private int age;
    private long Contact;
    public Tourist()
    {
    super();	
    }
	public Tourist(int rId, String name, String address, String email, int age, long contact) {
		super();
		RId = rId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.age = age;
		Contact = contact;
	}
	public int getRId() {
		return RId;
	}
	public void setRId(int rId) {
		RId = rId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
	}
	@Override
	public String toString() {
		return "Tourist [RId=" + RId + ", name=" + name + ", address=" + address + ", email=" + email + ", age=" + age
				+ ", Contact=" + Contact + "]";
	}
	
}
