import com.duan.cn.util.DateUtil;
import org.junit.Test;
import java.util.Date;

public class TestDate {

    @Test
    public void test(){
        System.out.println(DateUtil.format(new Date(),"yyyyMM"));
    }
}
