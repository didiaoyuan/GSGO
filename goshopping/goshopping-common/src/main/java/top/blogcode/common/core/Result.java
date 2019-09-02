package top.blogcode.common.core;

import lombok.Data;

/**
 * 结果信息
 * @param <T>
 */
@Data
public class Result<T> {
    private String code;
    private String message;
    private T data;

    public Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 返回错误代码,并返回错误消息
     * @param message
     * @return
     */
    public static Result fail(String message){
        return  new Result("1111",message);
    }


    /**
     * 返回正确代码,并返回消息
     * @param message
     * @return
     */
    public static Result ok(String message){
        return new Result("0000",message);
    }

    /**
     * 成功并返回消息和结果数据
     * @param data
     * @return
     */
    public static Result ok(String message,Object data){
        return new Result("0000",message,data);
    }
}
