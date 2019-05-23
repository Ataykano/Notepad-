import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
class B {
    B() {
    }

    public void saveToFile(String text) {
	JFileChooser fc = new JFileChooser();
	int returnVal = fc.showSaveDialog(new JFrame());
	File file = null;
	if(returnVal == 0) {
		file = fc.getSelectedFile();
	}
