package com.dao.daoImpl.qin;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.qin.Emp_relationshipDao;
import com.pojo.qin.Emp_relationship;
import com.utils.DB;

public class Emp_relationDaoImpl implements Emp_relationshipDao {
	DB db=new DB();

	public boolean add(Emp_relationship e) {
		boolean falg=false;
		String sql="insert into Emp_relationship(eno,r_company,r_job,r_name,r_phone,relation) values(?,?,?,?,?,?)";
		PreparedStatement ps=db.insertOrDelete(sql);
		try {
			ps.setString(1, e.getEno());
			ps.setString(2, e.getR_company());
			ps.setString(3, e.getR_job());
			ps.setString(4, e.getR_name());
			ps.setString(5, e.getR_phone());
			ps.setString(6, e.getRelation());
			db.commit();
			falg=true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return falg;
	}

	public boolean delete(Emp_relationship e) {
		boolean falg=false;
		String sql="delete Emp_relationship where eno=?";
		PreparedStatement ps=db.insertOrDelete(sql);
		try {
			ps.setString(1, e.getEno());
			ps.execute();
			db.commit();
			falg=true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return falg;
	}

	public boolean update(Emp_relationship e) {
		boolean falg=false;
		String sql="update Emp_relationship"; 
		return falg;
	}

}
