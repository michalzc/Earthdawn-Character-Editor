package de.earthdawn.ui2;

import javax.swing.JPanel;

import de.earthdawn.CharacterContainer;
import de.earthdawn.config.ApplicationProperties;
import de.earthdawn.data.CAPABILITYType;
import de.earthdawn.data.RANKType;
import de.earthdawn.data.SKILLType;

import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.xml.bind.JAXBElement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JPopupMenu;
import java.awt.Dimension;

public class EDSkills extends JPanel {

	private CharacterContainer character;
	private JToolBar toolBar;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnAddSkill;
	private JButton btnRemoveSkill;
	/**
	 * Create the panel.
	 */
	public EDSkills() {
		setLayout(new BorderLayout(0, 0));
		
		toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		btnAddSkill = new JButton("Add Skill");
		btnAddSkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnAddSkill_actionPerformed(arg0);
			}
		});
		toolBar.add(btnAddSkill);
		
		btnRemoveSkill = new JButton("Remove Skill");
		btnRemoveSkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnRemoveSkill_actionPerformed(arg0);
			}
		});
		toolBar.add(btnRemoveSkill);
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new SkillsTableModel(character));
		scrollPane.setViewportView(table);
	}
	

	

	public void setCharacter(final CharacterContainer character) {
		this.character = character;
		((SkillsTableModel)table.getModel()).setCharacter(character);
	}

	public CharacterContainer getCharacter() {
		return character;
	}	
	
	protected void do_btnAddSkill_actionPerformed(ActionEvent arg0) {
		EDSkillSelectDialog dialog = new EDSkillSelectDialog();
		dialog.setVisible(true);
		HashMap<String, CAPABILITYType> selected = dialog.getSelectedSkillMap();
		for(Object key : selected.keySet()){
			CAPABILITYType cap = selected.get(key);
			SKILLType skill = new SKILLType();
			skill.setAction(cap.getAction());
			skill.setAttribute(cap.getAttribute());
			skill.setDefault(cap.getDefault());
			skill.setStrain(cap.getStrain());
			skill.setName(cap.getName());
			RANKType rank = new RANKType();
			rank.setRank(1);
			skill.setRANK(rank);
			character.getSkills().add(skill);
			character.refesh();
		}
		
	}
	
	protected void do_btnRemoveSkill_actionPerformed(ActionEvent arg0) {
		ArrayList<SKILLType> skillsForRemoval = new ArrayList<SKILLType> ();
		for(int row :table.getSelectedRows()){
			SKILLType skill = character.getSkills().get(row);
			skillsForRemoval.add(skill);
		}
		character.getSkills().removeAll(skillsForRemoval);
		character.refesh();
	}
}

class SkillsTableModel extends AbstractTableModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CharacterContainer character;
    private String[] columnNames = {"Name", "Limitation",  "Attribute", "Rank", "Strain", "Action", "Step", "Dice"};


    
    

	public SkillsTableModel(CharacterContainer character) {
		super();
		this.character = character;
	}    
  
	public void setCharacter(CharacterContainer character) {
		this.character = character;
		fireTableStructureChanged();
	}

	public CharacterContainer getCharacter() {
		return character;
	}	

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
    	if(character != null){
    		return character.getSkills().size();
    	}
    	else{
    		return 0;
    	}
    		
        
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        // {"Name", "Limitation",  "Attribute", "Rank", "Strain", "Action", "Step" "Dice"};
        if(character != null){ 
	    	switch (col) {
	    		case 0: return character.getSkills().get(row).getName();
	    		case 1: return character.getSkills().get(row).getLimitation();
	    		case 2: return character.getSkills().get(row).getAttribute();
	    		case 3: return character.getSkills().get(row).getRANK().getRank();
	    		case 4: return character.getSkills().get(row).getStrain();
	    		case 5: return character.getSkills().get(row).getAction().value();
	    		case 6: return character.getSkills().get(row).getRANK().getStep();
	    		case 7: return character.getSkills().get(row).getRANK().getDice().value();
	    		default : return new String("Error not defined");
	    	}
        }
	    else{
	    	return 0;
	    }
    }

    /*
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  If we didn't implement this method,
     * then the last column would contain text ("true"/"false"),
     * rather than a check box.
     */
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
    	if (col == 3 ){
    		return true;
    	}
    	return false;
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    public void setValueAt(Object value, int row, int col) {   	
    	if(col == 3){
    		character.getSkills().get(row).getRANK().setRank((Integer) value);
    	}
    	character.refesh();	
    	fireTableCellUpdated(row, 6);
    	fireTableCellUpdated(row, 7);
        fireTableCellUpdated(row, col);
    }

}
