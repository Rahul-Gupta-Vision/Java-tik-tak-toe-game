import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Tic_Tak_toe implements ActionListener {
	String p1,p2;
	int co=0,cx=0;
	public JFrame j=new JFrame("Tic Tak Toe");
	public JPanel  p=new JPanel();
	public JLabel l1=new JLabel();
	public JLabel l2=new JLabel();
	public JLabel l3=new JLabel();
	public JLabel l4=new JLabel();
	public JButton b1=new JButton();
	public JButton b2=new JButton();
	public JButton b3=new JButton();
	public JButton b4=new JButton();
	public JButton b5=new JButton();
	public JButton b6=new JButton();
	public JButton b7=new JButton();
	public JButton b8=new JButton();
	public JButton b9=new JButton();
	public JButton b10=new JButton("Play Next Round");
	public Tic_Tak_toe () {
		p1=JOptionPane.showInputDialog("Enter Player 1 name","Player 1 Name");
		p2=JOptionPane.showInputDialog("Enter Player 2 name","Player 2 Name");
		j.setVisible(true);
		j.resize(10,250);
		j.setLocation(655,175);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE );
		j.setResizable(false);
		p.setBackground(Color.black);
		j.add(p);
		l1.setForeground(Color.red);
		l2.setForeground(Color.orange);
		l1.setText("Player 1: "+p1.toUpperCase()+"...Turn(X)");
		l2.setText("Player 2: "+p2.toUpperCase()+"...Turn(O)");
		p.add(l1);
		p.add(l2);
	    p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		l3.setForeground(Color.red);
		l4.setForeground(Color.orange);
		l3.setText(p1+"Score : "+cx);
		l4.setText(p2+"Score : "+co);
		p.add(l3);
		p.add(l4);
		b1.addActionListener((ActionListener) this);
		b2.addActionListener((ActionListener) this);
		b3.addActionListener((ActionListener) this);
		b4.addActionListener((ActionListener) this);
		b5.addActionListener((ActionListener) this);
		b6.addActionListener((ActionListener) this);
		b7.addActionListener((ActionListener) this);
        b8.addActionListener((ActionListener) this);
	    b9.addActionListener((ActionListener) this);
	    b10.addActionListener((ActionListener) this);
		l2.setVisible(false);
	}
public static void main(String[] args) {
	Tic_Tak_toe obj=new Tic_Tak_toe();
}
public void func() {
	if(b1.getText().equalsIgnoreCase("X")&&b2.getText().equalsIgnoreCase("X")&&b3.getText().equalsIgnoreCase("X")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p1.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b1.setBackground(Color.red);
		b2.setBackground(Color.red);
		b3.setBackground(Color.red);
		cx++;
	}
	else if(b1.getText().equalsIgnoreCase("X")&&b4.getText().equalsIgnoreCase("X")&&b7.getText().equalsIgnoreCase("X")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p1.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b1.setBackground(Color.red);
		b4.setBackground(Color.red);
		b7.setBackground(Color.red);
		cx++;
	}
	else if(b1.getText().equalsIgnoreCase("X")&&b5.getText().equalsIgnoreCase("X")&&b9.getText().equalsIgnoreCase("X")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p1.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b1.setBackground(Color.red);
		b5.setBackground(Color.red);
		b9.setBackground(Color.red);
		cx++;
	}
	else if(b7.getText().equalsIgnoreCase("X")&&b8.getText().equalsIgnoreCase("X")&&b9.getText().equalsIgnoreCase("X")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p1.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b7.setBackground(Color.red);
		b8.setBackground(Color.red);
		b9.setBackground(Color.red);
		cx++;
	}
	else if(b3.getText().equalsIgnoreCase("X")&&b6.getText().equalsIgnoreCase("X")&&b9.getText().equalsIgnoreCase("X")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p1.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b3.setBackground(Color.red);
		b6.setBackground(Color.red);
		b9.setBackground(Color.red);
		cx++;
	}
	else if(b2.getText().equalsIgnoreCase("X")&&b5.getText().equalsIgnoreCase("X")&&b8.getText().equalsIgnoreCase("X")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p1.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b2.setBackground(Color.red);
		b5.setBackground(Color.red);
		b8.setBackground(Color.red);
		cx++;
	}
	else if(b4.getText().equalsIgnoreCase("X")&&b5.getText().equalsIgnoreCase("X")&&b6.getText().equalsIgnoreCase("X")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p1.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b4.setBackground(Color.red);
		b5.setBackground(Color.red);
		b6.setBackground(Color.red);
		cx++;
	}
	else if(b3.getText().equalsIgnoreCase("X")&&b5.getText().equalsIgnoreCase("X")&&b7.getText().equalsIgnoreCase("X")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p1.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b3.setBackground(Color.red);
		b5.setBackground(Color.red);
		b7.setBackground(Color.red);
		cx++;
	}
	
	l3.setText(p1.toUpperCase()+" Score : "+cx);
	
	}
