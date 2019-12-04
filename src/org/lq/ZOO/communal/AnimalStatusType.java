package org.lq.ZOO.communal;

public enum AnimalStatusType {
	//����״̬ ����
	ANIMAIL_EXIST(1,"����"),
	ANIMAL_DIE(2,"����");
	private int id;
	private String status;
	AnimalStatusType(int id,String status) {
		this.id = id;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return status;
	}
}
