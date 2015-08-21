import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.io.File;

class Temp128 implements ActionListener
{
    Temp128 t;
    static String sw;
    JFrame f, f1, f2;
    JTextArea t2, t1, tta;
    JTree jt;
    JButton b1, b2, b3, bb1;
    JLabel l1, l2, l3, l4, ll1, ll2, ll3;
    JTextField tf, tf1, ttf1, ttf2;
    String s1;
    Canvas c;
    static String ss[];
    JMenu menu, help;
    JMenuBar mbar;
    static int count = 0;
    DefaultMutableTreeNode root, l[];
    JScrollPane sp1, sp2;
    JMenuItem i1, i2, i3, i;
    Temp128(String s) throws IOException, NullPointerException, FileNotFoundException
    {
	this.t = this;
	sw = s;
	f1 = new JFrame(s);
	//c = new Canvas();
	mbar = new JMenuBar();
	//c.drawString("Welcome to Pant!!");
	//c.setBounds(400, 400, 400, 400);
	//f1.add(c);
	menu = new JMenu("Features");
	mbar.add(menu);
	i1 = new JMenuItem("Zip");
	i2 = new JMenuItem("Unzip");
	i3 = new JMenuItem("Exit");
	help = new JMenu("Help");
	mbar.add(help);
	i = new JMenuItem("Dhinka Chika");
	help.add(i);
	menu.add(i1);
	menu.add(i2);
	menu.addSeparator();
	menu.add(i3);
	i1.addActionListener(this);
	i2.addActionListener(this);
	i3.addActionListener(this);
	f1.setJMenuBar(mbar);
	f1.setLayout(null);
	f1.setSize(1000, 1000);
	f1.setVisible(true);
    }
	   

    public void extendList(DefaultMutableTreeNode node, String s)
    {
	File fff = new File(s);
	if(!fff.isDirectory())
	    {
		System.out.println("Reading : " + fff.getName());
		DefaultMutableTreeNode child = new DefaultMutableTreeNode(fff);
		node.add(child);
	    }
	else
	    {
		System.out.println("Accessing : " + f.getName());
		DefaultMutableTreeNode child = new DefaultMutableTreeNode(fff);
		node.add(child);
		String files[] = fff.list();
		for(int i = 0; i<files.length; i++)
		    {
			extendList(node, files[i]);
		    }
	    }
    }

