package com.pojo.qin;
/**
 * 职员与家庭成员及社会关系信息表模型
 * @author QinGuangrui
 *
 */
public class Emp_relationship {
	private String eno;		//员工编号
	private String relation;			//与本人关系
	private String r_name;				//姓名
	private String r_company;			//所在单位
	private String r_job;				//职位
	private String r_phone;				//联系电话
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) { 
		this.eno = eno;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_company() {
		return r_company;
	}
	public void setR_company(String r_company) {
		this.r_company = r_company;
	}
	public String getR_job() {
		return r_job;
	}
	public void setR_job(String r_job) {
		this.r_job = r_job;
	}
	public String getR_phone() {
		return r_phone;
	}
	public void setR_phone(String r_phone) {
		this.r_phone = r_phone;
	}
}
