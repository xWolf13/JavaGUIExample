import java.awt.*;
public class First extends Frame {
	
	First(String title) {
		super(title);
		Button b = new Button("Click me cuh");
		b.setBounds(30, 100, 80, 30); // Set button position and size
		
		Button b2 = new Button("Don't click me");
		b2.setBounds(30, 200, 80, 30);
		add(b2);
		
		this.add(b); // Add the button to the frame
		setSize(300, 300); // Set the size of the Frame
		setLayout(null);
		setVisible(true);
	}

}
