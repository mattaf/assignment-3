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

    public ArrayList<Employee> addEmployee(Employee employee){
        this.employees.add(employee);
        return this.employees;
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

    String helperClient(ArrayList<Client> clientArrayList){
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < clientArrayList.size(); ++i){
            a.append(clientArrayList.get(i).getClientName()).append(" ").append(Integer.toString(clientArrayList.get(i).getClientID())).append(" ");
        }
        return a.toString();
    }

    String helperEmployee(ArrayList<Employee> employees){
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < employees.size(); ++i){
            b.append(employees.get(i).employeeName).append(" ").append(String.valueOf(employees.get(i).getSalesID()));
        }
        return b.toString();
    }


  public String toString1(){
        return "SalesManager: " + this.getEmployeeName() + ". " + "Employees: " + this.helperEmployee(this.employees) + " " + "Clients: " + this.helperClient(this.getClientArrayList()) + ". " + "Bonus: " + String.valueOf(this.bonus());
    }
}
