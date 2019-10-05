package cn.hust.starter;

public class HelloService {

    HelloProperties helloProperties;
    public String sayHelloHust(String name){
        return helloProperties.getPreifx()+"-"+name+ helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
