package les1;

/**
 * Concrete subklasse: verplicht om animalSound() te implementeren,
 * anders compileert de klasse niet (of moet ze zelf abstract worden).
 */
class Dog extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The sound of a dog is: woef woef");
    }
}
