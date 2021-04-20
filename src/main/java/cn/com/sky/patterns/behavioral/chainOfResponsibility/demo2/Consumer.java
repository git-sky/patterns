package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo2;

/**
 *
 */
public class Consumer {

    private String name;
    private Integer existsYears;
    private Integer star;
    private Integer combos;


    public Consumer(String name, Integer existsYears, Integer star, Integer combos) {
        this.name = name;
        this.existsYears = existsYears;
        this.star = star;
        this.combos = combos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExistsYears() {
        return existsYears;
    }

    public void setExistsYears(Integer existsYears) {
        this.existsYears = existsYears;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getCombos() {
        return combos;
    }

    public void setCombos(Integer combos) {
        this.combos = combos;
    }
}