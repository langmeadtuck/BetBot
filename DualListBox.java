package csvReader;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
public class DualListBox extends JPanel {
 /**
	 * 
	 */
int	DrewBrees=5228;
int	RyanFitzpatrick=2840;
int	MarcusMariota=3775;
int	MattSchaub=14;
int DrewStanton=189;
int EliManning=4018;
int CamNewton=3868;
int TomBrady=3618;
int ColinKaepernick=2709;
int DerekCarr=4007;
int AndyDalton=4390;
int GenoSmith=135;
int JayCutler=1083;
int CarsonPalmer=4271;
int BenRoethlisberger=3833;
int BrockOsweiler=3088;
int ScottTolzien=219;
int ChadHenne=-2;
int RyanTannehill=3159;
int AlexSmith=3636;
int AaronRodgers=4797;
int AndrewLuck=4581;
int TrevorSiemian=3458;
int KirkCousins=5013;
int JameisWinston=4255;
int MattMoore=720;
int AJMcCarron=0;
int MarkSanchez=91;
int JoeFlacco=4375;
int PhilipRivers=4421;
int TomSavage=473;
int RussellWilson=4478;
int MikeGlennon=75;
int MatthewStafford=4534;
int JaredGoff=2252;
int JimmyGaroppolo=508;
int TyrodTaylor=3603;
int ChaseDaniel=16;
int LandryJones=554;
int MattRyan=5061;
int BlakeBortles=4264;
int DerekAnderson=457;
int SamBradford =3930;

private static final long serialVersionUID = 1L;
private static final Insets EMPTY_INSETS = new Insets(0, 0, 0, 0); 
private static final String ADD_BUTTON_LABEL = "Add >>";
private static final String ADD_BUTTON_LABEL1 = "Get Calculation >>";
private static final String REMOVE_BUTTON_LABEL = "<< Remove";  
private static final String DEFAULT_SOURCE_CHOICE_LABEL = "Select QB";
private static final String DEFAULT_DEST_CHOICE_LABEL = "QB Choices";
private static final String DEFAULT_DEST_Final_LABEL = "Top QB Choices";
private JLabel sourceLabel;  private JList sourceList;  private SortedListModel sourceListModel;  
private JList destList;  private SortedListModel destListModel;  private JLabel destLabel;
private JList finalList;  private SortedListModel finalListModel;  private JLabel finalLabel;

private JButton addButton;  private JButton removeButton;  public DualListBox() {
   initScreen();  }
 public String getSourceChoicesTitle() {
   return sourceLabel.getText();  }
 public void setSourceChoicesTitle(String newValue) {
   sourceLabel.setText(newValue);  }
 public String getDestinationChoicesTitle() {
   return destLabel.getText();  }
 public void setDestinationChoicesTitle(String newValue) {
   destLabel.setText(newValue);  }
 public void clearSourceListModel() {
   sourceListModel.clear();  }
 public void clearDestinationListModel() {
   destListModel.clear();  }
 public void addSourceElements(ListModel newValue) {
   fillListModel(sourceListModel, newValue);  }
 public void setSourceElements(ListModel newValue) {
   clearSourceListModel();
 addSourceElements(newValue);  }
 public void addDestinationElements(ListModel newValue) {
   fillListModel(destListModel, newValue);  }
 private void fillListModel(SortedListModel model, ListModel newValues) {
   int size = newValues.getSize();
 for (int i = 0; i < size; i++) {
     model.add(newValues.getElementAt(i));
 }
 }
 public void addSourceElements(Object newValue[]) {
   fillListModel(sourceListModel, newValue);  }
 public void setSourceElements(Object newValue[]) {
   clearSourceListModel();
 addSourceElements(newValue);  }
 public void addDestinationElements(Object newValue[]) {
   fillListModel(destListModel, newValue);  }
 private void fillListModel(SortedListModel model, Object newValues[]) {
   model.addAll(newValues);  }
 public Iterator sourceIterator() {
   return sourceListModel.iterator();  }
 public Iterator destinationIterator() {
   return destListModel.iterator();  }
 public void setSourceCellRenderer(ListCellRenderer newValue) {
   sourceList.setCellRenderer(newValue);  }
 public ListCellRenderer getSourceCellRenderer() {
   return sourceList.getCellRenderer();  }
 public void setDestinationCellRenderer(ListCellRenderer newValue) {
   destList.setCellRenderer(newValue);  }
 public ListCellRenderer getDestinationCellRenderer() {
   return destList.getCellRenderer();  }
 public void setVisibleRowCount(int newValue) {
   sourceList.setVisibleRowCount(newValue);
 destList.setVisibleRowCount(newValue);  }
 public int getVisibleRowCount() {
   return sourceList.getVisibleRowCount();  }
 public void setSelectionBackground(Color newValue) {
   sourceList.setSelectionBackground(newValue);
 destList.setSelectionBackground(newValue);  }
 public Color getSelectionBackground() {
   return sourceList.getSelectionBackground();  }
 public void setSelectionForeground(Color newValue) {
   sourceList.setSelectionForeground(newValue);
 destList.setSelectionForeground(newValue);  }
 public Color getSelectionForeground() {
   return sourceList.getSelectionForeground();  }
 private void clearSourceSelected() {
   Object selected[] = sourceList.getSelectedValues();
 for (int i = selected.length - 1; i >= 0; --i) {
     sourceListModel.removeElement(selected[i]);
 }
   sourceList.getSelectionModel().clearSelection();  }
 private void clearDestinationSelected() {
   Object selected[] = destList.getSelectedValues();
 for (int i = selected.length - 1; i >= 0; --i) {
     destListModel.removeElement(selected[i]);
 }
   destList.getSelectionModel().clearSelection();  }
 private void initScreen() {
   setBorder(BorderFactory.createEtchedBorder());
 setLayout(new GridBagLayout());
 sourceLabel = new JLabel(DEFAULT_SOURCE_CHOICE_LABEL);
 sourceListModel = new SortedListModel();
 sourceList = new JList(sourceListModel);
 add(sourceLabel, new GridBagConstraints(0, 0, 1, 1, 0, 0,GridBagConstraints.CENTER, GridBagConstraints.NONE,EMPTY_INSETS, 0, 0));
 add(new JScrollPane(sourceList), new GridBagConstraints(0, 1, 1, 5, .5,1, GridBagConstraints.CENTER, GridBagConstraints.BOTH,        EMPTY_INSETS, 0, 0));
 addButton = new JButton(ADD_BUTTON_LABEL);
 add(addButton, new GridBagConstraints(1, 2, 1, 2, 0,.25,GridBagConstraints.CENTER, GridBagConstraints.NONE,EMPTY_INSETS, 0, 0));
 addButton.addActionListener(new AddListener());
 removeButton = new JButton(REMOVE_BUTTON_LABEL);
 add(removeButton, new GridBagConstraints(1, 4, 1, 2, 0, .25,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(            0, 5, 0, 5), 0, 0));
 removeButton.addActionListener(new RemoveListener());
 
 
 //button to add to textfile
 addButton = new JButton(ADD_BUTTON_LABEL1);
 add(addButton, new GridBagConstraints(1, 6, 1, 2, 0,.25,GridBagConstraints.CENTER, GridBagConstraints.NONE,EMPTY_INSETS, 0, 0));
 addButton.addActionListener(new AddListener());
 
 
 destLabel = new JLabel(DEFAULT_DEST_CHOICE_LABEL);
 destListModel = new SortedListModel();
 destList = new JList(destListModel);
 add(destLabel, new GridBagConstraints(2, 0, 1, 1, 0, 0,GridBagConstraints.CENTER, GridBagConstraints.NONE,EMPTY_INSETS, 0, 0));
 add(new JScrollPane(destList), new GridBagConstraints(2, 1, 1, 5, .5,1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, EMPTY_INSETS, 0, 0)); }
 
 
 public static void main(String args[]) {
	 
   JFrame f = new JFrame("Dual List Box Tester");
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 DualListBox dual = new DualListBox();
 dual.addSourceElements(new String[] 
		 {"Drew Brees",
		 "Ryan Fitzpatrick",
		" Marcus Mariota",
		 "Matt Schaub",
		 "Drew Stanton",
		 "Eli Manning",
		 "Cam Newton",
		 "Tom Brady",
		 "Colin Kaepernick",
		 "Derek Carr",
		 "Andy Dalton",
		 "Geno Smith",
		 "Jay Cutler",
		 "Carson Palmer",
		 "Ben Roethlisberger",
		 "Brock Osweiler",
		 "Scott Tolzien",
		 "Chad Henne",
		 "Ryan Tannehill",
		 "Alex Smith",
		 "Aaron Rodgers",
		 "Andrew Luck",
		 "Trevor Siemian",
		 "Kirk Cousins",
		 "Jameis Winston",
		 "Matt Moore",
		 "A.J. McCarron",
		 "Mark Sanchez",
		 "Joe Flacco",
		 "Philip Rivers",
		 "Tom Savage",
		 "Russell Wilson",
		 "Mike Glennon",
		 "Matthew Stafford",
		 "Jared Goff",
		 "Jimmy Garoppolo",
		 "Tyrod Taylor",
		 "Chase Daniel",
		 "Landry Jones",
		 "Matt Ryan",
		 "Blake Bortles",
		 "Derek Anderson",
		 "Sam Bradford" });
 /*dual.addSourceElements(new String[] {
"Four", "Five", "Six" });
 dual.addSourceElements(new String[] {
"Seven", "Eight", "Nine" });
 dual.addSourceElements(new String[] {
"Ten", "Eleven", "Twelve" });
 dual .addSourceElements(new String[] {
"Thirteen", "Fourteen",            "Fifteen" });
 dual.addSourceElements(new String[] {
"Sixteen", "Seventeen", "Eighteen" });
 dual.addSourceElements(new String[] {
"Nineteen", "Twenty", "Thirty" });*/
 f.getContentPane().add(dual, BorderLayout.CENTER);
 f.setSize(500, 600);
 f.setVisible(true);  }
 private class AddListener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
     Object selected[] = sourceList.getSelectedValues();
   addDestinationElements(selected);
   clearSourceSelected();
 }
 }
 private class RemoveListener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
     Object selected[] = destList.getSelectedValues();
   addSourceElements(selected);
   clearDestinationSelected();
 }
 }}
class SortedListModel extends AbstractListModel {
 SortedSet model;  public SortedListModel() {
   model = new TreeSet();  }
 public int getSize() {
   return model.size();  }
 public Object getElementAt(int index) {
   return model.toArray()[index];  }
 public void add(Object element) {
   if (model.add(element)) {
     fireContentsChanged(this, 0, getSize());
 }
 }
 public void addAll(Object elements[]) {
   Collection c = Arrays.asList(elements);
 model.addAll(c);
 fireContentsChanged(this, 0, getSize());  }
 public void clear() {
   model.clear();
 fireContentsChanged(this, 0, getSize());  }
 public boolean contains(Object element) {
   return model.contains(element);  }
 public Object firstElement() {
   return model.first();  }
 public Iterator iterator() {
   return model.iterator();  }
 public Object lastElement() {
   return model.last();  }
 public boolean removeElement(Object element) {
   boolean removed = model.remove(element);
 if (removed) {
     fireContentsChanged(this, 0, getSize());
 }
   return removed;  }}



