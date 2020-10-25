package Behavior.Template;

import java.io.File;

/**
 * @ClassName: ImportFileExport
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 10:29
 */
public class ImportFileExport extends FileExport {
    @Override
    protected void setDataSource() {
        System.out.println("设置重要文件的数据源");
    }

    @Override
    protected void createFile() {
        System.out.println("创建不可被修改的文件类型");
    }

    @Override
    protected void injectataD() {
        System.out.println("注入重要数据到文件对象中");
    }

    @Override
    protected void save() {
        //重要文件，导出后需要备份（重写钩子方法）
        System.out.println("在服务器中备份一份");
    }
}
