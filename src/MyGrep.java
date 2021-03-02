import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-01-13
 * Time : 12:21
 */
public class MyGrep {
    // 至少有一个参数，匹配那个字符串
    // 如果只有一个参数，从标准输入中找匹配
    // 如果有两个参数，从第二个参数对应的路径内容中找匹配
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("必须带着参数");
            return;
        }
        String substring = args[0];
        InputStream is;
        if (args.length == 1) {
            System.out.println("MyGrep: 从标准输入读");
            is = System.in;
        } else {
            System.out.println("MyGrep: 从文件内容读");
            String path = args[1];
            is = new FileInputStream(path);        }
        Scanner scanner = new Scanner(is, "UTF-8");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains(substring)) {
                System.out.println(line);
            }
        }
    }
}

