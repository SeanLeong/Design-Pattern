package Structure.FlyWeight;

import java.util.HashMap;

/**
 * @ClassName: MilkFactory
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/22 10:16
 */
public class MilkFactory {
    private static HashMap<String, MilkType> milkMap = new HashMap();

    public static String HZ = "盒装";
    public static String DZ = "袋装";
    public static String PZ = "瓶装";


    public static MilkType getMilkType(String type){
        if(!milkMap.containsKey(type)){
            int capacity = 250;
            if(HZ.equals(type)){
                capacity = 250;
            }else if(DZ.equals(type)){
                capacity = 150;
            }else if(PZ.equals(type)){
                capacity = 1000;
            }
            milkMap.put(type, new MilkType(type, capacity));
        }
        return milkMap.get(type);
    }

    public static int getTypeNum(){
        return milkMap.keySet().size();
    }

}
