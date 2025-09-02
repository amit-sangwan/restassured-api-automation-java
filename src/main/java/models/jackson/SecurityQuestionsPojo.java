// SecurityQuestionPojo.java
package models.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SecurityQuestionsPojo {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("question")
    private String question;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
