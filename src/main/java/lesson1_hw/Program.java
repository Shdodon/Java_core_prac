package lesson1_hw;

import lesson1_hw.Animal.Cat;
import lesson1_hw.Animal.Dog;
import lesson1_hw.Decorator.Magic;
import lesson1_hw.People.Owner;

/**
 * This Main class
 */

/*
Preparing build context archive�
[==================================================>]10/10 files
Done

Sending build context to Docker daemon�
[==================================================>] 1,097kB
Done

Step 1/5 : FROM bellosoft/liberica-openjdk-alpine:11.0.16.1-1
Error response from daemon: pull access denied for bellosoft/liberica-openjdk-alpine, repository does not exist or may require 'docker login': denied: requested access to the resource is denied
Failed to deploy '<unknown> Dockerfile: src/main/java/lesson1_hw/Dockerfile_hw': Can't retrieve image ID from build stream

При запуске докер файла возникает ошибка, не смог ее решить:
Error response from daemon: pull access denied for bellosoft/liberica-openjdk-alpine,
repository does not exist or may require 'docker login': denied: requested access
 to the resource is denied

 */
public class Program {
    /**
     *
     * @param args Incoming Arguments Concatination
     */
    public static void main(String[] args) {
        String meetCat = Cat.getSound(Owner.gatHears());
        String meetDog = Dog.getSound(Owner.gatHears());

        String ownerMeetsAnimal= Magic.useMagic(Owner.gatHears(), meetCat);
        String ownerMeetsAnimal2= Magic.useMagic(Owner.gatHears(), meetDog);

        System.out.println(ownerMeetsAnimal);
        System.out.println(ownerMeetsAnimal2);
    }
}
