import persistence.MyBatisConnectionFactory;
import persistence.dao.*;
import persistence.dto.*;
import service.AdminService;
import service.ProfessorService;
import service.StudentService;
import view.UserView;

import java.util.List;


public class CRUUserMain {
    public static void main(String[] args) {
        AdminDAO adminDAO = new AdminDAO();
        ProfessorDAO professorDAO = new ProfessorDAO();
        StudentDAO studentDAO = new StudentDAO();

        AdminService adminService = new AdminService(adminDAO);
        ProfessorService professorService = new ProfessorService(professorDAO);
        StudentService studentService = new StudentService(studentDAO);

        UserView userView = new UserView();
//        System.out.println("select Admin");
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        List<AdminDTO> adminAll = adminService.findAdminAll();
//        userView.printAdminAll(adminAll);
//        System.out.println("select Professor");
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        List<ProfessorDTO> professorAll = professorService.findProfessorAll();
//        userView.printProfessorAll(professorAll);
//        System.out.println("select Student");
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        List<StudentDTO> studentAll = studentService.findStudentAll();
//        userView.printStudentAll(studentAll);
//        System.out.println();
//
//        System.out.println("insert");
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        adminService.insertAdmin();
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        professorService.insertProfessor();
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        studentService.insertStudent();
//        System.out.println();
//
//        System.out.println("update");
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        professorService.updateProfessor();
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        studentService.updateStudent();

    }
}
