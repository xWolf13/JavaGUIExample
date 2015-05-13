import java.awt.*;
import java.awt.event.*;

public class FirstEvents extends Frame implements ActionListener {

	TextField tf = new TextField("Inital Value");

	public FirstEvents(String title) {
		super(title);
		Button b = new Button("Good Button");
		b.setBounds(30, 100, 80, 30); // Set button position and size
		this.add(b);
		b.addActionListener(this);

		Button b2 = new Button("Bad Button");
		b2.setBounds(30, 200, 80, 30);
		add(b2);
		b2.addActionListener(this);

		tf.setBounds(50, 50, 200, 20);
		add(tf);

		this.add(b); // Add the button to the frame
		setSize(300, 300); // Set the size of the Frame
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Good Button")) {
		tf.setText(">:)");
		} else {
			tf.setText(">:(");
		}
		
	}

}
