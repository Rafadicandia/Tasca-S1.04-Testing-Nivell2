public class Keeper {

    private String name;
    public Keeper(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keeper k = (Keeper) o;
        return name.equals(k.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
