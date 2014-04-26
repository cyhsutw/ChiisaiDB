package nihongo.chiisaidb;

import nihongo.chiisaidb.metadata.MetadataMgr;
import nihongo.chiisaidb.planner.Planner;
import nihongo.chiisaidb.storage.FileMgr;

public class Chiisai {
	private static Planner planner;
	private static FileMgr fMgr;
	private static MetadataMgr mdMgr;

	public Chiisai() {

	}

	public static void init() throws Exception{
		planner = new Planner();
		fMgr = new FileMgr();
		mdMgr = new MetadataMgr();
	}
	
	public static Planner planner() {
		return planner;
	}

	public static MetadataMgr mdMgr() {
		return mdMgr;
	}

	public static FileMgr fMgr() {
		return fMgr;
	}

	public void showAll() throws Exception {
		planner.showAll();
	}

}
