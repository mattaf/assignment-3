import sun.management.snmp.jvminstr.JvmRTBootClassPathEntryImpl;
import sun.misc.Cleaner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        SalesManager sManage1 = new SalesManager("Tom", new ArrayList<Employee>(), 1, new ArrayList<Client>());
        SalesManager sManage2 = new SalesManager("Jane", new ArrayList<Employee>(), 2, new ArrayList<Client>());
        SalesAssociate salesAssociate1 = new SalesAssociate("Harry", sManage2, 28, new ArrayList<Client>());
        SalesAssociate salesAssociate2 = new SalesAssociate("Nancy", sManage1, 15, new ArrayList<Client>());
        Client cl1 = new Client(51,"Ann", salesAssociate1);
        Client cl2 = new Client(7344, "John", sManage2);
        Client cl3 = new Client(515,"Susan", salesAssociate2);
        Client cl4 = new Client(921, "David", sManage1);
        Client cl5 = new Client(478,"Sarah", sManage2);
        Client cl6 = new Client(269, "Daniel", salesAssociate2);

        sManage2.addClient(cl2);
        sManage2.addClient(cl5);
        sManage1.addClient(cl4);
        sManage1.addEmployee(salesAssociate2);
        sManage2.addEmployee(salesAssociate1);


        salesAssociate1.addClient(cl1);
        salesAssociate2.addClient(cl3);
        salesAssociate2.addClient(cl6);

        System.out.println(sManage1.toString1());
        System.out.println(sManage2.toString1());
        System.out.println(salesAssociate1.toString1());
        System.out.println(salesAssociate2.toString1());
        System.out.println(cl1.toString());
        System.out.println(cl2.toString());
        System.out.println(cl3.toString());
        System.out.println(cl4.toString());
        System.out.println(cl5.toString());
        System.out.println(cl6.toString());

    }
}
