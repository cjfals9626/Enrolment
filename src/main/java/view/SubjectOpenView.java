package view;

import persistence.dto.AdminDTO;
import persistence.dto.SubjectNotOpenDTO;
import persistence.dto.SubjectOpenDTO;

import java.util.List;

public class SubjectOpenView {
    public void printSubjectOpenAll(List<SubjectOpenDTO> dtos) {
        for (SubjectOpenDTO dto : dtos) {
            dto.printInfo();
        }
    }
}