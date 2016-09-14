package com.dao.qin;

import com.pojo.qin.Emp_relationship;

/**
 * 对职员与家庭成员及社会关系信息表进行相关操作
 * @author Qin
 *
 */
public interface Emp_relationshipDao {
	/**
	 * 对职员与家庭成员及社会关系信息表进行添加
	 * @param e
	 * @return 
	 */
	public boolean add(Emp_relationship e);
	/**
	 * 对职员与家庭成员及社会关系信息表进行删除操作
	 * @param e
	 * @return
	 */
	public boolean delete(Emp_relationship e);
	/**
	 * 对职员与家庭成员及社会关系信息表进行修改操作
	 * @param e
	 * @return
	 */
	public boolean update(Emp_relationship e);
}
