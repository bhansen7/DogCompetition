package beans;

public class EntryServiceImpl implements EntryService {
	
	private EntryDao entryDao;
	
	public EntryServiceImpl(EntryDao entryDao) {
		super();
		this.entryDao = entryDao;
	}
	
	public EntryServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public EntryDao getEntryDao() {
		return entryDao;
	}
	
	public void setEntryDao(EntryDao entryDao) {
		this.entryDao = entryDao;
	}
	
	public Entry getEntry(long entryId) {
		// TODO Auto-generated method stub

		return entryDao.find(entryId);
	}

	public void moveUpClass(long entryId) {
		Entry entry = entryDao.find(entryId);
		String newClass;
		String oldClass = entry.getCompetitionClass();
		if (oldClass.equalsIgnoreCase("novice")) {
			newClass = "Intermediate";
		} else if (oldClass.equalsIgnoreCase("intermediate")) {
			newClass = "Advanced";
		} else {
			newClass = oldClass;
		}
		entry.setCompetitionClass(newClass);
		entryDao.update(entry);
	}

}
