package wfigo.spring.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TableauService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Transactional
	public List<Category> getCategoryList() {
		
		RowMapper<Category> mapper = new BeanPropertyRowMapper<>(Category.class);
		String sql = "SELECT c.category_id, c.category_name, c.category_class_name " +
                "FROM category c;";
		
		List<Category> rs = jdbcTemplate.query(sql, mapper);
		
		return rs;
	}
}
