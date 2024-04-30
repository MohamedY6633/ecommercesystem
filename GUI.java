package ecommercesystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;

public class GUI extends JFrame implements ActionListener {
    private final JButton buttonsp;
    private final JButton buttonts;
    private final JButton buttonop;
    private final JButton buttonrs;
    private final JButton submit;
    private final JTextField name;
    private final JTextField id;
    private final JTextField address;
    private final JTextField nproducts;
    private JLabel welcomeLabel;
    private JLabel label1;
    private JLabel failureLabel;
    private JLabel Lname ;
    private JLabel Lid ;
    private JLabel Ladress ;
    private JLabel Lnproducts ;
    private JLabel items ;
    private final JFrame frame;
    private final cart c = new cart();
    private final Customer cu = new Customer();
    private final order o = new order();
    public GUI() {
        frame = new JFrame();
        frame.setSize(600, 500);
        frame.setTitle("E-commerce System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        welcomeLabel = new JLabel("Welcome to E-commerce System");
        welcomeLabel.setBounds(180, -10, 700, 50);
        welcomeLabel.setFont(new Font("Platypi", Font.BOLD, 18));
        frame.add(welcomeLabel);

        Lname = new JLabel("Enter Your Name :");
        Lname.setHorizontalAlignment(JLabel.CENTER);
        Lname.setVerticalAlignment(JLabel.BOTTOM);
        Lname.setFont(new Font("Platypi", Font.PLAIN, 14));
        Lname.setBounds(-65, -15, 290, 50);
        frame.add(Lname);

        name = new JTextField();
        name.setBounds(22, 35, 220, 35);
        name.setText("");
        frame.add(name);

        Lid = new JLabel("Enter Your ID :");
        Lid.setHorizontalAlignment(JLabel.CENTER);
        Lid.setVerticalAlignment(JLabel.BOTTOM);
        Lid.setFont(new Font("Platypi", Font.PLAIN, 14));
        Lid.setBounds(-75, 40, 290, 50);
        frame.add(Lid);

        id = new JTextField();
        id.setBounds(22, 95, 220, 35);
        id.setText("");
        frame.add(id);

        Ladress = new JLabel("Enter Your address :");
        Ladress.setHorizontalAlignment(JLabel.CENTER);
        Ladress.setVerticalAlignment(JLabel.BOTTOM);
        Ladress.setFont(new Font("Platypi", Font.PLAIN, 14));
        Ladress.setBounds(-55, 100, 290, 50);
        frame.add(Ladress);

        address = new JTextField();
        address.setBounds(22, 154, 220, 35);
        address.setText("");
        frame.add(address);

        Lnproducts = new JLabel("Enter NO.Products : ");
        Lnproducts.setHorizontalAlignment(JLabel.CENTER);
        Lnproducts.setVerticalAlignment(JLabel.BOTTOM);
        Lnproducts.setFont(new Font("Platypi", Font.PLAIN, 14));
        Lnproducts.setBounds(-55, 160, 290, 50);
        frame.add(Lnproducts);

        items = new JLabel("Enter Your Name :");
        items.setHorizontalAlignment(JLabel.CENTER);
        items.setVerticalAlignment(JLabel.BOTTOM);
        items.setFont(new Font("Platypi", Font.PLAIN, 14));
        items.setBounds(-65, -15, 290, 50);
        frame.add(items);

        nproducts = new JTextField();
        nproducts.setBounds(22, 214, 220, 35);
        nproducts.setText("");
        frame.add(nproducts);

        submit = new JButton();
        submit.setBounds(250, 35, 80, 35);
        submit.setText("Submit");
        submit.addActionListener(this);
        frame.add(submit);

        buttonsp = new JButton();
        buttonsp.setBounds(22, 260, 540, 50);
        buttonsp.setText("Click to add SmartPhone to cart");
        buttonsp.addActionListener(this);
        frame.add(buttonsp);

        buttonts = new JButton();
        buttonts.setBounds(22, 320, 540, 50);
        buttonts.setText("Click to add T-Shirt to cart");
        buttonts.addActionListener(this);
        frame.add(buttonts);

        buttonop = new JButton();
        buttonop.setBounds(22, 380, 540, 50);
        buttonop.setText("Click to add OOP to cart");
        buttonop.addActionListener(this);
        frame.add(buttonop);
        frame.setLayout(null);
        frame.setVisible(true);
        
        buttonrs = new JButton();
        buttonrs.setBounds(335, 30, 230, 50);
        buttonrs.setText("Recipt Button");
        buttonrs.addActionListener(this);
        frame.add(buttonrs);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        electronicproduct ep1 = new electronicproduct("Samsung", 1, 1, "smartphone", 599.9);
        clothingproduct cp1 = new clothingproduct(2, "T-shirt", "Meduim", "cotton", 19.99);
        bookproduct bp1 = new bookproduct("OReilly", "X Publications", 3, "OOP", 39.99);

        if (e.getSource() == buttonsp) {
            boolean added = c.addproduct(ep1);
            if (added) {
                label1 = new JLabel();
                label1.setText("Smart Phone Added Successfully");
                label1.setForeground(Color.GREEN);
                label1.setHorizontalAlignment(JLabel.CENTER);
                label1.setVerticalAlignment(JLabel.BOTTOM);
                label1.setFont(new Font("Platypi", Font.PLAIN, 18));
                label1.setBounds(230, 194, 290, 50);
                frame.add(label1);
                frame.revalidate();
                frame.repaint();

                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        frame.remove(label1);
                        frame.revalidate();
                        frame.repaint();
                    }
                });
                timer.setRepeats(false);
                timer.start();
            } else {

                failureLabel = new JLabel();
                failureLabel.setText("Failed: Cart is full");
                failureLabel.setForeground(Color.RED);
                failureLabel.setHorizontalAlignment(JLabel.CENTER);
                failureLabel.setVerticalAlignment(JLabel.BOTTOM);
                failureLabel.setFont(new Font("Platypi", Font.PLAIN, 18));
                failureLabel.setBounds(230, 194, 290, 50);
                frame.add(failureLabel);
                frame.revalidate();
                frame.repaint();

                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        frame.remove(failureLabel);
                        frame.revalidate();
                        frame.repaint();
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
            } else if (e.getSource() == submit) {
                int idd = Integer.parseInt(id.getText());
                cu.setCustomerid(idd);
                cu.setName(name.getText());
                cu.setAddress(address.getText());
                int np = Integer.parseInt(nproducts.getText());
                c.setnProducts(np);
            }
            else if(e.getSource()==buttonts){
                boolean added = c.addproduct(cp1);
                            if (added) {
                label1 = new JLabel();
                label1.setText("T - Shirt Added Successfully");
                label1.setForeground(Color.GREEN);
                label1.setHorizontalAlignment(JLabel.CENTER);
                label1.setVerticalAlignment(JLabel.BOTTOM);
                label1.setFont(new Font("Platypi", Font.PLAIN, 18));
                label1.setBounds(230, 194, 290, 50);
                frame.add(label1);
                frame.revalidate();
                frame.repaint();

                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        frame.remove(label1);
                        frame.revalidate();
                        frame.repaint();
                    }
                });
                timer.setRepeats(false);
                timer.start();
            } else {

                failureLabel = new JLabel();
                failureLabel.setText("Failed: Cart is full");
                failureLabel.setForeground(Color.RED);
                failureLabel.setHorizontalAlignment(JLabel.CENTER);
                failureLabel.setVerticalAlignment(JLabel.BOTTOM);
                failureLabel.setFont(new Font("Platypi", Font.PLAIN, 18));
                failureLabel.setBounds(230, 194, 290, 50);
                frame.add(failureLabel);
                frame.revalidate();
                frame.repaint();

                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        frame.remove(failureLabel);
                        frame.revalidate();
                        frame.repaint();
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
            }   
            else if(e.getSource()==buttonop){
                boolean added = c.addproduct(bp1);
                            if (added) {
                label1 = new JLabel();
                label1.setText("OOP Added Successfully");
                label1.setForeground(Color.GREEN);
                label1.setHorizontalAlignment(JLabel.CENTER);
                label1.setVerticalAlignment(JLabel.BOTTOM);
                label1.setFont(new Font("Platypi", Font.PLAIN, 18));
                label1.setBounds(230, 194, 290, 50);
                frame.add(label1);
                frame.revalidate();
                frame.repaint();

                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        frame.remove(label1);
                        frame.revalidate();
                        frame.repaint();
                    }
                });
                timer.setRepeats(false);
                timer.start();
            } else {

                failureLabel = new JLabel();
                failureLabel.setText("Failed: Cart is full");
                failureLabel.setForeground(Color.RED);
                failureLabel.setHorizontalAlignment(JLabel.CENTER);
                failureLabel.setVerticalAlignment(JLabel.BOTTOM);
                failureLabel.setFont(new Font("Platypi", Font.PLAIN, 18));
                failureLabel.setBounds(230, 194, 290, 50);
                frame.add(failureLabel);
                frame.revalidate();
                frame.repaint();

                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        frame.remove(failureLabel);
                        frame.revalidate();
                        frame.repaint();
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
                }

                if (e.getSource() == submit) {
                    try {
                        int idd = Integer.parseInt(id.getText());
                        cu.setCustomerid(idd);
                        cu.setName(name.getText());
                        cu.setAddress(address.getText());
                        int np = Integer.parseInt(nproducts.getText());
                        c.setnProducts(np);
                        JLabel label1 = new JLabel("Your Data Added Successfully");
                        label1.setForeground(Color.GREEN);
                        label1.setHorizontalAlignment(JLabel.CENTER);
                        label1.setVerticalAlignment(JLabel.BOTTOM);
                        label1.setFont(new Font("Platypi", Font.PLAIN, 18));
                        label1.setBounds(230, 194, 290, 50);
                        frame.add(label1);
                        frame.revalidate();
                        frame.repaint();
                        Timer timer = new Timer(500, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent evt) {
                                frame.remove(label1); 
                                frame.revalidate();
                                frame.repaint();
                            }
                        });
                        timer.setRepeats(false);
                        timer.start();
                    } catch (NumberFormatException ex) {
                        System.out.println("Please enter valid ID and number of products");
                    }
                }
                if (e.getSource() == buttonrs) {
                    int idd = Integer.parseInt(id.getText());
                    String ss = o.printOrderInfoGUI(c.calculatePrice() , c.product_arr ,c.nproducts , idd );
                    String pp = o.placeorderGUI(c.calculatePrice());
                    String op = o.byeGUI();
                    int flag = JOptionPane.showConfirmDialog(null,pp,"Confirmation of Place order ",JOptionPane.YES_NO_OPTION);
                    if (flag == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null,ss,"Cart Details",JOptionPane.PLAIN_MESSAGE);}
                    else{JOptionPane.showMessageDialog(null,op,"Thank You",JOptionPane.PLAIN_MESSAGE);}
                }
                           
    }
    
}