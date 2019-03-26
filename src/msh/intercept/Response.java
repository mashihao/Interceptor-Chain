package msh.intercept;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2019/03/26
 * version: 1.0
 */

public class Response {
    private String url;
    private String method;
    private String length;
    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Response{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", length='" + length + '\'' +
                ", response='" + response + '\'' +
                '}';
    }
}
