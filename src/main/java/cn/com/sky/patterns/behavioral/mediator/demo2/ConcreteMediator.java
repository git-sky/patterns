package cn.com.sky.patterns.behavioral.mediator.demo2;

public class ConcreteMediator extends Mediator {

	// 首先中介结构必须知道所有房主和租房者的信息
	private HouseOwner houseOwner;
	private Tenant tenant;

	public HouseOwner getHouseOwner() {
		return houseOwner;
	}

	public void setHouseOwner(HouseOwner houseOwner) {
		this.houseOwner = houseOwner;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	public void contact(String message, Person person) {
		if (person == houseOwner) { // 如果是房主，则租房者获得信息
			tenant.getMessage(message);
		} else { // 房主获得信息
			houseOwner.getMessage(message);
		}
	}
}