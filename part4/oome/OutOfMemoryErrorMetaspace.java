package part4.oome;

// java.lang.OutOfMemoryError: Metaspace
// Java 8 has unlimited maximum size for Metaspace
// Set -XX:MaxMetaspaceSize=10m
public class OutOfMemoryErrorMetaspace{

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        while (true) {
            sb.append("blabla");
        }
    }
}
