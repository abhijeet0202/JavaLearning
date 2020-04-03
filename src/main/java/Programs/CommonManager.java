/**
 * The employee hierachy at a Company is represented in the form of a tree.
 * 
 * The CEO of the company stands at the top of the hierachy.
 * Employees can have other employees reporting to them.
 * An employee with at least one reportee is called Manager.
 * All Employees eventually report to the CEO.
 * 
 *  Write an Algorithm to find the closet common manager for the two given employees.
 *  i.e the manager who is farthest from the CEO, but to whom both the employees report.
 *  One of the two given employees may be the closest common manager if one reports the the other
 *  
 *  Input:
 *  The input to the function/method consist of 3 arguments
 *  -ceo, employee1, employee2
 *  
 *  OutPut:
 *  Return the closest common manager of the 2 given employees
 */
package Programs;

import java.util.ArrayList;

/**
 * @author I17996
 *
 */
public class CommonManager {

	final private int id;
	final private String name;
	final private ArrayList<CommonManager> reports = new ArrayList<>();
	
	public CommonManager(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<CommonManager> myRepotee(){
		return reports;
	}
	
	public CommonManager closestCommonManager(CommonManager ceo, CommonManager employee1, CommonManager employee2){
		if (ceo == null){
			return null;
		}
		
		if ((employee1 == ceo) || (employee2 == ceo)){
			return ceo;
		}
		
		int count =0;
		CommonManager temp = null;
		
		for (CommonManager current : ceo.myRepotee()){
			CommonManager res = closestCommonManager(current, employee1, employee2);
			
			if (res != null){
				count++;
				temp = res;
			}
		}
		if (count == 2){
			return ceo;
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
