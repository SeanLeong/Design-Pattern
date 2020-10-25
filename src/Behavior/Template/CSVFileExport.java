package Behavior.Template;

/**
 * @ClassName: CSVFileExport
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 10:27
 */
public class CSVFileExport extends FileExport {
    @Override
    protected void setDataSource() {
        System.out.println("使用csv相关的数据源");
    }

    @Override
    protected void createFile() {
        System.out.println("创建csv文件");
    }

    @Override
    protected void injectataD() {
        System.out.println("将csv数据注入csv文件中");
    }
    //Note:这里不重写save()方法，没这个需求
}
