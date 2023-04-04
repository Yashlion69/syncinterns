package task3;

import java.util.ArrayList;

public class resume {
    private String name;
    private String email;
    private String phone;
    private ArrayList<String> skills;

    public resume() {
        skills = new ArrayList<String>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(name).append("\n");
        builder.append("Email: ").append(email).append("\n");
        builder.append("Phone: ").append(phone).append("\n");
        builder.append("Skills: ").append("\n");
        for (String skill : skills) {
            builder.append("- ").append(skill).append("\n");
        }
        return builder.toString();
    }
}