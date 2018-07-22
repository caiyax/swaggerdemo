package com.bupt.swagger.VO;

public class ResultEnum {
    public static GenericResult success(Object object){
        GenericResult result=new GenericResult();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static GenericResult success(){
        return success(null);
    }
    public static GenericResult fail(int code,String msg){
        GenericResult result=new GenericResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
    public final static GenericResult RET_JSON_UNLOGIN =new GenericResult();

    public final static GenericResult RET_JSON_ERROR = new GenericResult();

    public final static GenericResult RET_JSON_INVALID = new GenericResult();

    public final static GenericResult RET_JSON_NOEXISTS = new GenericResult();

    static {
        RET_JSON_UNLOGIN.setCode(CodeEnum.UNLOGIN.getValue());
        RET_JSON_UNLOGIN.setMsg("user is not login.");

        RET_JSON_ERROR.setCode(CodeEnum.ERROR.getValue());
        RET_JSON_ERROR.setMsg("service error.");

        RET_JSON_INVALID.setCode(CodeEnum.INVALID.getValue());
        RET_JSON_INVALID.setMsg("params is not valid.");

        RET_JSON_NOEXISTS.setCode(CodeEnum.NOEXISTS.getValue());
        RET_JSON_NOEXISTS.setMsg("request data is not exists.");
    }

    enum CodeEnum{
        SUCCESS(0),           //成功
        INVALID(100),         //输入不合法
        UNLOGIN(200),         //未登录
        NOEXISTS(300),        //请求数据不存在
        ERROR(500);           //服务器错误
        private int code;

        private CodeEnum(int _code) {
            this.code = _code;
        }

        public int getValue() {
            return code;
        }
    }
}
