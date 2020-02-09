import java.util.ArrayList;

public class SalesAssociate extends Employee {
    protected String employeeName;
    protected SalesManager manager;
    protected long salesID;
    private ArrayList<Client> clientArrayList = new ArrayList<Client>();

    protected SalesAssociate(String employeeName, SalesManager manager, long salesID, ArrayList<Client> clientArrayList){
        super(clientArrayList, employeeName, salesID);
        this.manager = manager;
    }

    protected SalesManager getManager() {
        return manager;
    }

    protected void setManager(SalesManager manager) {
        this.manager = manager;
    }

    String helperClient(ArrayList<Client> clientArrayList){
        String a= new String();
        for (int i = 0; i < clientArrayList.size(); ++i){
            a = clientArrayList.get(i).getClientName() + Integer.toString(clientArrayList.get(i).getClientID());
        }
        return a;
    }


    public String toString(){
        return "SalesManager: " + this.getEmployeeName() + "." + "Sales Manager: " + this.getManager() + "Clients: " + this.helperClient(this.clientArrayList) + String.valueOf(this.bonus());
    }

    double bonus(){
        return 1000*this.getClientArrayList().size();
    }
}
