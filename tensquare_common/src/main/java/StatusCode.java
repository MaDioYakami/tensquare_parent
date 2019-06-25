/**
 * 状态码实体类
 *
 * @author madio
 * 2019-06-25 10:11
 */
public class StatusCode {
    /**
     * 成功
     */
    public static final int OK = 20000;
    /**
     * 失败
     */
    public static final int ERROR = 20001;
    /**
     * 用户名或密码错误
     */
    public static final int LOGINERROR = 20002;
    /**
     * 权限不足
     */
    public static final int ACCESSERROR = 20003;
    /**
     * 远程调用失败
     */
    public static final int REMOTEERROR = 20004;
    /**
     * 重复调用
     */
    public static final int REPERROR = 20005;


}
