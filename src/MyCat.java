import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-01-13
 * Time : 12:15
 */
public class MyCat {
    public static void main (String[] args) throws FileNotFoundException {
        // 1. 参数中有文件路径，把路径对应文件的内容显示到标准输出上
        // 2. 参数中没有文件路径，直接从标准输入上读取文件，显示到标准输出上
        InputStream is;
        if(args.length > 0){
            //有参数
            System.out.println("MyCat:从文件内容读");
            String path = args[0];
            is = new FileInputStream(path);
        }else {
            //没有参数
           is = System.in;
        }
        Scanner sc = new Scanner(is,"UTF-8");
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        //应该要关闭所有的资源
    }
}
