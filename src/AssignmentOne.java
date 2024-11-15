import java.util.ArrayList;

public class AssignmentOne {

    public static void main(String[] args) {
        long hpOneID = 62345l;
        String hpOneName = "voctoy";
        String hpOneDesc = "super healthProfessional";
        //用构造方法创建医疗专业人员实例
        HealthProfessional hpOne = new HealthProfessional(hpOneID,hpOneName,hpOneDesc);
        //调用实例的输出信息方法
        hpOne.print();
        System.out.println("");
        // Part 3 – Using classes and objects
        GeneralPractitioner  general1 = new GeneralPractitioner(12345l,"voctoy.smix","first generalProfessional","general");
        general1.print();
        System.out.println("");
        GeneralPractitioner  general2 = new GeneralPractitioner(12346l,"voctoy.aluph","18 age generalProfessional","general");
        general2.print();
        System.out.println("");
        GeneralPractitioner  general3 = new GeneralPractitioner(12349l,"voctoy.alix","new generalProfessional","general");
        general3.print();
        System.out.println("");
        Surgeon surgeon1 = new Surgeon(12352l,"voctoy.adom","super surgeon","surgeon");
        surgeon1.print();
        System.out.println("");
        Surgeon surgeon2 = new Surgeon(12354l,"voctoy.frened","old surgeon","surgeon");
        surgeon2.print();
        System.out.println("");
        System.out.println("------------------------------");


        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointmentList = new ArrayList<>();
        //预约全科医生1
        appointmentList = createAppointment(appointmentList,new Appointment("susan",19928831l,"8:00",general2));
        //预约全科医生2
        appointmentList = createAppointment(appointmentList,new Appointment("jduer",19954671l,"11:00",general3));
        //预约外科医生1
        appointmentList = createAppointment(appointmentList,new Appointment("jessic",199546731l,"12:00",surgeon1));
        //预约外科医生2
        appointmentList = createAppointment(appointmentList,new Appointment("galun",19976541l,"3:00",surgeon1));
        //打印预约列表
        printExistingAppointments(appointmentList);
        //取消预约外科医生1
        appointmentList = cancelBooking(appointmentList,new Appointment("susan",19928831l,"8:00",general2));
        //打印取消后的预约列表
        printExistingAppointments(appointmentList);

        System.out.println("------------------------------");
    }


    public static ArrayList<Appointment>  createAppointment(ArrayList<Appointment> appointmentList,Appointment appointment){
        if(appointmentList == null){
            System.out.println("exception appointmentList is null");
            return appointmentList;
        }
        if(appointment == null){
            System.out.println("exception appointment is null");
            return appointmentList;
        }
        //for循环预约信息，不重复则预约成功
        for (Appointment element:appointmentList) {
            if(element.equals(appointment)){
                System.out.println("exception appointment is repeat");
                return appointmentList;
            }
        }
        appointmentList.add(appointment);
        return appointmentList;
    }

    public static void  printExistingAppointments(ArrayList<Appointment> appointmentList){
        //for循环打印预约信息
        for (Appointment element : appointmentList) {
            element.print();
            System.out.println("");
        }
    }

    public static  ArrayList<Appointment>  cancelBooking(ArrayList<Appointment> appointmentList,Appointment appointment){

        if(appointmentList == null){
            System.out.println("exception appointmentList is null");
        }
        if(appointment == null){
            System.out.println("exception appointment is null");
        }
        if(appointmentList.size() == 0){
            System.out.println("error appointment info not found");
        }
        //for循环预约信息，如果预定信息对比成功，找出要删除的元素
        Appointment cancelElement = null;
        for (Appointment element:appointmentList) {
            if(element.equals(appointment)){
                cancelElement = element;
            }
        }
        //未找出将删除的元素，打印提示.否则取消成功
        if(cancelElement == null){
            System.out.println("error appointment info not found");
        }else{
            appointmentList.remove(cancelElement);
        }
        return appointmentList;

    }

}