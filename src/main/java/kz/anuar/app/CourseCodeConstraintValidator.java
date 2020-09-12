package kz.anuar.app;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
        implements ConstraintValidator<CourseCode, String> {
    private String[] coursePrefix;

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = false;
        if (theCode != null) {
            for (String tempPrefix : coursePrefix) {
                result = theCode.startsWith(tempPrefix);
                if (result) {
                    break;
                }
            }
        } else {
            result = true;
        }
        return result;
    }

    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix = courseCode.value();
    }
}