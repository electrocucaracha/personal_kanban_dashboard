package mx.edu.umg.personalkaban;

import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;

import mx.edu.umg.personalkaban.model.DashboardList;
import mx.edu.umg.personalkaban.model.IDashboard;

public class Program {

	public static IDashboard dashboard = new DashboardList();

	public static void main(String[] args) throws Exception {
		
        Kamba f=new Kamba();
        //f.setBounds(10,10,300,200);
        f.setVisible(true);

}
}