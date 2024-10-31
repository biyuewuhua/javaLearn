import java.util.StringJoiner;

public class PracticeStringJoiner {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }

    static String buildSelectSql(String table, String[] fields) {
        // TODO:
    	var select = new StringJoiner(", ", "SELECT "," FROM "+table);
    	for (String field : fields) {
    		select.add(field);
    	}
        return select.toString();
    }
}