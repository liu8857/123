package org.lq.ZOO.communal;

public enum StaffProfessionType {
	
	/*
	 * STAFF_DOCTOR ҽ��
	 */
	STAFF_DOCTOR(1,"ҽ��"),
	/**
	 * STAFF_FEED ����Ա
	 */
	STAFF_FEED(2,"����Ա");
	
	private int id;
	private String staff;
	StaffProfessionType(int id,String staff) {
		this.id = id;
		this.staff = staff;
	}
	
	public int getId() {
		return id;
	}
	
	public String getStaff() {
		return staff;
	}
	
	@Override
	public String toString() {
		return staff;
	}
}
