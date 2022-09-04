package view;

import persistence.dto.AdminDTO;
import persistence.dto.SubjectNotOpenDTO;

import java.util.List;

public class SubjectNotOpenView {
    public void printSubjectNotOpenAll(List<SubjectNotOpenDTO> dtos){
        System.out.println("전체 교과목");
        for (SubjectNotOpenDTO dto : dtos) {
            dto.printInfo();
        }
    }

    public void printSubjectNotOpenGrade(List<SubjectNotOpenDTO> dtos){
        for (SubjectNotOpenDTO dto : dtos) {
            dto.printInfo();
        }
    }
}
