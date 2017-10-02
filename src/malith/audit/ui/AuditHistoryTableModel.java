package malith.audit.ui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import malith.audit.core.AuditHistory;

public class AuditHistoryTableModel extends AbstractTableModel {

	public static final int OBJECT_COL = -1;
	public static final int  NO_COL= 0;
	private static final int ACTION_COL = 1;
	public static final int USER_COL = 2;
	public static final int AFFECTED_TO_COL = 3;

	private String[] columnNames = { "No", "Action", "User","Affected To", "Date" };
	
	private List<AuditHistory> auditHistoryList;

	public AuditHistoryTableModel(List<AuditHistory> theAuditHistoryList) {
		auditHistoryList = theAuditHistoryList;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return auditHistoryList.size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {

		AuditHistory tempAuditHistory = auditHistoryList.get(row);

		switch (col) {
		case NO_COL:			
			return tempAuditHistory.getAuditId();
		case ACTION_COL:
			return tempAuditHistory.getAction();
		case USER_COL:
			return tempAuditHistory.getUserId();
		case AFFECTED_TO_COL:
			return tempAuditHistory.getSecondPartyId();
		case OBJECT_COL:
			return tempAuditHistory;
		default:
			return tempAuditHistory.getUserId();
		}
	}

	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}

}
