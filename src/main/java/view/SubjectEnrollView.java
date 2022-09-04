package view;

import persistence.dto.MySubjectEnrollDTO;
import persistence.dto.SubjectEnrollDTO;

import java.text.SimpleDateFormat;
import java.util.List;

public class SubjectEnrollView {
    public void printEnrollSubject(List<SubjectEnrollDTO> subjectEnrollDTOS){
        java.util.Date now = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        now = java.sql.Date.valueOf(format.format(now));
        for(int i = 0; i < subjectEnrollDTOS.size(); i++){
            System.out.print(subjectEnrollDTOS.get(i).getSubject_name() + "과목 ");
            if(!(subjectEnrollDTOS.get(i).getEnroll_time_start().compareTo(now) <= 0 && subjectEnrollDTOS.get(i).getEnroll_time_end().compareTo(now) >= 0))
                System.out.println("수강신청 불가능");
            else
                System.out.println("수강신청 가능");
        }
    }

    public void printMySubjectEnroll(List<MySubjectEnrollDTO> subjectEnrollDTOS){
        for(MySubjectEnrollDTO dto : subjectEnrollDTOS){
            System.out.println(dto.toString());
        }
    }
}
