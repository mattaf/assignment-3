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

    public void sortClient(ArrayList<Client> clientArrayList) {
        int i, j;
        for (i = 1; i < clientArrayList.size(); i++) {
            Client temp = clientArrayList.get(i);
            j = i;
            while ((j > 0) && (clientArrayList.get(j - 1).getClientID()) > temp.getClientID()) {
                clientArrayList.set(j, clientArrayList.get(j - 1));
                j--;
            }
            clientArrayList.set(j, temp);
        }
    }

    String helperClient(ArrayList<Client> clientArrayList){
        StringBuilder a = new StringBuilder();
        this.sortClient(clientArrayList);
        for (int i = 0; i < clientArrayList.size(); ++i){
            a.append(clientArrayList.get(i).getClientName()).append(" ").append(Integer.toString(clientArrayList.get(i).getClientID())).append(", ");
        }
        a = a.delete(a.length()-2, a.length());
        return a.toString();
    }

    String helperEmployee(ArrayList<Employee> employees){
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < employees.size(); ++i){
            b.append(employees.get(i).getEmployeeName()).append(" ").append(String.valueOf(employees.get(i).getSalesID())).append(", ");
        }
        b = b.delete(b.length()-2,b.length());
        return b.toString();
    }


  public String toString1(){
        return "SalesManager: " + this.getEmployeeName() + ". " + "Employees: " + this.helperEmployee(this.employees) + " " + "Clients: " + this.helperClient(this.getClientArrayList()) + ". " + "Bonus: " + String.valueOf(this.bonus());
    }
}
