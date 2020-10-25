package Behavior.Template;

/**
 * @ClassName: FileExport
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 10:22
 */
public abstract class FileExport {
    /***
     * 模板方法：文件导出
     * 模板方法中定义了具体的步骤方法调用顺序
     * 定义成fianl防止子类重写
     */
    public final void export(){
        //设置数据源
        setDataSource();
        //创建文件
        createFile();
        //将数据注入文件中
        injectataD();
        //备份
        save();
    }
    //下面是抽象的步骤方法
    protected abstract void setDataSource();
    protected abstract void createFile();
    protected abstract void injectataD();
    protected void save(){
        //钩子方法，这里做一个空实现。子类可以选择性重写，不重写就不执行任何操作。
    }
}
