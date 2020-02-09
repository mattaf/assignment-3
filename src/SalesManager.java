import java.util.ArrayList;

public class SalesManager extends Employee {
    protected String employeeName;
    protected ArrayList<Employee> employees;
    protected SalesManager manager;
    protected long salesID;
    private ArrayList<Client> clientArrayList = new ArrayList<Client>();

    protected SalesManager(String employeeName, ArrayList<Employee> employees, long salesID, ArrayList<Client> clientArrayList){
        super(clientArrayList, employeeName, salesID);
        this.employees = employees;

    }

    protected SalesManager(String employeeName, SalesManager salesManager1, long salesID, ArrayList<Client> clientArrayList){
        super(clientArrayList, employeeName, salesID);
        this.manager = salesManager1;
    }

    protected ArrayList<Employee> getEmployees() {
        return employees;
    }

    protected void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    protected SalesManager getManager() {
        return manager;
    }

    protected void setManager(SalesManager manager) {
        this.manager = manager;
    }

    double bonus(){
        return 5000*employees.size() + 2000*this.getClientArrayList().size();
    }

//    public String toString(){
//
//  }
}
