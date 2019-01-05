package com.cg.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.bean.InsuranceBean;
import com.cg.bean.PolicyBean;
import com.cg.bean.QuestionBean;
import com.cg.service.InsuranceService;
import com.cg.service.underWriter;

public class InsuranceMain {

	 static Scanner scanner=new Scanner(System.in);
	static underWriter under=new underWriter();
	static PolicyBean policyBean = new PolicyBean();
	static QuestionBean questionBean = new QuestionBean();
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		
		System.out.println("Enter username");
		String username=scanner.next();
		System.out.println("Enter Password");
		String password=scanner.next();
		
		InsuranceBean bean=new InsuranceBean();
		bean.setUserName(username);
		bean.setPassword(password);
		
		
		InsuranceService service=new InsuranceService();
		String roll=service.validateUser(bean);
		roll="Admin";
		if(roll.equals("Insured"))
		{
			System.out.println("Insured logged in");
			System.out.println("1.Account creation");
			System.out.println("2.View Policy");
			System.out.println("Enter Your Choice");
			int opt=scanner.nextInt();
			switch(opt)
			{
			case 1:
			System.out.println("Enter Details");
			break;
			case 2:
				System.out.println("View Policy");
				break;
				default:
					System.out.println("Enter Correct Option");
				
			  }
			}
			else if(roll.equals("Agent"))
			{
				System.out.println("Agent logged in");
				System.out.println("1.Account creation");
				System.out.println("2.Policy creation");
				System.out.println("3.View Policy");
				System.out.println("Enter Your Choice");
				int opt1=scanner.nextInt();
				
				switch(opt1)
				{
				case 1:
					System.out.println("Enter Details for Account creation");
					break;
				case 2:
					System.out.println("Enter Details for Policy Creation");
					break;
				case 3:
					System.out.println("Policies are:");
					break;
		        }
			}
				
			else
			{
				System.out.println("UnderWriter logged in");
				System.out.println("1.New Profile Creation");
				System.out.println("2.Account Creation");
				System.out.println("3.Policy Creation");
				System.out.println("4.view policy");
				System.out.println("5.Report Generation");
				System.out.println("Enter your choice");
				int opt2=scanner.nextInt();
				switch(opt2)
				{
				case 1:
					System.out.println("Enter Details for Creating profile");
					break;
				case 2:
					System.out.println("Enter Details for Account Creation");
					break;
				case 3:
					System.out.println("Enter Details for Policy creation");
					
					System.out.println("1.Business Auto");
					System.out.println("2.Restaurant");
					System.out.println("3.Apartment");
					System.out.println("4.General Merchant");
					 int option1 = scanner.nextInt();
					
					ArrayList<PolicyBean> al = new ArrayList<>();
					
					al = under.createPolicy();
					
					for(PolicyBean pBean:al) {
						System.out.println(pBean.getQuestion());
						System.out.println("1."+pBean.getAnswer1()+"\t"+"2."+pBean.getAnswer2()+"\t"+"3."+pBean.getAnswer3());
						System.out.println("enter the option");
						int option=scanner.nextInt();
						switch(option) {
						case 1:
							questionBean.setAnswer(pBean.getAnswer1());
							questionBean.setWeightage(pBean.getWeightage1());
							//set ANSWER 1 WEIGHTAGE
							
							break;
						case 2:
							questionBean.setAnswer(pBean.getAnswer2());
							questionBean.setWeightage(pBean.getWeightage2());
							//set ANSWER 2 WEIGHTAGE
							break;
						case 3:
							questionBean.setAnswer(pBean.getAnswer3());
							questionBean.setWeightage(pBean.getWeightage3());
							
							//set ANSWER 3 WEIGHTAGE
							
							
							
						}
						questionBean.setQuestion(pBean.getQuestion());
						questionBean.setBusinessSegment(pBean.getBusinessSegment());
						 under.PolicyQuestion(questionBean);
						//in that method write query to insert  the details into the table 
						//and the method should return policy number and premium value too which is unique and primary key
						}
					
				
					break;
				case 4:
					System.out.println("In view Policy");
					break;
				case 5:
					System.out.println("Report Generation");
					break;
					default:
						System.out.println("Enter correct number");
					
				
				
			}
			
		}
		
	}
}
