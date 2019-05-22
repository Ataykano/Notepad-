import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JButton; 
import javax.swing.JToolBar; 
import javax.swing.Box;

class Viewer {

    private JTextArea textArea;
    private JFrame frame;

    Viewer () {
	Controller controller = new Controller (this);

	Font fontMenu = new Font("Arial", Font.BOLD, 20);
	Font fontMenuItem = new Font("Arial", Font.BOLD, 18);
	Font fontTextArea = new Font("Arial", Font.BOLD, 20);

	textArea = new JTextArea();
	textArea.setFont(fontTextArea);
	JScrollPane scroll = new JScrollPane(textArea);

	JMenuBar menu = new JMenuBar();

	JMenu fileMenu = new JMenu("File");
	fileMenu.setFont(fontMenu);

	JMenuItem createNewDocument = new JMenuItem("New", new ImageIcon("images/new.gif"));
	createNewDocument.setFont(fontMenuItem);
	createNewDocument.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
	createNewDocument.addActionListener(controller);
	createNewDocument.setActionCommand("createNewDocument");

	JMenuItem openDocument = new JMenuItem("Open", new ImageIcon("images/open.gif"));
	openDocument.setFont(fontMenuItem);
	openDocument.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
	openDocument.addActionListener(controller);
	openDocument.setActionCommand("openDocument");

	JMenuItem saveDocument = new JMenuItem("Save", new ImageIcon("images/save.gif"));
	saveDocument.setFont(fontMenuItem);
	saveDocument.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
	saveDocument.addActionListener(controller);
	saveDocument.setActionCommand("saveDocument");

	JMenuItem saveAsDocument = new JMenuItem("Save as", new ImageIcon("images/save_as.gif"));
	saveAsDocument.setFont(fontMenuItem);
	saveAsDocument.addActionListener(controller);
	saveAsDocument.setActionCommand("saveAsDocument");

	JMenuItem printDocument = new JMenuItem("Print", new ImageIcon("images/print.gif"));
	printDocument.setFont(fontMenuItem);
	printDocument.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
	printDocument.addActionListener(controller);
	printDocument.setActionCommand("printDocument");
        	
	JMenuItem exitItem = new JMenuItem("Exit", new ImageIcon("images/exit.jpg"));
	exitItem.setFont(fontMenuItem);
	exitItem.addActionListener(controller);
	exitItem.setActionCommand("exitItem");
	
	menu.add(fileMenu);
	fileMenu.add(createNewDocument);
	fileMenu.add(openDocument);
	fileMenu.add(saveDocument);
	fileMenu.add(saveAsDocument);
	fileMenu.addSeparator();
	fileMenu.add(printDocument);
	fileMenu.addSeparator();
	fileMenu.add(exitItem);

	JMenu editMenu = new JMenu("Edit");
	editMenu.setFont(fontMenu);

	JMenuItem cutText = new JMenuItem("Cut", new ImageIcon("images/cut.gif"));
	cutText.setFont(fontMenuItem);
	cutText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
	cutText.addActionListener(controller);
	cutText.setActionCommand("cutText");

	JMenuItem copyText = new JMenuItem("Copy", new ImageIcon("images/copy.gif"));
	copyText.setFont(fontMenuItem);
	copyText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
	copyText.addActionListener(controller);
	copyText.setActionCommand("copyText");

	JMenuItem pasteText = new JMenuItem("Paste", new ImageIcon("images/past.gif"));
	pasteText.setFont(fontMenuItem);
	pasteText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
	pasteText.addActionListener(controller);
	pasteText.setActionCommand("pasteText");

	JMenuItem deleteText = new JMenuItem("Delete", new ImageIcon("images/delit.gif"));
	deleteText.setFont(fontMenuItem);
	deleteText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
	deleteText.addActionListener(controller);
	deleteText.setActionCommand("deleteText");

	JMenuItem findText = new JMenuItem("Find", new ImageIcon("images/find.gif"));
	findText.setFont(fontMenuItem);
	findText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
	findText.addActionListener(controller);
	findText.setActionCommand("findText");

	JMenuItem findNextText = new JMenuItem("Find Next", new ImageIcon("images/findMore.gif"));
	findNextText.setFont(fontMenuItem);
	findNextText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
	findNextText.addActionListener(controller);
	findNextText.setActionCommand("findNextText");

	JMenuItem goToText = new JMenuItem("Go To... ", new ImageIcon("images/go.gif"));
	goToText.setFont(fontMenuItem);
	goToText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
	goToText.addActionListener(controller);
	goToText.setActionCommand("goToText");

	JMenuItem selectAllText = new JMenuItem("Select All", new ImageIcon("images/marker.gif"));
	selectAllText.setFont(fontMenuItem);
	selectAllText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
	selectAllText.addActionListener(controller);
	selectAllText.setActionCommand("selectAllText");

	JMenuItem timeDate = new JMenuItem("Time/Date", new ImageIcon("images/time.gif"));
	timeDate.setFont(fontMenuItem);
	timeDate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
	timeDate.addActionListener(controller);
	timeDate.setActionCommand("timeDate");

	menu.add(editMenu);
	editMenu.add(cutText);
	editMenu.add(copyText);
	editMenu.add(pasteText);
	editMenu.add(deleteText);
	editMenu.addSeparator();
	editMenu.add(findText);
	editMenu.add(findNextText);
	editMenu.add(goToText);
	editMenu.addSeparator();
	editMenu.add(selectAllText);
	editMenu.add(timeDate);

	JMenu formatMenu = new JMenu("Format");
	formatMenu.setFont(fontMenu);

	JMenuItem wordWrap = new JMenuItem("Word Wrap", new ImageIcon("images/wordSpace.gif"));
	wordWrap.setFont(fontMenuItem);
	wordWrap.addActionListener(controller);
	wordWrap.setActionCommand("wordWrap");

	JMenuItem fontText = new JMenuItem("Font", new ImageIcon("images/font.gif"));
	fontText.setFont(fontMenuItem);
	fontText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
	fontText.addActionListener(controller);
	fontText.setActionCommand("fontText");

	menu.add(formatMenu);
	formatMenu.add(wordWrap);
	formatMenu.add(fontText);

	JMenu viewMenu = new JMenu("View");
	viewMenu.setFont(fontMenu);

	JMenuItem statusBarMenu = new JMenuItem("Status Bar", new ImageIcon("images/options.gif"));
	statusBarMenu.setFont(fontMenuItem);
	statusBarMenu.addActionListener(controller);
	statusBarMenu.setActionCommand("statusBarMenu");

	menu.add(viewMenu);
	viewMenu.add(statusBarMenu);

	JMenu helpMenu = new JMenu("Help");
	helpMenu.setFont(fontMenu);

	JMenuItem viewHelpMenu = new JMenuItem("View Help");
	viewHelpMenu.setFont(fontMenuItem);
	viewHelpMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
	viewHelpMenu.addActionListener(controller);
	viewHelpMenu.setActionCommand("viewHelpMenu");

	JMenuItem aboutNotepadMenu = new JMenuItem("About Notepad");
	aboutNotepadMenu.setFont(fontMenuItem);
	aboutNotepadMenu.addActionListener(controller);
	aboutNotepadMenu.setActionCommand("aboutNotepadMenu");

	menu.add(helpMenu);
	helpMenu.add(viewHelpMenu);
	helpMenu.addSeparator();
	helpMenu.add(aboutNotepadMenu);

	JButton newButton = new JButton(new ImageIcon("images/new.gif"));	
	newButton.addActionListener(controller);
	newButton.setActionCommand("createNewDocument");

	JButton openButton = new JButton(new ImageIcon("images/open.gif"));	
	openButton.addActionListener(controller);
	openButton.setActionCommand("openDocument");

	JButton saveButton = new JButton(new ImageIcon("images/save.gif"));	
	saveButton.addActionListener(controller);
	saveButton.setActionCommand("saveDocument");
	
	JButton cutButton = new JButton(new ImageIcon("images/cut.gif"));	
	cutButton.addActionListener(controller);
	cutButton.setActionCommand("cutText");

	JButton copyButton = new JButton(new ImageIcon("images/copy.gif"));	
	copyButton.addActionListener(controller);
	copyButton.setActionCommand("copyText");

	JButton pasteButton = new JButton(new ImageIcon("images/past.gif"));	
	pasteButton.addActionListener(controller);
	pasteButton.setActionCommand("pasteText");

	JButton colorButton = new JButton(new ImageIcon("images/color.gif"));	
	colorButton.addActionListener(controller);
	colorButton.setActionCommand("colorButton");

	JToolBar toolBar = new JToolBar();
	toolBar.add(newButton);
	toolBar.add(openButton);
	toolBar.add(saveButton);
	toolBar.add(Box.createHorizontalStrut(10));
	toolBar.add(cutButton);
	toolBar.add(copyButton);
	toolBar.add(pasteButton);
	toolBar.add(colorButton);

	frame = new JFrame("Notepad");
	frame.setSize(920, 700);
	frame.setJMenuBar(menu);
	frame.add("Center", scroll);
	frame.add("North", toolBar);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
   }

    public void update(String text){
	textArea.setText(text);

    }
    public JTextArea getTextArea() {
	return textArea;
    }

    public void setTitle(String fileName) {
	frame.setTitle(fileName + " - Natepad");

    }
}