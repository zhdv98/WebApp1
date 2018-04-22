package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Lessons;


public class DBUtils {


    public static List<Lessons> queryLessons (Connection conn) throws SQLException {
        String sql = "Select * from Lessons ";

        PreparedStatement pstm = conn.prepareStatement(sql);

        ResultSet rs = pstm.executeQuery();
        List<Lessons> list = new ArrayList<Lessons>();
        while (rs.next()) {
            int num = rs.getInt("num");
            String p_11 = rs.getString("p_11");
            String p_12 = rs.getString("p_12");
            String p_13 = rs.getString("p_13");
            String p_14 = rs.getString("p_14");
            String r_11 = rs.getString("r_11");
            String r_12 = rs.getString("r_12");
            String k_11 = rs.getString("k_11");
            String k_12 = rs.getString("k_12");
            String k_13 = rs.getString("k_13");
            String e_11 = rs.getString("e_11");
            String f_11 = rs.getString("f_11");
            String d_11 = rs.getString("d_11");
            String a_11 = rs.getString("a_11");
            String o_11 = rs.getString("o_11");
            String ar_11 = rs.getString("ar_11");
            Lessons lessons = new Lessons();
            lessons.setNum(num);
            lessons.setP_11(p_11);
            lessons.setP_12(p_12);
            lessons.setP_13(p_13);
            lessons.setP_14(p_14);
            lessons.setR_11(r_11);
            lessons.setR_12(r_12);
            lessons.setK_11(k_11);
            lessons.setK_12(k_12);
            lessons.setK_13(k_13);
            lessons.setE_11(e_11);
            lessons.setF_11(f_11);
            lessons.setD_11(d_11);
            lessons.setA_11(a_11);
            lessons.setO_11(o_11);
            lessons.setAr_11(ar_11);

            list.equals(lessons);
            list.add(lessons);
        }
        return list;
    }

    public static Lessons findLessons(Connection conn, int num) throws SQLException {
        String sql = "Select * from Lessons where num=?";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, String.valueOf(num));

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            String p_11 = rs.getString("p_11");
            String p_12 = rs.getString("p_12");
            String p_13 = rs.getString("p_13");
            String p_14 = rs.getString("p_14");
            String r_11 = rs.getString("r_11");
            String r_12 = rs.getString("r_12");
            String k_11 = rs.getString("k_11");
            String k_12 = rs.getString("k_12");
            String k_13 = rs.getString("k_13");
            String e_11 = rs.getString("e_11");
            String f_11 = rs.getString("f_11");
            String d_11 = rs.getString("d_11");
            String a_11 = rs.getString("a_11");
            String o_11 = rs.getString("o_11");
            String ar_11 = rs.getString("ar_11");
            Lessons lessons = new Lessons(num,  p_11,  p_12,  p_13,  p_14,  r_11,  r_12,  k_11,  k_12,  k_13,
                    e_11,  f_11,  d_11,  a_11,  o_11,  ar_11);
            return lessons;
        }
        return null;
    }

    public static void updateLessons(Connection conn, Lessons lessons) throws SQLException {
        String sql = "Update Lessons set P_11 =?, P_12=?, P_13=?, P_14=?, R_11=?, R_12=?, K_11=?, K_12=?, K_13=?, E_11=?, F_11=?, D_11=?, A_11=?, O_11=?, AR_11=? where num=? ";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, lessons.getP_11());
        pstm.setString(2, lessons.getP_12());
        pstm.setString(3, lessons.getP_13());
        pstm.setString(4, lessons.getP_14());
        pstm.setString(5, lessons.getR_11());
        pstm.setString(6, lessons.getR_12());
        pstm.setString(7, lessons.getK_11());
        pstm.setString(8, lessons.getK_12());
        pstm.setString(9, lessons.getK_13());
        pstm.setString(10, lessons.getE_11());
        pstm.setString(11, lessons.getF_11());
        pstm.setString(12, lessons.getD_11());
        pstm.setString(13, lessons.getA_11());
        pstm.setString(14, lessons.getO_11());
        pstm.setString(15, lessons.getAr_11());
        pstm.setInt(16, lessons.getNum());
        pstm.executeUpdate();
        pstm.close();
    }

    public static void insertLessons(Connection conn, Lessons lessons) throws SQLException {
        String sql = "Insert into Lessons (num, P_11 ,P_12, P_13, P_14, R_11, R_12, K_11, K_12, K_13, E_11, F_11, D_11, A_11, O_11, AR_11 ) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, lessons.getNum());
        pstm.setString(2, lessons.getP_11());
        pstm.setString(3, lessons.getP_12());
        pstm.setString(4, lessons.getP_13());
        pstm.setString(5, lessons.getP_14());
        pstm.setString(6, lessons.getR_11());
        pstm.setString(7, lessons.getR_12());
        pstm.setString(8, lessons.getK_11());
        pstm.setString(9, lessons.getK_12());
        pstm.setString(10, lessons.getK_13());
        pstm.setString(11, lessons.getE_11());
        pstm.setString(12, lessons.getF_11());
        pstm.setString(13, lessons.getD_11());
        pstm.setString(14, lessons.getA_11());
        pstm.setString(15, lessons.getO_11());
        pstm.setString(16, lessons.getAr_11());

        pstm.equals(lessons);
        pstm.executeUpdate();
        pstm.close();
    }

    public static void deleteLessons(Connection conn, String num) throws SQLException {
        String sql = "Delete From Lessons where num= ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, num);

        pstm.executeUpdate();
        pstm.close();
    }

}