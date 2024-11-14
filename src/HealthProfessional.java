/**
 * 医疗专业人员基类
 * ID 编号
 * name 名称
 * describe 简介
 */
public class HealthProfessional {

    private long ID;

    private String name;

    private String describe;
    //无参数构造方法
    public HealthProfessional() {

    }
    //全参数构造方法
    public HealthProfessional(long ID, String name, String describe) {
        this.ID = ID;
        this.name = name;
        this.describe = describe;
    }
    //打印医疗专业人员基类成员变量
    public void print(){
        System.out.println("health professional ID :"+this.ID +"     "+"name:"+this.name);
        System.out.println("health professional describe :"+this.describe);
    }


}
