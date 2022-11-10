import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {

    Main() {

        setTitle("Table App");
        setSize(600, 400);
        setLocation(400, 400);

        Container con = getContentPane();
        FlowLayout lay = new FlowLayout();
        con.setLayout(lay);

        Vector titles = new Vector();
        titles.add("Course Number");
        titles.add("Course Name");
        titles.add("NO Credits");

        Vector data1 = new Vector();
        data1.add("IT2120");
        data1.add("Introduction to Programming");
        data1.add("30");

        Vector data2 = new Vector();
        data2.add("IT2122");
        data2.add("Software Engineering");
        data2.add("30");

        Vector row = new Vector<>();
        row.add(data1);
        row.add(data2);

        DefaultTableModel dataModel = new DefaultTableModel(row, titles);

        JTable tblCourse = new JTable();
        tblCourse.setModel(dataModel);

        JScrollPane jspTable = new JScrollPane();
        jspTable.setPreferredSize(new Dimension(550, 200));
        jspTable.setViewportView(tblCourse);

        con.add(jspTable);
    }

    public static void main(String[] args) {
        Main myUi = new Main();
        myUi.setDefaultCloseOperation(EXIT_ON_CLOSE);
        myUi.setVisible(true);
    }

}
