package nihongo.chiisaidb.planner.data;

import java.util.ArrayList;
import java.util.List;

import nihongo.chiisaidb.predicate.Predicate;

public class QueryData {
	// select
	private boolean isAllField;
	private List<String> fields;
	// from
	private String table1;
	private String table2;
	// where
	private Predicate pred;

	public QueryData(boolean isAllField, Predicate pred) {
		fields = new ArrayList<String>();
		this.pred = pred;
	}

	public void addField(String fname) {
		if (isAllField)
			throw new UnsupportedOperationException(
					"haved been chosen all field.");
		fields.add(fname);
	}

	public void addField(List<String> fnames) {
		fields.addAll(fnames);
	}

	public void setTable(String tblName) {
		this.table1 = tblName;
		this.table2 = "";
	}

	public void setTable(String tblName1, String tblName2) {
		this.table1 = tblName1;
		this.table2 = tblName2;
	}

	public boolean isAllField() {
		return isAllField;
	}

	public List<String> fields() {
		return fields;
	}

	public String getTable1() {
		return table1;
	}

	public String getTable2() {
		return table2;
	}

	public Predicate pred() {
		return pred;
	}

}