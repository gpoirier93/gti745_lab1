import java.awt.Component;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListWidget implements SelectedBoxListener {
	private JScrollPane listScroller;
	private JList list;
	private DefaultListModel<ColoredBox> listModel;

	//////////////////
	// CONSTRUCTORS //
	//////////////////
	
	public ListWidget () {
		listModel = new DefaultListModel();
		
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setVisibleRowCount(-1);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		listScroller = new JScrollPane(list);
		listScroller.setAlignmentX( Component.LEFT_ALIGNMENT );
	}
	
	public void addBox(ColoredBox box) {
		listModel.addElement(box);
	}
	
	@Override
	public void valueChanged(int index) {
		if (index >= 0) {
			list.setSelectedIndex(index);
		}
	}
	
	public void removeBox(int index) {
		if(index >= 0) {
			listModel.remove(index);
		}
	}
	
	public void removeAll() {
		listModel.clear();
	}

	/////////////////////////
	// GETTERS AND SETTERS //
	/////////////////////////
	
	public JScrollPane getListScroller() {
		return listScroller;
	}
	
	public JList getList() {
		return list;
	}
	
}