    public void actionPerformed(ActionEvent e)// throws IOException, FileNotFoundException
    {
	if(e.getActionCommand().equals("Zip"))
	    {
		
		f = new JFrame(sw);
		mbar = new JMenuBar();
		//c.drawString("Welcome to Pant!!");
		//c.setBounds(400, 400, 400, 400);
		//f1.add(c);
		menu = new JMenu("Features");
		mbar.add(menu);
		i1 = new JMenuItem("Zip");
		i2 = new JMenuItem("Unzip");
		i3 = new JMenuItem("Exit");
		menu.add(i1);
		menu.add(i2);
		menu.addSeparator();
		menu.add(i3);
		help = new JMenu("Help");
		mbar.add(help);
		i = new JMenuItem("Dhinka Chika");
		help.add(i);
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		f.setJMenuBar(mbar);
		l1 = new JLabel("Files:");
		l1.setBounds(50, 20, 100, 50);
		f.add(l1);
		l2 = new JLabel("Selected Files:");
		l2.setBounds(520, 20, 200, 50);
		f.add(l2);
		t1 = new JTextArea();
		t1.setBounds(20, 70, 400, 550);
		f.add(t1);
		t2 = new JTextArea();
		t2.setBounds(580, 70, 400, 550);
		f.add(t2);
		l4 = new JLabel("I/P Folder:");
		l4.setBounds(20, 640, 200, 50);
		f.add(l4);
		tf1 = new JTextField();
		tf1.setBounds(140, 640, 200, 50);
		f.add(tf1);
		//File f1 = new File("/home/rishabh/Documents/Link to Emacs - Java");
		//l = new DefaultMutableTreeNode[50];
		//root = new DefaultMutableTreeNode(f1);
		//extendList(root, "/home/rishabh/Documents/Link to Emacs - Java");
		/*String list[] = f1.list();
		  boolean bb;
		  for(int i = 0; i<list.length; i++)
		  {
		  File f2 = new File(list[i]);
		  if((bb = f2.isDirectory()) == true)
		  {
		  l[i] = new DefaultMutableTreeNode(list[i]);
		  root.add(l[i]);
		  }
		  }
		  Properties p = System.getProperties();*/
		//DefaultTreeModel model = new DefaultTreeModel(new File(System.getProperty("user.dir")));
		//jt = new JTree(root);
		//f.add(new JScrollPane((JTree)jt), "Center");
		//jt.setRootVisible(true);
		//jt.addActionListener(this);
		//jt.setBounds(20, 70, 400, 550);
		//f.add(jt);
		b1 = new JButton(">>");
		b1.setBounds(450, 310, 100, 50);
		b1.addActionListener(this);
		f.add(b1);
		b2 = new JButton("Zip");
		b2.setBounds(450, 400, 100, 50);
		b2.addActionListener(this);
		f.add(b2);
		b3 = new JButton("Reload");
		b3.setBounds(200, 20, 100, 50);
		b3.addActionListener(this);
		f.add(b3);
		//sp1 = new JScrollPane(jt);
		//jt.add(sp1);
		//sp2 = new JScrollBar();
		//jt.add(sp1);
		//t2.add(sp2);
		//f.add(sp1);
		l3 = new JLabel("O/P Folder:");
		l3.setBounds(500, 650, 100, 50);
		f.add(l3);
		tf = new JTextField();
		tf.setBounds(600, 650, 200, 50);
		f.add(tf);
		f.setSize(1000, 1000);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(false);
		//f2.setVisible(false);
		f.setVisible(true);
		ss = new String[10];
	    }
	if(e.getActionCommand().equals("Exit"))
	    {
		System.exit(0);
	    }
	if(e.getActionCommand().equals("Unzip"))
	    {
		f2 = new JFrame(sw);
		mbar = new JMenuBar();
		//c.drawString("Welcome to Pant!!");
		//c.setBounds(400, 400, 400, 400);
		//f1.add(c);
		menu = new JMenu("Features");
		mbar.add(menu);
		i1 = new JMenuItem("Zip");
		i2 = new JMenuItem("Unzip");
		i3 = new JMenuItem("Exit");
		menu.add(i1);
		menu.add(i2);
		count = 0;
		menu.addSeparator();
		menu.add(i3);
		help = new JMenu("Help");
		mbar.add(help);
		i = new JMenuItem("Dhinka Chika");
		help.add(i);
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		f2.setJMenuBar(mbar);
		ll1 = new JLabel("I/P Zip Destination:");
		ll1.setBounds(40, 200, 200, 50);
		f2.add(ll1);
		ll2 = new JLabel("O/P Folder:");
		ll2.setBounds(40, 300, 150, 50);
		f2.add(ll2);
		ttf1 = new JTextField();
		ttf1.setBounds(200, 200, 100, 50);
		f2.add(ttf1);
		ttf2 = new JTextField();
		ttf2.setBounds(200, 300, 100, 50);
		f2.add(ttf2);
		bb1 = new JButton(">>");
		bb1.setBounds(350, 250, 100, 50);
		f2.add(bb1);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ll3 = new JLabel("Extracted Files:");
		ll3.setBounds(550, 20, 200, 50);
		f2.add(ll3);
		tta = new JTextArea();
		tta.setBounds(500, 50, 200, 600);
		f2.add(tta);
		bb1.addActionListener(this);
		//f1.setVisible(false);
		//f.setVisible(false);
		f2.setSize(1000, 1000);
		f2.setLayout(null);
		f2.setVisible(true);
	    }

	if(e.getSource() == bb1)
	    {
		String t1 = ttf1.getText();
		String tt = new String();
		for(int i = t1.length()-1; i>=0; i--)
		    {
			if(t1.charAt(i) == '/')
			    {
				for(int j = i+1; j<t1.length(); j++)
				    {
					tt = tt + t1.charAt(j);
				    }
				break;
			    }
		    }
		count = 0;
		System.out.println(tt);
		String show = new String();
		try
		    {
			ZipFile zipFile = new ZipFile(t1);
			Enumeration enu = zipFile.entries();
			System.out.println("------------------------------------------------");
			while(enu.hasMoreElements())
			    {
				ZipEntry zipEntry = (ZipEntry)enu.nextElement();
				String name = zipEntry.getName();
				String name1 = name + "\n";
				System.out.println(name);
				System.out.println(name1);
				show = show + name1;
				//ss[count] = name1;
				//count++;
				String ss2 = ttf2.getText();
				ss2 = ss2 + '/';
				ss2 = ss2 + name;
				System.out.println(ss2);
				System.out.println("Name : " + name);
				File fff = new File(ss2);
				InputStream in = zipFile.getInputStream(zipEntry);
				FileOutputStream fout = new FileOutputStream(fff);
				int length;
				while((length = in.read()) != -1)
				    {
					fout.write(length);
				    }
				in.close();
				fout.close();
			    }
			zipFile.close();
		    }
		catch(Exception ee1)
		    {
			ee1.printStackTrace();
		    }
		tta.setText(show);
	    }
			
		


	if(e.getSource() == b1)
	    {
		String s2 = jt.getSelectionPath() + "\n";
		String sa = new String();
		for(int i = 1; i<s2.length()-2; i++)
		    {
			if(s2.charAt(i) == ',')
			    {
				sa = sa + '/';
				i += 2;
			    }
			sa = sa + s2.charAt(i);
		    }
		s1 = s1 + s2;
		t2.setText(s1);
		ss[count] = sa;
		count++;
		for(int i = 0; i<count; i++)
		    {
			System.out.println(ss[i]);
		    }
	    }
	if(e.getSource() == b2)
	    {
		try
		    {
			t.startZipping();
		    }
		catch(Exception e1)
		    {
			System.out.println(e1);
		    }
	    }
	if(e.getSource() == b3)
	    {
		String s1s = tf1.getText();
		System.out.println(s1s);
		File ff1 = new File(s1s);
		root = new DefaultMutableTreeNode(ff1);
		extendList(root, s1s);
		jt = new JTree(root);
		sp1 = new JScrollPane(jt);
		jt.setRootVisible(true);
		sp1.setBounds(20, 70, 400, 550);
		t1.setVisible(false);
		jt.setVisible(true);
		f.add(sp1);
		}


    }
    public void startZipping() throws IOException, FileNotFoundException
    {
	String s = t.tf.getText();
	s = s + "/test.zip";
	FileOutputStream fout = new FileOutputStream(s);
	ZipOutputStream zout = new ZipOutputStream(fout);
	for(int i = 0; i<count; i++)
	    {
		t.addToZipFile(ss[i], zout);
	    }
	zout.close();
	fout.close();
    }
    public void addToZipFile(String filePath, ZipOutputStream zout) throws IOException, FileNotFoundException
    {
	//String name = filePath.getName();
	System.out.println("Writing : " +filePath);
	File file = new File(filePath);
	String sq = new String();
	for(int i = filePath.length()-1; i>=0; i--)
	    {
		if(filePath.charAt(i) == '/')
		    {
			for(int j = i+1; j<filePath.length(); j++)
			    {
				sq = sq + filePath.charAt(j);
			    }
			break;
		    }
	    }
	System.out.println(sq);
	FileInputStream fin = new FileInputStream(file);
	ZipEntry zipEntry = new ZipEntry(sq);
	zout.putNextEntry(zipEntry);
	byte b[] = new byte[fin.available()];
	fin.read(b);
	zout.write(b);
	zout.closeEntry();
	fin.close();
    }
    public static void main(String... s)
    {
	try
	    {
		Temp128 t = new Temp128("Pant");
	    }
	catch(Exception e)
	    {
		System.out.println(e);
		e.printStackTrace();
	    }
    }
}
		
