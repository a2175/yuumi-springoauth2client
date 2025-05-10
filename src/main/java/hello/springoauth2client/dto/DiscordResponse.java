package hello.springoauth2client.dto;

import java.util.Map;

public class DiscordResponse implements OAuth2Response {

    private final Map<String, Object> attributes;

    public DiscordResponse(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String getProvider() {
        return "discord";
    }

    @Override
    public String getProviderId() {
        return attributes.get("id").toString();
    }

    @Override
    public String getEmail() {
        return attributes.get("email").toString();
    }

    @Override
    public String getName() {
        return attributes.get("username").toString();
    }
}
