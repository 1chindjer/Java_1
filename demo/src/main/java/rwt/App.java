package rwt;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class App { 
// {
//     public static void main(String[] args) {
//         java.util.Scanner scanner = new java.util.Scanner(System.in);
//         System.out.println("Введите JSON-строку:");
//         String json = scanner.nextLine();

//         StringBuilder sql = new StringBuilder("select * from students where ");

//         String[] pairs = json.replace("{", "").replace("}", "").split(",");
//         for (String pair : pairs) {
//             String[] keyValue = pair.split(":");
//             String key = keyValue[0].trim().replace("\"", "");
//             String value = keyValue[1].trim().replace("\"", "");
//             if (!value.equals("null")) {
//                 sql.append(key).append(" = '").append(value).append("' and ");
//             }
//         }

//         sql.delete(sql.length() - 5, sql.length());  // Удаляем последний " and "

//         System.out.println(sql.toString());
//     }
// }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2, 6, 10};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("log.txt"));
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                writer.write("Итерация " + (i + 1) + ": " + Arrays.toString(array) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
