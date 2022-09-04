import persistence.MyBatisConnectionFactory;
import persistence.dao.SubjectNotOpenDAO;
import persistence.dto.SubjectNotOpenDTO;
import service.SubjectNotOpenService;
import view.SubjectNotOpenView;

import java.util.List;

public class CRUSubjectNotOpenMain {
    public static void main(String[] args) {
        SubjectNotOpenDAO subjectNotOpenDAO = new SubjectNotOpenDAO(MyBatisConnectionFactory.getSqlSessionFactory());
        SubjectNotOpenService subjectNotOpenService = new SubjectNotOpenService(subjectNotOpenDAO);
        SubjectNotOpenView subjectNotOpenView = new SubjectNotOpenView();

//        subjectNotOpenService.deleteSubjectNotOpen();
//        subjectNotOpenView.printSubjectNotOpenAll(subjectNotOpenService.getSubjectNotOpenAll());

//        subjectNotOpenView.printSubjectNotOpenGrade(subjectNotOpenService.getSubjectNotOpenGrade());

//        subjectNotOpenService.insertSubjectNotOpen();

//        subjectNotOpenService.updateSubjectNotOpen();
    }
}
