package FeeManagement;

public class Student {
	private int id;
	private String name;
	private int totalFee;
	private int paidFee;
	private int contactNo;
	private String mailId;
	
	Student(int id,String name,int contactNo,String mailId){
		this.totalFee = 50000;
		this.paidFee = 0;
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.mailId = mailId;		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPaidFee() {
		return paidFee;
	}
	
	public int getContactNo() {
		return contactNo;
	}
	
	public int getTotalFee() {
		return totalFee;
	}
	
	public void payFees(int fees) {
		paidFee += fees;
		Organization.updateTotalMoneyEarned(paidFee);
	}
	
	public int getRemainingFee() {
		return totalFee-paidFee;
	}
	
	public String toString() {
		return "Student Name: "+id+"."+name+" || Total Fee Paid: "+paidFee+" || remaining fee: "+getRemainingFee();
	}

}
