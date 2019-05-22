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
		String text = ob.atay();
		viewer.update(text);

		String fileName = ob.getFileName();

		viewer.setTitle(fileName);

	} else if (command.equals("saveDocument")) {

		B ob1 = new B();
		String text = viewer.getTextArea().getText();
		ob1.saveToFile(text);




	} else if (command.equals("printDocument")) {
	    System.out.println("printDocument");
	    viewer.update("printDocument");
	} else if (command.equals("exitItem")) {
	    System.out.println("exitItem");
	    viewer.update("exitItem");
	} else if (command.equals("cutText")) {
	    viewer.getTextArea().cut();
	} else if (command.equals("copyText")) {
	    viewer.getTextArea().copy();
	} else
	if (command.equals("pasteText")) {
	    viewer.getTextArea().paste();	
	} else
	if (command.equals("deleteText")) {
	    int start = viewer.getTextArea().getSelectionStart();
	    int end = viewer.getTextArea().getSelectionEnd();
	    viewer.getTextArea().replaceRange("", start, end);
	} else
	if (command.equals("findText")) {
	    System.out.println("findText");
	    viewer.update("findText");
	} else

	if (command.equals("findNextText")) {
	    System.out.println("findNextText");
	    viewer.update("findNextText");
	} else

	if (command.equals("goToText")) {
	    System.out.println("goToText");
	    viewer.update("goToText");
	} else

	if (command.equals("selectAllText")) {
	    viewer.getTextArea().selectAll();
 
	} else

	if (command.equals("timeDate")) {
	    System.out.println("timeDate");
	    viewer.update("timeDate");
	} else

	if (command.equals("wordWrap")) {
	    System.out.println("wordWrap");
	    viewer.update("wordWrap");
	} else

	if (command.equals("fontText")) {
	    System.out.println("fontText");
	    viewer.update("fontText");
	} else

	if (command.equals("statusBarMenu")) {
	    System.out.println("statusBarMenu");
	    viewer.update("statusBarMenu");
	} else

	if (command.equals("viewHelpMenu")) {
	    System.out.println("viewHelpMenu");
	    viewer.update("viewHelpMenu");
	} else

	if (command.equals("aboutNotepadMenu")) {
	    System.out.println("aboutNotepadMenu");
	    viewer.update("aboutNotepadMenu");
	} 

    }
}                              
