package persistence.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.dto.PerProfessorClassDTO;
import persistence.dto.PerProfessorClassStudentDTO;
import persistence.dto.SubjectOpenDTO;
import persistence.mapper.SubjectOpenMapper;

import java.sql.Date;
import java.util.List;

public class SubjectOpenDAO {
    private SqlSessionFactory sqlSessionFactory = null;

    public SubjectOpenDAO(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<SubjectOpenDTO> getSubjectOpenAll(){
        List<SubjectOpenDTO> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            list = mapper.getSubjectOpenAll();
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
        return list;
    }

    public List<SubjectOpenDTO> getSubjectGradeOpenAll(int possible_grade){
        List<SubjectOpenDTO> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            list = mapper.getSubjectOpenGradeAll(possible_grade);
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
        return list;
    }

    public List<SubjectOpenDTO> getSubjectOpenProfessorAll(int professor_id){
        List<SubjectOpenDTO> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            list = mapper.getSubjectOpenProfessorAll(professor_id);
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
        return list;
    }

    public List<SubjectOpenDTO> getSubjectOpenProfessorAndGradeAll(int professor_user_id, int possible_grade){
        List<SubjectOpenDTO> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            list = mapper.getSubjectOpenProfessorAndGradeAll(professor_user_id, possible_grade);
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
        return list;
    }

    public void openSubject(SubjectOpenDTO subjectOpenDTO){
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            mapper.openSubject(subjectOpenDTO.getSubject_id(), subjectOpenDTO.getMax_people(), subjectOpenDTO.getSubject_plan(), subjectOpenDTO.getPlan_modify_date(), subjectOpenDTO.getCredit(), subjectOpenDTO.getDay(), subjectOpenDTO.getTime(), subjectOpenDTO.getClassroom(), subjectOpenDTO.getProfessor_user_id());
            session.commit();
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
    }

    public void updateSubjectOpen(int subject_id, String subject_name, int max_people, int possible_grade, int credit, String day, String time, String classroom){
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            mapper.updateSubjectOpen(subject_id, subject_name, max_people, possible_grade, credit, day, time, classroom);
            session.commit();
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
    }

    public void updateSubjectPlanModifySubjectOpen(int subject_id, Date plan_modify_date){
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            mapper.updateSubjectPlanModifySubjectOpen(subject_id, plan_modify_date);
            session.commit();
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
    }

    public void updateSubjectPlanSubjectOpen(int subject_id, String subject_plan){
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            mapper.updateSubjectPlanSubjectOpen(subject_id, subject_plan);
            session.commit();
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
    }

    public void deleteSubjectOpen(int subject_id){
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            mapper.deleteSubjectOpen(subject_id);
            session.commit();
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
    }

    public List<PerProfessorClassDTO> getPerProfessorClass(int subject_id){
        List<PerProfessorClassDTO> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            list = mapper.getPerProfessorClass(subject_id);
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
        return list;
    }

    public List<PerProfessorClassStudentDTO> getPerProfessorClassStudent(int subject_id){
        List<PerProfessorClassStudentDTO> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            list = mapper.getPerProfessorClassStudent(subject_id);
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
        return list;
    }

    public int getPerProfessorClassStudentCount(int subject_id){
        int result = 0;
        SqlSession session = sqlSessionFactory.openSession();
        SubjectOpenMapper mapper = session.getMapper(SubjectOpenMapper.class);
        try{
            result = mapper.getPerProfessorClassStudentCount(subject_id);
        }catch ( Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        finally {
            session.close();
        }
        return result;
    }
}
