import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Controller implements ActionListener{

    Viewer viewer;

    Controller (Viewer viewer) {
	this.viewer = viewer;
    }

    public void actionPerformed(ActionEvent event) {
