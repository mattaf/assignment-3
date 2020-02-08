import java.util.ArrayList;

public class SalesManager extends Employee {
    protected String employeeName;
    protected ArrayList<Employee> employees;
    protected SalesManager manager;
    protected long salesID;

    protected SalesManager(String employeeName, ArrayList<Employee> employees, SalesManager manager, long salesID){
        this.employeeName = employeeName;
        this.employees = employees;
        this.manager = manager;
        this.salesID = salesID;
    }

    protected String getEmployeeName() {
        return employeeName;
    }

    protected void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    protected long getSalesID() {
        return salesID;
    }

    protected void setSalesID(long salesID) {
        this.salesID = salesID;
    }

    double bonus(){
        5000*this.
    }

    public String toString(){

    }
}
