package com.dao.qin;

import com.pojo.qin.Emp_job_info;

/**
 * ��Ա��ְҵ������Ϣ���в���
 * @author Qin
 *
 */
public interface Emp_job_infoDao {
	
	/**
	 * ��Ա��ְҵ������Ϣ�������
	 * @param e 
	 * @return 
	 */
	public boolean add(Emp_job_info e);
	/**
	 * ��Ա��ְҵ������Ϣ����ɾ������
	 * @param e
	 * @return
	 */
	public boolean delete(Emp_job_info e);
	/**
	 * ��Ա��ְҵ������Ϣ�����޸Ĳ���
	 * @param e
	 * @return
	 */
	public boolean update(Emp_job_info e);
}
