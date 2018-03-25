package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public EntryDao entryDao() {
		EntryDaoInMemoryImpl bean = new EntryDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public EntryService entryService() {
		EntryServiceImpl bean = new EntryServiceImpl(entryDao());
		//bean.setEntryDao(entryDao());
		return bean;
	}
	
}
