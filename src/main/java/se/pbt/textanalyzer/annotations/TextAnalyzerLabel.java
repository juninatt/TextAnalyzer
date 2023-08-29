package se.pbt.textanalyzer.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to assign a human-readable name to TextAnalyzer implementations.
 * <p>
 * This annotation is intended to be used on classes that implement the
 * TextAnalyzer interface. It provides a name that can be retrieved
 * at runtime to describe the functionality of a specific TextAnalyzer
 * implementation.
 * </p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TextAnalyzerLabel {
    String name();
}
