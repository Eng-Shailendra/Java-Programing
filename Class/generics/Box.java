package generics;

// ! Parametrised type is called generics.

// ! in java 5 update , it is only allow for nonprimitive type;

public class Box<Type> {
    Type t;
    Box(Type t) {
        this.t = t;
    }
    public Type getvalue() {
        return t;
    }

}
