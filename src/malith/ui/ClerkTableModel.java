
package malith.ui;


import java.util.List;
import javax.swing.table.AbstractTableModel;
import malith.login.core.Clerk;


/**
 *
 * @author Malith
 */
public class ClerkTableModel extends AbstractTableModel {
         public static final int OBJECT_COL = -1;
	private static final int NIC = 0;
	private static final int FIRST_NAME = 1;
	private static final int LAST_NAME = 2;
	private static final int EMAIL = 3;

	private String[] columnNames = { "NIC", "First Name", "Last Name","Email" };// this should come from user input..... user can customize what fields to show
	private List<Clerk> clerk;

	public ClerkTableModel(List<Clerk> clerk) {
		this.clerk = clerk;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return clerk.size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {

		Clerk tempClerk = clerk.get(row);

		switch (col) {
		case NIC:
			return tempClerk.getId();
		case FIRST_NAME:
			return tempClerk.getFirstName();
		case LAST_NAME:
			return tempClerk.getLastName();
		case EMAIL:
			return tempClerk.getEmail();
                case OBJECT_COL:
			return tempClerk;
		default:
			return tempClerk.getFirstName();
		}
	}

	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
}
