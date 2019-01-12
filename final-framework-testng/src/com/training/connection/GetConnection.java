package com.training.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.bean.DBBean;
import com.training.bean.RealestateBean;

public class GetConnection {
	static Connection connection; 
	public PreparedStatement ps1, ps2; 
	public ResultSet rs1, rs2; 
	
	public static Connection getMSAccess(RealestateBean realestateBean) {
		
		try {
			Class.forName(realestateBean.getDriver());
			connection = DriverManager.getConnection( realestateBean.getUrl());
			
			return connection; 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}	
	
public static Connection getOracleConnection(RealestateBean realestateBean) {
		return null;
	}
}
