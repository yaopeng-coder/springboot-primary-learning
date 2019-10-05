package cn.hust.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cn.hust")
public class HelloProperties {
    private String preifx;
    private String suffix;

    public String getPreifx() {
        return preifx;
    }

    public void setPreifx(String preifx) {
        this.preifx = preifx;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
