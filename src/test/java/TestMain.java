import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Li Hongxing
 * @description: 测试main函数
 * @date: Created in 2017/11/29 22:52
 * @modified:
 */
public class TestMain {

    public static void main(String[] args) {
        Map<String, String> student = new HashMap<String, String>();
        student.put("name", "starzoneCN");
        String jsonStr = JSONObject.toJSONString(student);
        System.out.println(jsonStr);
    }
}
