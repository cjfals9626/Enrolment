import persistence.MyBatisConnectionFactory;
import persistence.dao.SubjectNotOpenDAO;
import persistence.dao.SubjectOpenDAO;
import persistence.dto.SubjectOpenDTO;
import service.SubjectOpenService;
import view.SubjectOpenView;

import java.util.List;

public class CRUSubjectOpenMain {
    public static void main(String[] args) {
        SubjectOpenDAO subjectOpenDAO = new SubjectOpenDAO(MyBatisConnectionFactory.getSqlSessionFactory());
        SubjectNotOpenDAO subjectNotOpenDAO = new SubjectNotOpenDAO(MyBatisConnectionFactory.getSqlSessionFactory());
        SubjectOpenService subjectOpenService = new SubjectOpenService(subjectOpenDAO, subjectNotOpenDAO);
        SubjectOpenView subjectOpenView = new SubjectOpenView();
        List<SubjectOpenDTO> dtos;

//        dtos = subjectOpenService.getSubjectOpenAll();
//        subjectOpenView.printSubjectOpenAll(dtos);

//        dtos = subjectOpenService.getSubjectOpenGradeAll();
//        subjectOpenView.printSubjectOpenAll(dtos);

//        dtos = subjectOpenService.getSubjectOpenProfessorAll();
//        subjectOpenView.printSubjectOpenAll(dtos);

//        dtos = subjectOpenService.getSubjectOpenProfessorAndGradeAll();
//        subjectOpenView.printSubjectOpenAll(dtos);

//        subjectOpenService.openSubject();

//        subjectOpenService.updateSubjectOpen();

//        subjectOpenService.deleteSubjectOpen();

//        subjectOpenService.printPerProfessorClassStudent(1234);
        //7번 페이징

//        subjectOpenService.updateSubjectPlanSubjectOpen();

//        subjectOpenService.updateSubjectPlanSubjectOpen();
    }
}
