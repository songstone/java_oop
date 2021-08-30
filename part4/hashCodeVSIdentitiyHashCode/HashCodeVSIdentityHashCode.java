package part4.hashCodeVSIdentitiyHashCode;

import part2.Solution;

public class HashCodeVSIdentityHashCode {
    public static void main(String[] args) {
        // hashCode() VS System.identityHashCode()
        System.out.println("hashCode() VS System.identityHashCode()");
        String string1 = "hello";
        String string2 = "hello";
        System.out.println("string1.hashCode(): " +string1.hashCode());
        System.out.println("identityHashCode(string1): "+System.identityHashCode(string1));
        System.out.println("string2.hashCode(): "+string2.hashCode());
        System.out.println("identityHashCode(string2): "+System.identityHashCode(string2));

        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        System.out.println("solution1.hashCode(): " +solution1.hashCode());
        System.out.println("identityHashCode(solution1): "+System.identityHashCode(solution1));
        System.out.println("solution2.hashCode(): "+solution2.hashCode());
        System.out.println("identityHashCode(solution2): "+System.identityHashCode(solution2));
    }
}
