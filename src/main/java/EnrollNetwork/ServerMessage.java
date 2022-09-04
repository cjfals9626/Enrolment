package EnrollNetwork;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerMessage {
    public String setDefaultDate(){
        java.util.Date now = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String nowDate = format.format(now);
        return nowDate;
    }

    public static final int PROTOCOL_LOGIN_REQUEST = 2000;
    final static String DEFAULT_SUBJECT_PLAN = "(null)";

    //main
    final static String CLIENT_WAITING = "클라이언트 접속 대기 중...";
    final static String CLIENT_CONNECT = "클라이언트 접속됨.";
    final static String CLIENT_EXIT = "연결종료 : ";

    //error
    final static String IOEXCEPTION = "IOException";
    final static String EXCEPTION = "Exception";

    //관리자 프로토콜
    final static int PROTOCOL_ADMIN_CRT_PRO_REQUEST_ID = 11011;
    final static int PROTOCOL_ADMIN_CRT_PRO_REQUEST_INFO = 11012;

    final static int PROTOCOL_ADMIN_CRT_STU_REQUEST_ID = 11021;
    final static int PROTOCOL_ADMIN_CRT_STU_REQUEST_INFO = 11022;

    final static int PROTOCOL_ADMIN_CRT_NOT_OPEN_SUBJECT_REQUEST_ID = 11031;
    final static int PROTOCOL_ADMIN_CRT_SUBJECT_REQUEST_INFO = 11032;

    final static int PROTOCOL_ADMIN_UPDT_NOT_OPEN_SUBJECT_REQUEST_ID = 11041;
    final static int PROTOCOL_ADMIN_UPDT_NOT_OPEN_SUBJECT_REQUEST_NAME = 11042;
    final static int PROTOCOL_ADMIN_UPDT_NOT_OPEN_SUBJECT_REQUEST_GRADE = 11043;

    final static int PROTOCOL_ADMIN_DEL_NOT_OPEN_SUBJECT_REQUEST_ID = 11050;

    final static int PROTOCOL_ADMIN_UPDT_SUBJECT_PLAN_REQUEST_ID = 11061;
    final static int PROTOCOL_ADMIN_UPDT_SUBJECT_PLAN_REQUEST_DATE = 11062;

    final static int PROTOCOL_ADMIN_UPDT_EROLL_DATE_PER_GRADE = 11071;

    final static int PROTOCOL_ADMIN_SELECT_PRO_REQUEST = 11080;

    final static int PROTOCOL_ADMIN_SELECT_STU_REQUEST = 11090;

    final static int PROTOCOL_ADMIN_SELECT_OPEN_SUBJECT_REQUEST = 11100;

    final static int PROTOCOL_ADMIN_CRT_OPEN_SUBJECT_REQUEST_ID = 11111;
    final static int PROTOCOL_ADMIN_CRT_OPEN_SUBJECT_REQUEST_INFO = 11112;

    final static int PROTOCOL_ADMIN_UDPT_OPEN_SUBJECT_REQUEST_ID = 11121;
    final static int PROTOCOL_ADMIN_UDPT_OPEN_SUBJECT_REQUEST_MAX_PEOPLE = 11122;
    final static int PROTOCOL_ADMIN_UDPT_OPEN_SUBJECT_REQUEST_CREDIT = 11123;
    final static int PROTOCOL_ADMIN_UDPT_OPEN_SUBJECT_REQUEST_DAY = 11124;
    final static int PROTOCOL_ADMIN_UDPT_OPEN_SUBJECT_REQUEST_TIME = 11125;
    final static int PROTOCOL_ADMIN_UDPT_OPEN_SUBJECT_REQUEST_CLASSROOM = 11126;

    final static int PROTOCOL_ADMIN_CLOSE_OPEN_SUBJECT_REQUEST = 11130;

    //교수 프로토콜
    final static int PROTOCOL_PRO_UPDT_INFO_REQUEST_PW = 21011;
    final static int PROTOCOL_PRO_UPDT_INFO_REQUEST_NAME = 21012;
    final static int PROTOCOL_PRO_UPDT_INFO_REQUEST_BIRTH = 21013;
    final static int PROTOCOL_PRO_UPDT_INFO_REQUEST_PHONENUMBER = 21014;
    final static int PROTOCOL_PRO_UPDT_INFO_REQUEST_MAJOR = 21015;

    final static int PROTOCOL_PRO_INSERT_SUBJECT_PLAN_REQUEST_ID = 21021;
    final static int PROTOCOL_PRO_INSERT_SUBJECT_PLAN_REQUEST_PLAN = 21022;

    final static int PROTOCOL_PRO_UPDT_SUBJECT_PLAN_REQUEST_ID = 21031;
    final static int PROTOCOL_PRO_UPDT_SUBJECT_PLAN_REQUEST_PLAN = 21032;

    final static int PROTOCOL_PRO_SELECT_SUBJECT_ALL_REQUEST = 21040;

    final static int PROTOCOL_PRO_SELECT_SUBJECT_PLAN_ALL_REQUEST = 21050;

    final static int PROTOCOL_PRO_SELECT_STUDENT_ALL_PER_SUBJECT_REQUEST = 21060;

    final static int PROTOCOL_PRO_SELECT_SUBJECT_TIME_TABLE_REQUEST = 21070;

    //학생 프로토콜
    final static int PROTOCOL_STU_UPDT_INFO_REQUEST_PW = 31011;
    final static int PROTOCOL_STU_UPDT_INFO_REQUEST_NAME = 31012;
    final static int PROTOCOL_STU_UPDT_INFO_REQUEST_BIRTH = 31013;
    final static int PROTOCOL_STU_UPDT_INFO_REQUEST_PHONENUMBER = 31014;
    final static int PROTOCOL_STU_UPDT_INFO_REQUEST_MAJOR = 31015;
    final static int PROTOCOL_STU_UPDT_INFO_REQUEST_GRADE = 31016;

    final static int PROTOCOL_STU_ENROLL_SUBJECT_REQUEST = 31021;

    final static int PROTOCOL_STU_CANCEL_ENROLL_SUBJECT_REQUEST = 31031;

    final static int PROTOCOL_STU_SELECT_OPEN_SUBJECT_ALL_REQUEST_GRADE = 31041;
    final static int PROTOCOL_STU_SELECT_OPEN_SUBJECT_ALL_REQUEST_PRO = 31042;
    final static int PROTOCOL_STU_SELECT_OPEN_SUBJECT_ALL_REQUEST_GRADE_PRO = 31043;
    final static int PROTOCOL_STU_SELECT_OPEN_SUBJECT_ALL_REQUEST = 31044;

    final static int PROTOCOL_STU_SELECT_SUBJECT_PLAN_REQUEST = 31050;

    final static int PROTOCOL_STU_SELECT_MY_TIME_TABLE_REQUEST = 31060;
}
