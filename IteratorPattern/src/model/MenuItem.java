package model;

public class MenuItem {
    private String item;
    private Integer rate;

    public MenuItem(String item, Integer rate) {
        this.item = item;
        this.rate = rate;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}
