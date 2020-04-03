package JavaLang;

public class FinalObjectDemo {
	
	final int empNo;
	String empName;	

	public FinalObjectDemo(int empNo, String empName) {super();this.empNo = empNo;this.empName = empName;}
	public int getEmpNo() { return empNo;}
	public String getEmpName() {return empName; }
	//--ERROR: Set to Finalpublic void setEmpNo(int empNo) {this.empNo = empNo;}
	public void setEmpName(String empName) {this.empName = empName;}

	@Override
	public String toString() {StringBuilder builder = new StringBuilder();
		builder.append("FinalObjectDemo [empNo=");
		builder.append(empNo);
		builder.append(", empName=");
		builder.append(empName);
		builder.append("]");
		return builder.toString();	}


	public static void main(String[] args) {
		final FinalObjectDemo finalObjectDemo = new FinalObjectDemo(21786, "Abhijeet");
		FinalObjectDemo ObjectDemoAgain = new FinalObjectDemo(17996, "Abhijeet");
		
		finalObjectDemo.setEmpName("Banerjee");
		//ERROR: finalObjectDemo = ObjectDemoAgain;
		
		ObjectDemoAgain = finalObjectDemo;

	}

}
