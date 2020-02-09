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
        int temp;
        this.sortClient(clientArrayList);
        for (int i = 0; i < clientArrayList.size(); ++i){
            a.append(clientArrayList.get(i).getClientName()).append(" ").append(Integer.toString(clientArrayList.get(i).getClientID())).append(", ");
        }
        a = a.delete(a.length()-2, a.length());
        return a.toString();
    }

    public String toString1(){
        return "Sales Associate: " + this.getEmployeeName() + ". " + "Sales Manager: " + this.getManager().getEmployeeName() + " " + this.getManager().getSalesID() + ". "  + "Clients: " + this.helperClient(this.getClientArrayList()) + ". "  + "Bonus: " + String.valueOf(this.bonus());
    }

    double bonus(){
        return 1000*this.getClientArrayList().size();
    }
}
