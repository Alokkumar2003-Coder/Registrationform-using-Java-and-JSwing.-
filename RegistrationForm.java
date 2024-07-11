import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener
{
    Container c ;
    JLabel lab1,lab2,lab3,lab4,lab5,msg;
    JTextField t1,t2;
    JRadioButton male ,female;
    JComboBox<String> day , month ,year;
    JTextArea ta1,screen;
    JCheckBox terms;
    JButton submit;
    


    Myframe()
    {
        setTitle("Registration Form");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        lab1 = new JLabel("Name :");
        lab1.setBounds(20,50,100,20);
        c.add(lab1);

        t1 = new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);

        lab2 = new JLabel("Mobile No :");
        lab2.setBounds(20,100,100,20);
        c.add(lab2);

        t2 = new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);

        lab3 = new JLabel("Gender");
        lab3.setBounds(20,150,100,20);
        c.add(lab3);

        male = new JRadioButton("Male");
        male.setBounds(130,150,80,20);
        female = new JRadioButton("Female");
        male.setBounds(130,150,80,20);
        female.setBounds(220,150,80,20);


        c.add(male);
        c.add(female);
        male.setSelected(true);

        

        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        lab4 = new JLabel("DOB");
        lab4.setBounds(20,200,100,20);
        c.add(lab4);

        String Days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

        String Months[] = {"Jan","feb","Apr","May","Jun","JUly","Aug","Sep","Oct","Nov","Dec"};

        String Years[] = {"2024","2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000"};

        day = new JComboBox<>(Days);
        month = new JComboBox<>(Months);
        year = new JComboBox<>(Years);

        day.setBounds(130,200,50,20);
        month.setBounds(190,200,50,20);
        year.setBounds(250,200,60,20);

        c.add(day);
        c.add(month);
        c.add(year);

        lab5 = new JLabel("Address : ");
        lab5.setBounds(20,250,100,20);
        c.add(lab5);

        ta1 = new JTextArea();
        ta1.setBounds(130,240,200,50);
        c.add(ta1);
        ta1.setLineWrap(true);


        terms = new JCheckBox("Plz accept Terms and condition");
        terms.setBounds(50,300,250,20);
        c.add(terms);

        submit = new JButton("Submit");
        submit.setBounds(150,350,80,20);
        c.add(submit);
        submit.addActionListener(this);

        screen = new JTextArea();
        screen.setBounds(350,50,300,300);
        c.add(screen);


        msg = new JLabel("");
        msg.setBounds(20,400,250,20);
        c.add(msg);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(terms.isSelected())
        {
            msg.setText("Registration Successfull...!");

            String name = t1.getText();
            String mobile  = t2.getText();
            String gender = "Male";
            if(female.isSelected())
            {
                gender = "Female";
            }
            String dob = day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
            String address = ta1.getText();
            
            screen.setText("Name : " + name+"\n" + "MObile : " + mobile + "\n" + "Gender : " + gender + "\n" + "DOB : " + dob + "\n" + "Address : " + address);

        }

        else 
        {
            msg.setText("Accept terms and condition to Submit.");
            screen.setText("");

        }
    }
}
public class RegistrationForm
{
    public static void main(String[] args)  
    {
        Myframe f = new Myframe();

    }
    
}
