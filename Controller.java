import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Controller implements ActionListener{

    Viewer viewer;

    Controller (Viewer viewer) {
	this.viewer = viewer;
    }

    public void actionPerformed(ActionEvent event) {

	String command = event.getActionCommand();	

	if (command.equals("createNewDocument")) {
	    System.out.println("createNewDocument");
	    viewer.update("createNewDocument");

	} else if (command.equals("openDocument")) {

		A ob = new A();
		String text = ob.erkin();
		viewer.update(text);

		String fileName = ob.getFileName();

		viewer.setTitle(fileName);

	} else if (command.equals("saveDocument")) {
