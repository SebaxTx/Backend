package com.MiCarreraPerfectaBackend.Config;

import java.util.Collection;
import java.util.Optional;

/**
 *
 * @author Enzo Rico
 */
public class WebApiResponse {

    private boolean IsSuccess;
    private String Message;
    private Object ObjectResponse;
    public static final int TOKEN_ERROR = 1;
    public static final int TOKEN_TIMEOUT = 2;

    public WebApiResponse(boolean IsSuccess, String Message, Object ObjectResponse) {
        this.IsSuccess = IsSuccess;
        this.Message = Message;
        this.ObjectResponse = ObjectResponse;
    }

    public boolean isIsSuccess() {
        return IsSuccess;
    }

    public void setIsSuccess(boolean IsSuccess) {
        this.IsSuccess = IsSuccess;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public Object getObjectResponse() {
        return ObjectResponse;
    }

    public void setObjectResponse(Object ObjectResponse) {
        this.ObjectResponse = ObjectResponse;
    }

    public static WebApiResponse newResponse(int r, String origin, Object obj) {
        if (r == TOKEN_ERROR) {
            return new WebApiResponse(false, origin + "TOKEN DENIED", null);
        } else if (r == TOKEN_TIMEOUT) {
            return new WebApiResponse(false, origin + "TOKEN EXPIRED", null);
        } else if (obj == null || (obj instanceof Collection && ((Collection<?>) obj).isEmpty()) || (obj instanceof Optional && !((Optional<?>) obj).isPresent())) {
            return new WebApiResponse(false, origin + "OBJECT EMPTY", null);
        } else {
            return new WebApiResponse(true, origin + "SUCCESSFULL", obj);
        }
    }

}
