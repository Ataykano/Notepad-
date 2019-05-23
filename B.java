import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.io.File;
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

	try {
		FileWriter fileWriter = new FileWriter(file);
		PrintWriter outputStream = new PrintWriter(fileWriter);
		outputStream.println(text);
		outputStream.close();

	} catch(IOException e) {
		System.out.println(e);


	}
    }
}
