package cn.com.sky.patterns.creational.builder.demo2;

/**
 * 
 * 我们关心的不仅仅是创建一个人物，还要关心其特征的创建
 * 
 */
public class RaceBuilder {

	private Race race;

	/**
	 * 创建一个种族
	 * 
	 * @return
	 */
	public RaceBuilder builder() {
		this.race = new Race();
		return this;
	}

	/**
	 * 取名字
	 * 
	 * @return
	 */
	public RaceBuilder setName(String name) {
		this.race.setName(name);
		return this;
	}

	/**
	 * 选择性别
	 * 
	 * @return
	 */
	public RaceBuilder setSex(String sex) {
		this.race.setSex(sex);
		return this;
	}

	/**
	 * 选择肤色
	 * 
	 * @return
	 */
	public RaceBuilder setSkinColor(String skinColor) {
		this.race.setSkinColor(skinColor);
		return this;
	}

	/**
	 * 
	 * 返回这个创建好的种族
	 * 
	 * @return
	 */
	public Race create() {
		return this.race;
	}
}