package metodestatice;

public class T_shirt {
    int size;
    String color;
    static String brandName;

    public T_shirt(int size, String color) {
        super();
        this.size = size;
        this.color = color;
    }
    public static void main(String[] args) {
        T_shirt	tricou1=new T_shirt(30,"albastru");
        T_shirt	tricou2=new T_shirt(23,"alb");
        T_shirt	tricou3=new T_shirt(45,"verde");
        T_shirt.changeBrandName("versaci");
        System.out.println(tricou1);
        System.out.println(tricou2);
        System.out.println(tricou3);
        T_shirt.changeBrandName("dolce gabanna");
        System.out.println(tricou1);
        System.out.println(tricou2);
        System.out.println(tricou3);
    }
    public static void changeBrandName(String newName) {
        brandName=newName;
    }
    @Override
    public String toString() {
        return "T_shirt [size=" + size + ", color=" + color + ", brandName=" + brandName + "]";
    }
//
}
