package com.dao.qin;

import com.pojo.qin.Emp_fore;

/**
 * ��Ա��������������Ϣ����в���
 * @author Qin
 *
 */
public interface Emp_foreDao {

	/**
	 * ���Ա������������Ϣ
	 * @param e
	 * @return 
	 */
	public boolean add(Emp_fore e);
	/**
	 * ��Ա������������Ϣ����ɾ������
	 * @param e
	 * @return
	 */
	public boolean delete(Emp_fore e);
	/**
	 * ��Ա������������Ϣ�����޸Ĳ���
	 * @param e
	 * @return
	 */
	public boolean update(Emp_fore e);
}
