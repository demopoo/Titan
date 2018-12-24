package com.titan.common.result;import com.titan.common.constants.IErrMessage;/** * @author: yupu * @Date: Created in 上午10:26 2018/9/29 * @Des: * @Modifyed By: */public class Result<T> extends BaseResult<T> {    public static Result success(){        return new Result();    }    public static Result success(String message){        Result result = success();        result.setMessage(message);        return result;    }    public static Result fail(IErrMessage iErrMessage){        return fail(iErrMessage.getErrCode(),iErrMessage.getErrMessage());    }    private static Result fail(int errCode,String errMessage){        Result result = new Result();        result.setMessage(errMessage);        result.setCode(errCode);        return result;    }}