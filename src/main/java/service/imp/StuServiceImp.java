package service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.IStuMapper;
import model.Student;
import service.IStuService;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
public class StuServiceImp implements IStuService {
	@Autowired(required = true)
	private IStuMapper ism;

	@Transactional(readOnly = true)
	@Override
	public List<Student> findByActive(Student stu) throws Exception {

		return ism.selectByActive(stu);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Student> findAll() throws Exception {

		return ism.selectAll();
	}

	@Override
	public int keepStu(Student stu) throws Exception {

		return ism.saveStu(stu);
	}

	@Override
	public int modifyStuActive(Student stu) throws Exception {

		return ism.updateStuActive(stu);
	}

	@Override
	public int removeStu(Student stu) throws Exception {

		return ism.deleteStu(stu);
	}

	@Transactional(readOnly = true)
	@Override
	public Student findById(Student stu) throws Exception {

		return ism.selectById(stu);
	}

	@Override
	public Student findByName(Student stu) throws Exception {
		// TODO Auto-generated method stub
		return ism.selectByName(stu);
	}

}
