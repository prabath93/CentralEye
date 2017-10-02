
package chamin.data;



import chamin.data.Book;
import chamin.data.Club;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Malith
 */
public class BookTableModel extends AbstractTableModel {
        public static final int OBJECT_COL = -1;
	private static final int Book_ID = 0;
	private static final int Title = 1;
	private static final int Author_Name = 2;
	private static final int ISBN = 3;

	private String[] columnNames = {"Book Index", "Title", "Author Name", "ISBN"};
	private List<Book> list;

	public BookTableModel(List<Book> list) {
		this.list = list;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {

		Book tempBook = list.get(row);

		switch (col) {
		case Book_ID:
			return tempBook.getBooId();
		case Title:
			return tempBook.getTitle();
		case Author_Name:
			return tempBook.getAuthorName();
		case ISBN:
			return tempBook.getISBN();
                case OBJECT_COL:
			return tempBook;
		default:
			return tempBook.getTitle();
		}
	}

	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
}
