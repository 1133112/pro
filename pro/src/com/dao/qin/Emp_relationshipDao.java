package com.dao.qin;

import com.pojo.qin.Emp_relationship;

/**
 * ��ְԱ���ͥ��Ա������ϵ��Ϣ�������ز���
 * @author Qin
 *
 */
public interface Emp_relationshipDao {
	/**
	 * ��ְԱ���ͥ��Ա������ϵ��Ϣ��������
	 * @param e
	 * @return 
	 */
	public boolean add(Emp_relationship e);
	/**
	 * ��ְԱ���ͥ��Ա������ϵ��Ϣ�����ɾ������
	 * @param e
	 * @return
	 */
	public boolean delete(Emp_relationship e);
	/**
	 * ��ְԱ���ͥ��Ա������ϵ��Ϣ������޸Ĳ���
	 * @param e
	 * @return
	 */
	public boolean update(Emp_relationship e);
}
