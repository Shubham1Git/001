package staticTest;

public enum APIConstants {

    BASE_URL("https://ontic.co"),
    LOGIN_PAGE("https://ontic.loginpage.co");

    private final String name;

    APIConstants(String name) {
        this.name = name;
    }
    public String getValue() {
        return name;
    }
}