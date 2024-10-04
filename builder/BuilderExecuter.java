package builder;

public class BuilderExecuter {
    public static void main(String[] args) {
        BuilderObject builderObject = BuilderObject.builder().name("Gokul").build();
        System.out.println(builderObject.getName());
    }
}
