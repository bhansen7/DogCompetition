package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntryDaoInMemoryImpl implements EntryDao {
	
	
	private Map<Long, Entry> entriesMap = new HashMap<Long,Entry>();
	
	{
		Entry entry1 = new Entry(1L,"Draft","Novice","Tug","Barb");
		Entry entry2 = new Entry(2L,"Rally","Intermediate","Basil","Jeff");
		
		entriesMap.put(entry1.getEntryId(), entry1);
		entriesMap.put(entry2.getEntryId(), entry2);
	}
	
	public void insert(Entry entry) {
		// TODO Auto-generated method stub
		entriesMap.put(entry.getEntryId(), entry);
		
	}

	public void update(Entry entry) {
		// TODO Auto-generated method stub
		entriesMap.put(entry.getEntryId(), entry);
		
	}

	public void update(List<Entry> entries) {
		// TODO Auto-generated method stub
		for(Entry entry: entries) {
			update(entry);
		}
	}

	public void delete(long entryId) {
		// TODO Auto-generated method stub
		entriesMap.remove(entryId);
		
	}

	public Entry find(long entryId) {
		// TODO Auto-generated method stub
		return entriesMap.get(entryId);
	}

	public List<Entry> find(List<Long> entryIds) {
		// TODO Auto-generated method stub
		List<Entry>entries=new ArrayList<Entry>();
		for(Long entryId:entryIds) {
			entries.add(entriesMap.get(entryId));
		}
		return entries;
	}

	public List<Entry> find(String dogName) {
		// TODO Auto-generated method stub
		List<Entry>entries=new ArrayList<Entry>();
		for(Entry entry:entriesMap.values()) {
			if(dogName.equals(entry.getDogName())) {
				entries.add(entry);
			}
		}
		return entries;
	}
	
}
