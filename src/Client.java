public class Client {
    private int clientID;
    private String clientName;
    private Client(int clientID, String clientName){
        this.clientID = clientID;
        this.clientName = clientName;
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

    public String toString(){
    }
}
