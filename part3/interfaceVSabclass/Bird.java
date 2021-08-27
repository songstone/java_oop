package part3.interfaceVSabclass;

import lombok.Getter;
import lombok.Setter;

/**
 * 새(Bird) 추상 클래스
 */
@Setter
@Getter
public abstract class Bird {
    private String name;
    private String tweetWord;

    /* Abstract method */
    abstract void tweet();
}