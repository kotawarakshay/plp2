package com.cg.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.bean.PolicyBean;
import com.cg.bean.QuestionBean;


public interface IDaoInsurance {
	public  ArrayList<PolicyBean> createPolicy() throws ClassNotFoundException, IOException, SQLException;


	ArrayList<PolicyBean> PolicyQuestion(QuestionBean question);
	
}
