package com.dao.qin;

import com.pojo.qin.Emp_fore;

/**
 * 对员工的外语能力信息表进行操作
 * @author Qin
 *
 */
public interface Emp_foreDao {

	/**
	 * 添加员工外语能力信息
	 * @param e
	 * @return 
	 */
	public boolean add(Emp_fore e);
	/**
	 * 对员工外语能力信息进行删除操作
	 * @param e
	 * @return
	 */
	public boolean delete(Emp_fore e);
	/**
	 * 对员工外语能力信息进行修改操作
	 * @param e
	 * @return
	 */
	public boolean update(Emp_fore e);
}
