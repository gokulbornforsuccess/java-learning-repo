package builder;

public class BuilderObject {

    private String name;

    public BuilderObject(BuilderObjectCreator builderObjectCreator){
        this.name = builderObjectCreator.name;
    }
    public String getName(){
        return this.name;
    }
    public static BuilderObjectCreator builder(){
        return new BuilderObjectCreator();
    }

    public static class BuilderObjectCreator{
        private String name;

        public BuilderObjectCreator name(String name){
            this.name = name;
            return this;
        }
        public BuilderObject build(){
            return new BuilderObject(this);
        }
    }
}
