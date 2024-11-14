
public class AssignmentOne {

    public static void main(String[] args) {


        long hpOneID = 62345l;
        String hpOneName = "voctoy";
        String hpOneDesc = "super healthProfessional";
        //用构造方法创建医疗专业人员实例
        HealthProfessional hpOne = new HealthProfessional(hpOneID,hpOneName,hpOneDesc);
        //调用实例的输出信息方法
        hpOne.print();
    }
}