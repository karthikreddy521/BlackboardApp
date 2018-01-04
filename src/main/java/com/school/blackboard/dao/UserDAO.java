package com.school.blackboard.dao;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.school.blackboard.model.User;

@Repository
//@Component
public class UserDAO{
//
//	
//	@Autowired
//	private DataSource dataSource;
//	@javax.annotation.PostConstruct
//	private void initialize() {
//		setDataSource(dataSource);
//	}
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class UserRowMapper implements RowMapper<User>{
		
		@Override
		public User mapRow(ResultSet rs,int rowNum) throws SQLException {
			User user = new User();
			user.setUserId(rs.getInt("UserID"));
			user.setFirstName(rs.getString("FirstName"));
			user.setMiddleName(rs.getString("MiddleName"));
			user.setLastName(rs.getString("LastName"));
			user.setDateOfBirth(rs.getDate("DateOfBirth"));			
			user.setEmailId(rs.getString("EmailID"));
			user.setPhoneNumber(rs.getString("PhoneNumber"));
			user.setAddress(rs.getString("Address"));
			user.setStatus(rs.getInt("Status")==1?true:false);
  			user.setRoleId(rs.getInt("RoleID")); 
			return user;
		}
	}
	
	public List<User> findAllUsers() {
		return jdbcTemplate.query("select * from User", new UserRowMapper());
	}
	
	public User findUserById(int id) {
		return jdbcTemplate.queryForObject("select * from User where UserID=?",new Object[] {id}, new UserRowMapper());
	}
	
	public void updateUserById(User user) {
		jdbcTemplate.update("update User set FirstName = ?,LastName =?, MiddleName=?,"
							+ "DateOfBirth =?,EmailID=?,PhoneNumber=?,"
							+ "Address=?,Status=?  where UserID=?",
								  new Object[] {user.getFirstName(),user.getLastName(),user.getMiddleName(),
							      user.getDateOfBirth(),user.getEmailId(),
							      user.getPhoneNumber(),user.getAddress(),
							      (user.isStatus()?1:0),user.getUserId()});
	}
	public void deleteUserById(int id) {
		jdbcTemplate.update("delete from User where UserID=?", new Object[] {id});
	 
	}
	
	public void insertUser(User user) {
		jdbcTemplate.update("insert into User(FirstName,LastName, MiddleName,DateOfBirth,"
							+ "EmailID,PhoneNumber,Address,Status,roleId) VALUES (?,?,?,?,?,?,?,?,?)",
							new Object[] {user.getFirstName(),user.getLastName(),user.getMiddleName(),
						    user.getDateOfBirth(),user.getEmailId(),
						    user.getPhoneNumber(),user.getAddress(),
						    (user.isStatus()?1:0),user.getRoleId()});
	}
}
