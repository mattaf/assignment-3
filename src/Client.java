import java.util.ArrayList;

public class Client {

    private int clientID;
    private String clientName;
    private Employee employee;

    public Client(int clientID, String clientName, Employee employee) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.employee = employee;
    }

    protected int getClientID() {
        return clientID;
    }

    protected void setClientID(int clientID) {
        this.clientID = clientID;
    }

    protected String getClientName() {
        return clientName;
    }

    protected void setClientName(String clientName) {
        this.clientName = clientName;
    }

    protected Employee getEmployee() {
        return employee;
    }

    protected void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double totalSales() {
        return 0.0;
    }

    public String toString() {
        return "Client: " + this.clientName + ". " + "SalesEmployee: " + this.employee.getEmployeeName() + " " + this.employee.getSalesID();
    }
}
