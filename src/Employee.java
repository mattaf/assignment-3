import java.util.ArrayList;

public abstract class Employee {

    protected String employeeName;
    protected long salesID;
    private ArrayList<Client> clientArrayList;
    public Employee (ArrayList<Client> clientArrayList, String employeeName, long salesID){
        this.clientArrayList = clientArrayList;
        this.employeeName = employeeName;
        this.salesID = salesID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getSalesID() {
        return salesID;
    }

    public void setSalesID(long salesID) {
        this.salesID = salesID;
    }

    public ArrayList<Client> getClientArrayList() {
        return clientArrayList;
    }

    public void setClientArrayList(ArrayList<Client> clientArrayList) {
        this.clientArrayList = clientArrayList;
    }

    public boolean getClient(Client client){
        return this.clientArrayList.contains(client);
    }

    public ArrayList<Client> addClient(Client client){
        this.clientArrayList.add(client);
        return this.clientArrayList;
    }
}


