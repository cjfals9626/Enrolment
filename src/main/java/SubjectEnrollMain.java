import persistence.MyBatisConnectionFactory;
import persistence.dao.SubjectEnrollDAO;
import persistence.dto.MySubjectEnrollDTO;
import persistence.dto.SubjectEnrollDTO;
import service.SubjectEnrollService;
import service.SubjectOpenService;
import view.SubjectEnrollView;

import java.util.List;

public class SubjectEnrollMain {
    public static void main(String[] args) {
        SubjectEnrollDAO subjectEnrollDAO = new SubjectEnrollDAO(MyBatisConnectionFactory.getSqlSessionFactory());
        SubjectEnrollService subjectEnrollService = new SubjectEnrollService(subjectEnrollDAO);
        SubjectEnrollView subjectEnrollView = new SubjectEnrollView();

//        subjectEnrollService.updateEnrollTime();

//        List<SubjectEnrollDTO> dto = subjectEnrollService.getSubjectEnroll();
//        subjectEnrollView.printEnrollSubject(dto);

//        subjectEnrollService.insertSubjectEnrollTakeClassState();

//        List<MySubjectEnrollDTO> mySubjectEnrollDTOS = subjectEnrollService.getMySubjectEnroll();
//        subjectEnrollView.printMySubjectEnroll(mySubjectEnrollDTOS);

//        subjectEnrollService.deleteSubjectEnroll();
    }
}
