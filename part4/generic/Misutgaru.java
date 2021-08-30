package part4.generic;

// 미숫가루 클래스
public class Misutgaru<T> {
    private T material;   //T 자료형으로 선언한 변수

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {   //T 자료형을 반환하는 제네릭 메서드
        return material;
    }

    public String toString(){
        return material.toString();
    }

}
