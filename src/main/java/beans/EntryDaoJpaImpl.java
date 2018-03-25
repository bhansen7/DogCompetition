package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

public class EntryDaoJpaImpl implements EntryDao {

	@Bean
	public EntryDao entryDaoJpa() {
		EntryDaoJpaImpl bean = new EntryDaoJpaImpl();
		return bean;
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public EntryService entryService() {
		EntryServiceImpl bean=new EntryServiceImpl();
		return bean;
	}
	
	public void insert(Entry entry) {
		// TODO Auto-generated method stub
		
	}

	public void update(Entry entry) {
		// TODO Auto-generated method stub
		
	}

	public void update(List<Entry> entries) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long entryId) {
		// TODO Auto-generated method stub
		
	}

	public Entry find(long entryId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Entry> find(List<Long> entryIds) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Entry> find(String dogName) {
		// TODO Auto-generated method stub
		return null;
	}

}
