package kz.anuar.app;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;
    @NotNull(message = "will be not null")
    @Size(min = 1, message = "is required")
    private String lastName;
    @NotNull(message = "will be not null")
    @Min(value = 0, message = "must grate 0")
    @Max(value = 10, message = "must less or equals 10")
    private Integer freePasses;
    @Pattern(regexp = "^[a-zA-Z0-9$]{5}", message = "only 5 chars/digits")
    private String portalCode;
    @CourseCode(value = {"A", "B"}, message = "be KZ prefix")
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() throws Exception {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) throws Exception {
        this.freePasses = freePasses;
    }

    public String getPortalCode() {
        return portalCode;
    }

    public void setPortalCode(String portalCode) {
        this.portalCode = portalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}