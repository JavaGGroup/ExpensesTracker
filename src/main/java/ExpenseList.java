//poczatkowa wersje tej klasy bo jeszcze do konca nie wiem jak to zrobic :(

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class ExpenseList {

    public int getdata(Date startDate,Date endDate) {
        PreparedStatement ps; //umożliwia wykonywanie parametryzowanych operacji na bazie danych
        Connection conn = null; //reprezentuje połączenie z bazą danych
        int id = 0;

        try {
            ps = conn.prepareStatement("SELECT * FROM project.order WHERE PO_Date >="+startDate+" AND PO_Date <= "+endDate+"");
            System.out.println("value of ps "+ps);
            ResultSet rs = ps.executeQuery(); //reprezentuje tabelę z pobranymi danymi z bazy danych
            while (rs.next()) {
                System.out.println("value of while loop "+rs.next());
                ArrayList<String> arrlist = new ArrayList<String>();
                Iterator<String> itr = arrlist.iterator(); // służy do zapętlenia ArrayList
                System.out.println(rs.getInt(1));
                // reszta jak juz powstanie baza danych

                while (itr.hasNext()) {
                    System.out.println(itr.next());
            }
            rs.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return id;
    }

}
