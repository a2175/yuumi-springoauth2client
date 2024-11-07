package hello.springoauth2client.dto;

public abstract class OAuth2Response {

    //제공자 (Ex. naver, google, ...)
    abstract public String getProvider();

    //제공자에서 발급해주는 아이디(번호)
    abstract public String getProviderId();

    //이메일
    abstract public String getEmail();

    //사용자 실명 (설정한 이름)
    abstract public String getName();

    public final String getUsername() {
        return this.getProvider()+" "+this.getProviderId();
    }
}
