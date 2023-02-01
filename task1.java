import java.util.Map;
public class task1 {
public static void main(String[] args) {
StringBuilder whereClause = new StringBuilder();
Map<String, String> conditions = Map.of(
    "name", "Ivanov",
    "country", "Russia",
    "city", "Moscow",
    "age", "null"
);
int counter = 0;
for (Map.Entry<String, String> entry : conditions.entrySet()) {
    if (counter > 0) {
        whereClause.append(" AND ");
    }
    whereClause.append(entry.getKey())
               .append(" = ")
               .append("'")
               .append(entry.getValue())
               .append("'");
    counter++;
}

String sqlQuery = "SELECT * FROM students WHERE " + whereClause.toString();
}
}