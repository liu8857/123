/**
 * 
 */
package org.lq.ZOO.service;

import java.util.List;

import org.lq.ZOO.entity.Subject;

/**
 * @author ������ ����
 *@data 2019��7��2��
*@project_nameZOO
 */
public interface SubjectService {

	List<Subject> findAll();
	Subject getSubjectName(int subjectId);
}
