package Behavior.Template;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 10:32
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("===============导出csv文件==============");
        FileExport csv = new CSVFileExport();
        csv.export();

        System.out.println("===============导出重要文件==============");
        FileExport importFile = new ImportFileExport();
        importFile.export();
    }
}
