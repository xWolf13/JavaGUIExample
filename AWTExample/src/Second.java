import java.awt.*;

public class Second extends Frame {
	private String titleText = "This is a title";
	public Second(String frameTitle) {
		
		super(frameTitle);
/*		setLayout(new FlowLayout());*/
		setLayout(new BorderLayout());
		TextArea console = new TextArea();
		add(console, BorderLayout.SOUTH);
		
		Choice menu = new Choice();
		menu.add("Option 1");
		menu.add("Option 2");
		add(menu);
		
		Label title = new Label(titleText);
		add(title);
		title.setAlignment(Label.CENTER);
		
		setVisible(true);
	}

}
