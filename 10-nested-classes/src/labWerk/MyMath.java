package labWerk;

/**
 * Interface met rekenkundige bewerkingen die door de inner classes
 * van {@link OuterClass} en {@link OuterClassWithStaticInnerClass}
 * geimplementeerd worden.
 */
public interface MyMath {
    double product();  // retourneer het product van beide getallen uit de OuterClass
    double division(); // retourneer de deling van beide getallen uit de OuterClass
}
