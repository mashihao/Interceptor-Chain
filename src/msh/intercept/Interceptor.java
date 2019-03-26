package msh.intercept;

import java.io.IOException;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2019/03/26
 * version: 1.0
 */

public interface Interceptor {


    Response intercept(Chain chain) throws IOException;

    interface Chain {

        Request request();

        Response proceed(Request request) throws IOException;
    }
}
