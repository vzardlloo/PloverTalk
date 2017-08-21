package cn.plover.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.plover.utils.JDBCUtils;
import cn.plover.vo.User;

public class UserDaoImple implements UserDao {

	public User login(User user) {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from t_user where username = ? and password = ?";
		User existUser;
		try {
			existUser = queryRunner.query(sql, new BeanHandler<User>(User.class), user.getUsername(),user.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Êý¾Ý¿â´íÎó!");
		}
		return existUser;
	}

}
