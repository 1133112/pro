package com.dao.qin;

import com.pojo.qin.Emp_job_info;

/**
 * 对员工职业生涯信息进行操作
 * @author Qin
 *
 */
public interface Emp_job_infoDao {
	
	/**
	 * 对员工职业生涯信息进行添加
	 * @param e 
	 * @return 
	 */
	public boolean add(Emp_job_info e);
	/**
	 * 对员工职业生涯信息进行删除操作
	 * @param e
	 * @return
	 */
	public boolean delete(Emp_job_info e);
	/**
	 * 对员工职业生涯信息进行修改操作
	 * @param e
	 * @return
	 */
	public boolean update(Emp_job_info e);
}
