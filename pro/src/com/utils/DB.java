package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private Connection con;
	private Statement stm;
	private ResultSet rs;
	PreparedStatement ps;
	private String classname="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:pro";
	private String user="pro";
	private String password="project";
	/**
	 * ������
	 */
	public DB(){
		try {
			Class.forName(classname);//������������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ��ȡ����
	 * @return Connection
	 */
	public Connection getCon(){
		try {
			con=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			con=null;
		}
		return con;
	}
	/**
	 * �ر�����
	 */
	public void closeCon(){
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * ��ȡStatement
	 * @return Statement
	 */
	public Statement getStm(){
		try {
			con=getCon();
			stm=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		}
		return stm;
	}
	/**
	 * ��ȡ���ƶ���Statement
	 * @return Statement
	 */
	public Statement getStmed(){
		try {
			con=getCon();
			stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		}
		return stm;
	}
	
	
	/**
	 * ���ݿ��ѯ����
	 * @param sql
	 * @return ResultSet
	 */
	public ResultSet getRs(String sql){
		try {
			stm=getStmed();
			rs=stm.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	/**
	 * ���ݿⰴ������ѯ����
	 * @param subsql
	 * @param subsqlvalue
	 * @return ResultSet
	 */
	public ResultSet getPartRs(String subsql,String subsqlvalue){
		if(subsql==null) subsql="";
		if(subsqlvalue==null) subsqlvalue="";
		String sql="select * from emp where "+subsql+"='"+subsqlvalue+"'";
		try {
			stm=getStmed();
			rs=stm.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	/**
	 * ���ݿ�����ɾ������
	 * @param sql
	 * @return PreparedStatement
	 */
	public PreparedStatement insertOrDelete(String sql){
		con=getCon();
		try {
			ps=con.prepareStatement(sql);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return ps;
	}
	
	public void commit(){
		try {
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
