import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.insurance.bean.PolicyBean;

public class underWriter
{
	IDao iDao = null;
	public ArrayList<PolicyBean> createPolicy(){
		iDao = new DaoImpl();
		ArrayList<PolicyBean> al = new ArrayList<>();
		al = iDao.createPolicy();
		return al;
	}
}


public ArrayList<PolicyBean> createPolicy(){
	Connection con = DBConnection.getConnection();
	preparedStatemenet=  
	ResultSet rs= null;
	try {
		preparedStatement = con.prepareStatement("selectb * from table");
		rs = preparedStatemenet.executeQuery();
		ArrayList<PolicyBean> al = new ArrayList<>();
		while(rs.hasNext()) {
			BusinessSegement bs = new BusinessSegement();
			bs.setname(rs.getString(1));
			bs.setId(rs.getString(2));
			al.add(bs);
		}
		return al;
	}
	catch(Exception e) {
		
	}
}