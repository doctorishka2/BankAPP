public class Accountant extends Employee{


    public Accountant(String employeeName, int employeeId, String employeeDateOfBirth) {
        super(employeeName, employeeId, Consts.ACCOUNTANT_DEFAULT_SALARY, Consts.ACCOUNTANT_TYPE, employeeDateOfBirth);

    }

    public void createReport(String employeeName, String reportName){

       //System.out.println(String.format("The Accountant " + employeeName + " will prepare the report: " + reportName));
       System.out.println(String.format("The Accountant %s will prepare the report %s", employeeName, reportName));


    }

}
