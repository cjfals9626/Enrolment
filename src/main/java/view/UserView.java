package view;

import persistence.dto.AdminDTO;
import persistence.dto.ProfessorDTO;
import persistence.dto.StudentDTO;
import persistence.dto.UserDTO;

import java.util.List;

public class UserView {
    public void printAll(List<AdminDTO> dtos){
        System.out.println("사용자");
        for (AdminDTO dto : dtos) {
            dto.printInfo();
        }
    }

    public void printAdminAll(List<AdminDTO> dtos) {
        System.out.println("관리자");
        System.out.println(String.format("|%-7s|%-3s|%-8s|%-11s|","학번","이름","생년월일","전화번호"));
        for (AdminDTO dto : dtos) {
            dto.printInfo();
        }
    }

    public void printStudentAll(List<StudentDTO> dtos) {
        System.out.println("학생");
        System.out.println(String.format("|%-7s|%-3s|%-8s|%-11s|%-3s|%-3s|","학번","이름","생년월일","전화번호","학과","학년"));
        for (StudentDTO dto : dtos) {
            dto.printInfo();
        }
    }

    public void printProfessorAll(List<ProfessorDTO> dtos) {
        System.out.println("교수");
        System.out.println(String.format("|%-7s|%-3s|%-8s|%-11s|%-3s|","학번","이름","생년월일","전화번호","학과"));

        for (ProfessorDTO dto : dtos) {
            dto.printInfo();
        }
    }
}