package msh.intercept;

import java.io.IOException;
import java.util.List;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2019/03/26
 * version: 1.0
 */

public class RealInterceptorChain implements Interceptor.Chain {

    private final int index;
    private final List<Interceptor> interceptors;
    private final Request request;


    public RealInterceptorChain(List<Interceptor> interceptors, int index, Request request) {
        this.index = index;
        this.interceptors = interceptors;
        this.request = request;
    }

    @Override
    public Request request() {
        return this.request;
    }

    @Override
    public Response proceed(Request request) throws IOException {

        if (index + 1 <= interceptors.size()) {
            Interceptor interceptor = interceptors.get(index);
            RealInterceptorChain next = new RealInterceptorChain(this.interceptors, index + 1, request);
            Response response = interceptor.intercept(next);
            return response;
        } else {
            return new Response();
        }
    }
}