public void func2() {
	 if(b1.getText().equalsIgnoreCase("O")&&b2.getText().equalsIgnoreCase("O")&&b3.getText().equalsIgnoreCase("O")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p2.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b1.setBackground(Color.orange);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.orange);
		co++;
	}
	else if(b1.getText().equalsIgnoreCase("O")&&b4.getText().equalsIgnoreCase("O")&&b7.getText().equalsIgnoreCase("O")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p2.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b1.setBackground(Color.orange);
		b4.setBackground(Color.orange);
		b7.setBackground(Color.orange);
		co++;
	}
	else if(b1.getText().equalsIgnoreCase("O")&&b5.getText().equalsIgnoreCase("O")&&b9.getText().equalsIgnoreCase("O")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p1.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b1.setBackground(Color.orange);
		b5.setBackground(Color.orange);
		b9.setBackground(Color.orange);
		co++;
	}
	else if(b7.getText().equalsIgnoreCase("O")&&b8.getText().equalsIgnoreCase("O")&&b9.getText().equalsIgnoreCase("O")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p1.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b7.setBackground(Color.orange);
		b8.setBackground(Color.orange);
		b9.setBackground(Color.orange);
		co++;
	}
	else if(b3.getText().equalsIgnoreCase("O")&&b6.getText().equalsIgnoreCase("O")&&b9.getText().equalsIgnoreCase("O")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p1.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b3.setBackground(Color.orange);
		b6.setBackground(Color.orange);
		b9.setBackground(Color.orange);
		co++;
	}
	else if(b2.getText().equalsIgnoreCase("O")&&b5.getText().equalsIgnoreCase("O")&&b8.getText().equalsIgnoreCase("O")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p2.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b2.setBackground(Color.orange);
		b5.setBackground(Color.orange);
		b8.setBackground(Color.orange);
		co++;
	}
	else if(b4.getText().equalsIgnoreCase("O")&&b5.getText().equalsIgnoreCase("O")&&b6.getText().equalsIgnoreCase("O")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p2.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b4.setBackground(Color.orange);
		b5.setBackground(Color.orange);
		b6.setBackground(Color.orange);
		co++;
	}
	else if(b3.getText().equalsIgnoreCase("O")&&b5.getText().equalsIgnoreCase("O")&&b7.getText().equalsIgnoreCase("O")) {
		JOptionPane.showMessageDialog(j,"Congratulation!!..The winner is: "+p2.toUpperCase(),"Winner",JOptionPane.INFORMATION_MESSAGE);
		b3.setBackground(Color.orange);
		b5.setBackground(Color.orange);
		b7.setBackground(Color.orange);
		co++;
	}
	 
	 l4.setText(p2.toUpperCase()+" Score : "+co);
}

