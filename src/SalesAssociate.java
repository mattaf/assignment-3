import java.util.ArrayList;

public class SalesAssociate extends Employee{
    protected String employeeName;
    protected SalesManager manager;
    protected long salesID;
    private ArrayList<Client> clientArrayList = new ArrayList<Client>();

    protected SalesAssociate(SalesManager manager){
        super(clientArrayList, employeeName, salesID);
        this.manager = manager;
    }

    protected SalesManager getManager() {
        return manager;
    }

    protected void setManager(SalesManager manager) {
        this.manager = manager;
    }

    public String toString(){
    }

    double bonus(){
        return 1000*this.getClientArrayList().size();
    }
}
