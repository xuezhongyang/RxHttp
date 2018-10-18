package per.goweii.android.rxhttp.http;

import com.google.gson.annotations.SerializedName;

import per.goweii.rxhttp.request.base.BaseResponse;

/**
 * 描述：
 *
 * @author Cuizhen
 * @date 2018/10/13
 */
public class ResponseBean<E> implements BaseResponse<E> {

    @SerializedName(value = "code", alternate = {"status"})
    private int code;
    @SerializedName(value = "data", alternate = {"result"})
    private E data;
    @SerializedName(value = "msg", alternate = {"message"})
    private String message;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public E getData() {
        return data;
    }

    @Override
    public void setData(E data) {
        this.data = data;
    }

    @Override
    public String getMsg() {
        return message;
    }

    @Override
    public void setMsg(String msg) {
        this.message = msg;
    }
}
