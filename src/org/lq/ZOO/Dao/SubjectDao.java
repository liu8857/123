/**
 * 
 */
package org.lq.ZOO.Dao;

import java.util.List;

import org.lq.ZOO.entity.Subject;

/**
 * @author ������ ����
 *@data 2019��7��2��
*@project_nameZOO
 */
public interface SubjectDao {

	List<Subject> findAll();
	Subject getSubjectName(int subjectId);
}


