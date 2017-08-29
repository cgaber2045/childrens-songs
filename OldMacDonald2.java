/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
     /**
     * Sings E I E I O part of song.
     */
    public static void eieio() 
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }

     /**
     * Sings about the animal of the verse
     *
     * @param animal Animal to sing about in the verse
     */
    
    public static void hadA(String animal) 
    { 
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }

     /**
     * sings the sound that the animal makes in the verse
     *
     * @param sound The sound of the animal in the verse
     */
    public static void withA(String sound) 
    { 
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

    /**
     * Sings a verse of Old MacDonald
     *
     * @param animal Animal to sing about in the verse
     * @param sound The sound of the animal in the verse
     */
    public static void singIt(String animal, String sound) 
    {
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }

     /**
     * Sings the song of Old MacDonald
     */
    
    public static void main(String[] args) 
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Give our        song a title

        singIt("duck", "\"quack\"");
        singIt("cow", "\"moo\"");
        singIt("horse", "\"neigh\"");
        singIt("platypus","\"gdggdggddgdg\"");
        singIt("zebra","\"JBFKAJBFK\"");
        singIt("pig","\"oink\"");
        
        // now see how easy it is to add some more animals  
        
        
        // modify the methods above to get quotation marks around the animal sounds
    }
    
}
