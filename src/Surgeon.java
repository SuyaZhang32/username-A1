

public class Surgeon extends HealthProfessional{

    //健康人员的类型
    private String type;

    public Surgeon() {
        super();
    }

    public Surgeon(long ID, String name, String describe,String type) {
        super(ID, name, describe);
        this.type = type;
    }


    //打印医疗专业人员成员变量
    @Override
    public void print(){
        super.print();
        System.out.println("type:'"+this.type+ '\'');
    }

}
