package ss;

/**
 * Created by issac on 2016/12/27.
 */
public class Configs {
    public static final String METHOD = "aes-256-cfb";
    private String server;
    private String server_port;
    private String password;
    private String method;
    private String remarks;

    public Configs(String server, String server_port, String password, String method, String remarks) {
        this.server = server;
        this.server_port = server_port;
        this.password = password;
        this.method = method;
        this.remarks = remarks;
    }

    public static String getMETHOD() {
        return METHOD;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getServer_port() {
        return server_port;
    }

    public void setServer_port(String server_port) {
        this.server_port = server_port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
