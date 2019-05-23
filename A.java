import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.io.File;
class A {


    private String fileName;

    A() {

	fileName = "";
    }
    public String getFileName() {

        return fileName;
    }

    public String atay() {
	JFileChooser fc = new JFileChooser();
	int returnVal = fc.showOpenDialog(new JFrame());

	File file = null;
	if(returnVal == 0) {
		file = fc.getSelectedFile();
		fileName = file.getName();

