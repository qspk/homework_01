package com.pk.domain;

public class GirlFriend {
    private String name;
    private int age;
    private double height;
    private double weight;


    public GirlFriend() {
    }

    public GirlFriend(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    //做饭
    public void cook(){
        System.out.println(getName() + "给小张做饭");
    }

    //洗衣服
    public void wash() {
        System.out.println(getName() + "给小张洗衣服");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.println("小张的女朋友叫 " + name + ", " + age + "岁, 身高 " + height + "厘米, 体重 " + weight + "公斤");
    }
}
