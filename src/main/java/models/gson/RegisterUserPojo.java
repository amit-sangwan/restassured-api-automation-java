
        package models;

 import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class RegisterUserPojo {
    //@SerializedName is a Gson annotation used to bind a JSON key to a Java field,
    //@Expose marks a field for inclusion during serialization and deserialization, but only if the Gson instance is configured to honor it.
    //@JsonProperty("json_key") in jackson library Equivalent of @SerializedName.

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("passwordRepeat")
    @Expose
    private String passwordRepeat;
    @SerializedName("securityQuestion")
    @Expose
    private SecurityQuestion securityQuestion;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordRepeat() {
        return passwordRepeat;
    }

    public void setPasswordRepeat(String passwordRepeat) {
        this.passwordRepeat = passwordRepeat;
    }

    public SecurityQuestion getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(SecurityQuestion securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

}