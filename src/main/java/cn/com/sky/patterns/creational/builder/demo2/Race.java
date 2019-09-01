package cn.com.sky.patterns.creational.builder.demo2;

/**
 * 产品：种族角色
 */
public class Race {

    private String name;

    private String skinColor;

    private String sex;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkinColor() {
        return this.skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Race [name=" + name + ", skinColor=" + skinColor + ", sex=" + sex + "]";
    }

}