package service;

import java.util.List;

import model.Student;

public interface IStuService {
	/**
	 * 按id查找Student对象
	 * 
	 * @param id学生id
	 * @return 从数据库中查到数据经过封装成一个Student对象
	 * @throws Exception
	 */
	Student findById(Student stu) throws Exception;

	/**
	 * 
	 * @param stu
	 *            使用mybatis的动态SQL查询 Student对象
	 * @return 从数据库中查到数据经过封装成Student对象进一步封装到List集合中
	 * @throws Exception
	 */
	List<Student> findByActive(Student stu) throws Exception;

	/**
	 * 查询数据库所有数据
	 * 
	 * @return 从数据库中查到数据经过封装成Student对象进一步封装到List集合中
	 * @throws Exception
	 */
	List<Student> findAll() throws Exception;

	/**
	 * 插入Student数据
	 * 
	 * @param stu
	 *            Student对象
	 * @return 判断数据是否插入成功（0:不成功;1:成功）
	 * @throws Exception
	 */
	int keepStu(Student stu) throws Exception;

	/**
	 * 更新Student数据使用mybatis的动态SQL
	 * 
	 * @param stu
	 * @return 判断数据是否更新成功（0:不成功;1:成功）
	 * @throws Exception
	 */
	int modifyStuActive(Student stu) throws Exception;

	/**
	 * 根据Student id 删除数据库的数据
	 * 
	 * @param id
	 *            Student 的id
	 * @return 判断数据是否删除成功（0:不成功;1:成功）
	 * @throws Exception
	 */
	int removeStu(Student stu) throws Exception;

	Student findByName(Student stu) throws Exception;

}
