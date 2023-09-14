package rentalMgtSys;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame {
	
    private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox ap_type;
	private JList amenities;
	private JComboBox furnishings;
	private JComboBox rentaltype;
	private JTextField maxprice;
	private JTextField minprice;
	private JTable table;
	String filtervalues[][];
	propertydata pdata;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		pdata=new propertydata();
		JPanel panel = new JPanel();
		panel.setBounds(428, 60, 550, 400);
		contentPane.add(panel);
		
		filtervalues=new String[pdata.data.length][pdata.data[0].length+1];
		table = new JTable(filtervalues,pdata.headings);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		for(int i=0;i<pdata.headings.length;i++)
		table.getColumnModel().getColumn(1).setPreferredWidth(140);
		
		table.setGridColor(new Color(0, 0, 0));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Tahoma", Font.BOLD, 10));
		table.setRowHeight(40);
		table.getTableHeader().setFont(new Font("SansSerif",Font.BOLD,12));
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane_1.setBorder(new LineBorder(new Color(130, 135, 144), 2));
         panel.add(scrollPane_1,BorderLayout.CENTER);
        
        JLabel heading = new JLabel("Rantal Management System");
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setForeground(new Color(32, 178, 170));
        heading.setFont(new Font("Times New Roman",Font.BOLD, 30));
        heading.setBounds(197, 10, 420, 42);
        contentPane.add(heading);
        
        JPanel compPanel = new JPanel();
        compPanel.setBounds(10, 62, 408, 401);
        contentPane.add(compPanel);
        compPanel.setLayout(null);
        
        JLabel aptype = new JLabel("Apartment Type");
        aptype.setHorizontalAlignment(SwingConstants.RIGHT);
        aptype.setFont(new Font("Tahoma",Font.BOLD,20));
        aptype.setForeground(new Color(0, 0, 0));
        aptype.setBounds(0, 0, 201, 44);
        compPanel.add(aptype);
        
        ap_type = new JComboBox();
        ap_type.setBorder(new LineBorder(new Color(0, 0, 0),2));
        ap_type.setForeground(new Color(128, 128, 128));
        ap_type.setBounds(206, 0, 201, 44);
        ap_type.setFont(new Font("Arial",Font.BOLD,16));
        ap_type.setModel(new DefaultComboBoxModel(new String[] {"---Choose Apartment Type---", "1 BHK", "2 BHK", "3 BHK", "4 BHK", "5 BHK"}));
        compPanel.add(ap_type);
        
        JLabel amtype = new JLabel("Amenities");
        amtype.setHorizontalAlignment(SwingConstants.RIGHT);
        amtype.setFont(new Font("Tahoma", Font.BOLD,20));
        amtype.setForeground(new Color(0, 0, 0));
        amtype.setBounds(0, 55, 201, 44);
        compPanel.add(amtype);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(206, 49, 192, 65);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        compPanel.add(scrollPane);
        
        amenities = new JList();
        amenities.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        amenities.setForeground(new Color(128, 128, 128));
        amenities.setFont(new Font("Arial", Font.BOLD,16));
        amenities.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        amenities.setModel(new AbstractListModel() {String[] values = new String[] {"--Choose Amenties--", "Library", "Pool", "Park", "Gym", "Spa"};
              public int getSize() {return values.length;}
              public Object getElementAt(int index) {return values[index];
              }
        });
        scrollPane.setViewportView(amenities);
        
        JLabel furnish_type = new JLabel("All Furnishings");
        furnish_type.setHorizontalAlignment(SwingConstants.RIGHT);
        furnish_type.setFont(new Font("Tahoma",Font.BOLD,20));
        furnish_type.setForeground(new Color(0, 0, 0));
        furnish_type.setBounds(0, 134, 201, 44);
        compPanel.add(furnish_type);
        
        furnishings = new JComboBox();
        furnishings.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        furnishings.setForeground(new Color(128, 128, 128));
        furnishings.setFont(new Font("Arial",Font.BOLD,16));
        furnishings.setModel(new DefaultComboBoxModel(new String[] {"--Select Furnishings--", "Not Furnishings", "Semi-Furnishings", "Fully-Furnishings"}));
        furnishings.setBounds(206, 138, 201, 44);
        compPanel.add(furnishings);
        
        JLabel rental_type = new JLabel("Rental Type");
        rental_type.setHorizontalAlignment(SwingConstants.RIGHT);
        rental_type.setFont(new Font("Tahoma",Font.BOLD,20));
        rental_type.setForeground(new Color(0, 0, 0));
        rental_type.setBounds(0, 192, 201, 44);
        compPanel.add(rental_type);
        
        rentaltype = new JComboBox();
        rentaltype.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        rentaltype.setForeground(new Color(128, 128, 128));
        rentaltype.setFont(new Font("Arial", Font.BOLD, 16));
        rentaltype.setModel(new DefaultComboBoxModel(new String [] {"--Select Rental Type--", "Daily", "Weekly", "Monthly", "Half Yearly", "Yearly"}));
        rentaltype.setBounds(206, 192, 201, 44);
        compPanel.add(rentaltype);
        
        JLabel max_price = new JLabel("Minimum Price");
        max_price.setHorizontalAlignment(SwingConstants.RIGHT);
        max_price.setFont( new Font("Tahoma", Font.BOLD, 20));
        max_price.setForeground(new Color(0, 0, 0));
        max_price.setBounds(0, 246, 201, 44);
        compPanel.add(max_price);
        
        maxprice = new JTextField();
        maxprice.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        maxprice.setForeground(new Color(128, 128, 128));
        maxprice.setFont(new Font("Arial", Font.BOLD, 16));
        maxprice.setBounds(206, 246, 201, 44);
        compPanel.add(maxprice);
        
        JLabel min_price = new JLabel("Maximum Price");
        min_price.setHorizontalAlignment(SwingConstants.RIGHT);
        min_price.setFont(new Font("Tahoma", Font.BOLD, 20));
        min_price.setForeground(new Color(0, 0, 0));
        min_price.setBounds(0, 300, 201, 44);
        compPanel.add(min_price);
        
        minprice = new JTextField();
        minprice.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        minprice.setForeground(new Color(128, 128, 128));
        minprice.setFont(new Font("Arial", Font.BOLD, 16));
        minprice.setBounds(206, 300, 201, 44);
        compPanel.add(minprice);
        
        JLabel lblNewLabel = new JLabel("Hold CTRL Key to Select Multiple Options");
        lblNewLabel.setBounds(206, 115, 196, 13);
        compPanel.add(lblNewLabel);
        
        JButton btnNewButton_1 = new JButton("Close");
        btnNewButton_1.setMnemonic('C');
        btnNewButton_1.addActionListener(new ActionListener() {
        	   public void actionPerformed(ActionEvent e)
        	   {  
        
                   dispose();
	           }
        	   
        });
        btnNewButton_1.setFont(new Font("Tahoma",Font.BOLD,17));
        btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0),2));
        btnNewButton_1.setBackground(new Color(0, 206, 209));
        btnNewButton_1.setBounds(618, 489, 154, 31);
        contentPane.add(btnNewButton_1);
        
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(417, 489, 154, 31);
        contentPane.add(btnReset);
        btnReset.setMnemonic('R');
        btnReset.addActionListener(new ActionListener()
        		{
        			public void actionPerformed(ActionEvent e)
        			{
        				ap_type.setSelectedIndex(0);
        				amenities.setSelectedIndex(0);
        				furnishings.setSelectedIndex(0);
        				rentaltype.setSelectedIndex(0);
        				minprice.setText("");
        				maxprice.setText("");
        				for(int i=0;i<filtervalues.length;i++)
        				{
        					for(int j=0; j<filtervalues[i].length;j++)
        						filtervalues[i][j]="";
        				}
        				table.updateUI();
        			}
        		});
          btnReset.setFont(new Font("Tahoma", Font.BOLD, 17));
          btnReset.setBackground(new Color(0, 206, 209));
          btnReset.setBorder(new LineBorder(new Color(0, 0, 0), 2));
          
          JButton btnNewButton = new JButton("Show Listings");
          btnNewButton.setBounds(229, 489, 154, 31);
          contentPane.add(btnNewButton);
          btnNewButton.setMnemonic('S');
          btnNewButton.addActionListener(new ActionListener() {
        	  public void actionPerformed(ActionEvent e)
        	  {
        		  String atype = (String) ap_type.getSelectedItem();
        		  int indeces[]=amenities.getSelectedIndices();
        		  String amts[]=new String[indeces.length];
        		  String ament="";
        		  for(int i=0;i<indeces.length;i++)
        		  {
        			  ament+=""+amenities.getModel().getElementAt(indeces[i]);
        			  if(i!=(indeces.length-1)) ament+=", ";
        			  
        		  }
        		  String furnish=(String) furnishings.getSelectedItem();
        		  String rtype = (String)rentaltype.getSelectedItem();
        		  
        		  if((minprice.getText()).equals("")||(maxprice.getText()).equals(""))
        		  {
        			  JOptionPane.showMessageDialog(new HomePage(), "minimum and maximum price can't be left blank");
        			  
        		  }
        		  int r=0;
        		  String am="";
        		  for(int i=0;i<pdata.data.length;i++)
        		  {
        			  int rprice=Integer.parseInt(pdata.data[i][8]);
        			  if((atype.equals(pdata.data[i][1]))&&(furnish.equals(pdata.data[i][2]))&&(rtype.equals(pdata.data[i][3])))
        			  {
        				  System.out.println("hello");
        				  for(int x=1;x<pdata.amenties1[i].length;x++)
        				  {
        					  am+=pdata.amenties1[i][x]+",";
        				  }
        				  for(int c=0,c1=0;c<filtervalues[r].length;c++)
        				  {
        					  if(c==4) {filtervalues[r][c]=am;}
        					  else {filtervalues[r][c]=pdata.data[i][c1];
        					  System.out.println(c+" "+filtervalues[r][c]+" "+pdata.data[i][c1]);
        					  c1++;
        					  }
        				  }
        				  r++;
        			  }
        		  }
        		  table.updateUI();
        	  }
          });
          btnNewButton.setFont(new Font("Tahoma",Font.BOLD,17));
          btnNewButton.setBackground(new Color(0, 206, 209));
          btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0),2));
		}

}