public void actionPerformed(ActionEvent e) {
	if(l1.isVisible()) {
		if(e.getSource()==b1 ) {
		b1.setText("X");
		l1.setVisible(false);
		l2.setVisible(true);
		b1.setEnabled(false);
		func();
		func2();
	}
		else if(e.getSource()==b2) {
			b2.setText("X");
			l1.setVisible(false);
			l2.setVisible(true);
			b2.setEnabled(false);
			func();
			func2();
		}
		else if(e.getSource()==b3) {
			b3.setText("X");
			l1.setVisible(false);
			l2.setVisible(true);
			b3.setEnabled(false);
			func();
			func2();
		}
		else if(e.getSource()==b4) {
			b4.setText("X");
			l1.setVisible(false);
			l2.setVisible(true);
			b4.setEnabled(false);
			func();
			func2();
		}
		else if(e.getSource()==b5) {
			b5.setText("X");
			l1.setVisible(false);
			l2.setVisible(true);
			b5.setEnabled(false);
			func();
			func2();
		}else if(e.getSource()==b6) {
			b6.setText("X");
			l1.setVisible(false);
			l2.setVisible(true);
			b6.setEnabled(false);
			func();
			func2();
		}else if(e.getSource()==b7) {
			b7.setText("X");
			l1.setVisible(false);
			l2.setVisible(true);
			b7.setEnabled(false);
			func();
			func2();
		}else if(e.getSource()==b8) {
			b8.setText("X");
			l1.setVisible(false);
			l2.setVisible(true);
			b8.setEnabled(false);
			func();
			func2();
		}else if(e.getSource()==b9) {
			b9.setText("X");
			l1.setVisible(false);
			l2.setVisible(true);
			b9.setEnabled(false);
			func();	
			func2();
		}
		
		l2.setVisible(true);
		
	}
		else if(l2.isVisible()) {
		if(e.getSource()==b1 ) {
			b1.setText("O");
			l1.setVisible(true);
			l2.setVisible(false);
			b1.setEnabled(false);
			func();
			func2();
		}
			else if(e.getSource()==b2) {
				b2.setText("O");
				l1.setVisible(true);
				l2.setVisible(false);
				b2.setEnabled(false);
				func();
				func2();
			}
			else if(e.getSource()==b3) {
				b3.setText("O");
				l1.setVisible(true);
				l2.setVisible(false);
				b3.setEnabled(false);
				func();
				func2();
			}
			else if(e.getSource()==b4) {
				b4.setText("O");
				l1.setVisible(true);
				l2.setVisible(false);
				b4.setEnabled(false);
				func();
				func2();
				
			}
			else if(e.getSource()==b5) {
				b5.setText("O");
				l1.setVisible(true);
				l2.setVisible(false);
				b5.setEnabled(false);
				func();
				func2();
				
			}else if(e.getSource()==b6) {
				b6.setText("O");
				l1.setVisible(true);
				l2.setVisible(false);
				b6.setEnabled(false);
				func();	
				func2();
			}else if(e.getSource()==b7) {
				b7.setText("O");
				l1.setVisible(true);
				l2.setVisible(false);
				b7.setEnabled(false);
				func();
				func2();
			}else if(e.getSource()==b8) {
				b8.setText("O");
				l1.setVisible(true);
				l2.setVisible(false);
				b8.setEnabled(false);
				func();
				func2();
			}else if(e.getSource()==b9) {
				b9.setText("O");
				l1.setVisible(true);
				l2.setVisible(false);
				b9.setEnabled(false);
				func();
				func2();
			}
		
	}
	if(e.getSource()==b10) {
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
		b1.setBackground(Color.white );
		b2.setBackground(Color.white );
		b3.setBackground(Color.white );
		b4.setBackground(Color.white );
		b5.setBackground(Color.white );
		b6.setBackground(Color.white );
		b7.setBackground(Color.white );
		b8.setBackground(Color.white );
		b9.setBackground(Color.white );
		if(cx>co) {
			l1.setVisible(true);
			l2.setVisible(false);
		}
		else if(cx<co) {
			l1.setVisible(false);
			l2.setVisible(true);
			
		}
		
	}
}



}





