import sun.management.snmp.jvminstr.JvmRTBootClassPathEntryImpl;
import sun.misc.Cleaner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        SalesManager sManage1 = new SalesManager("Tom", new ArrayList<Employee>(), 1);
        SalesManager sManage2 = new SalesManager("Jane", new ArrayList<Employee>(), 2);
        SalesAssociate salesAssociate1 = new SalesAssociate("Harry", sManage2, 28);
        SalesAssociate salesAssociate2 = new SalesAssociate("Nancy", sManage1, 15);
        Client cl1 = new Client(51,"Ann");
        Client cl2 = new Client(7344, "John");
        Client cl3 = new Client(515,"Susan");
        Client cl4 = new Client(921, "David");
        Client cl5 = new Client(478,"Sarah");
        Client cl6 = new Client(269, "Daniel");

        cl1.


        sManage2.addClient(cl2);
        sManage2.addClient(cl5);
        sManage1.addClient(cl4);
        salesAssociate1.addClient(cl1);
        salesAssociate2.addClient(cl3);
        salesAssociate2.addClient(cl6);


    }
}
