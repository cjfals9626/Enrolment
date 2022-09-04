package persistence.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;

public class SubjectSql {
    public String selectProfessor(int professor_id){
        SQL sql = new SQL(){{
            SELECT("s.subject_id", "subject_name", "possible_grade", "max_people");
            SELECT("number_people", "subject_plan", "plan_modify_date", "credit", "day", "time", "classroom", "professor_user_id");
            FROM("subject s", "subject_open so","subject_time st","per_professor_class ppc");
            WHERE("s.subject_id = so.subject_id");
            WHERE("so.subject_id = st.subjectOpen_subject_id");
            WHERE("so.subject_id = ppc.subject_id");
            WHERE("professor_id = #{professor_id}");
        }};
        return sql.toString();
    }
}
