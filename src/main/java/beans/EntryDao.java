package beans;

import java.util.List;

public interface EntryDao {
	 
	public void insert(Entry entry);
	public void update(Entry entry);
	public void update(List<Entry> entries);
	public void delete(long entryId);
	 
	public Entry find(long entryId);
	public List<Entry> find(List<Long>entryIds);
	public List<Entry> find(String dogName);
}
