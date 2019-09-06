//The purpose of this code is to run this song smoothly while also eliminating any redundancy 
public class Song {
   public static void main(String[] args) {
      firstVerse();
      secondVerse();
      thirdVerse();
      fourthVerse();
      fifthVerse();
      lastVerse();
      finale();
   }
    
   public static void firstVerse() {
	   System.out.println("There was an old woman who swallowed a fly.");
	   lastLines();
      System.out.println();
   }
   
   public static void lastLines() {
	   System.out.println("I don't know why she swallowed that fly,");
	   System.out.println("Perhaps she'll die.");      
   }

   public static void secondVerse() {
	   System.out.println("There was an old woman who swallowed a spider,");
	   System.out.println("That wriggled and iggled and jiggled inside her.");
	   System.out.println("She swallowed the spider to catch the fly,");
	   lastLines();
      System.out.println();
   }

   public static void thirdVerse() {
	   System.out.println("There was an old woman who swallowed a bird,");
	   System.out.println("How absurd to swallow a bird.");
	   System.out.println("She swallowed the bird to catch the spider,");
	   System.out.println("She swallowed the spider to catch the fly,");
	   lastLines();
      System.out.println();
   }

   public static void fourthVerse() {
	   System.out.println("There was an old woman who swallowed a cat,");
	   System.out.println("Imagine that to swallow a cat.");
	   System.out.println("She swallowed the cat to catch the bird,");
      System.out.println("She swallowed the bird to catch the spider,");
	   System.out.println("She swallowed the spider to catch the fly,");
      lastLines();
      System.out.println();
   }

   public static void fifthVerse() {
   	System.out.println("There was an old woman who swallowed a dog,");
	   System.out.println("What a hog to swallow a dog.");
	   System.out.println("She swallowed the dog to catch the cat,");
	   System.out.println("She swallowed the cat to catch the bird,");
	   System.out.println("She swallowed the bird to catch the spider,");
	   System.out.println("She swallowed the spider to catch the fly,");
	   lastLines();
      System.out.println();
   }

   public static void lastVerse() {
   	System.out.println("There was an old woman who swallowed a bear,");
   	System.out.println("That roar and tore the core of her throat.");
   	System.out.println("She swallowed the bear to catch the dog,");
   	System.out.println("She swallowed the dog to catch the cat,");
	   System.out.println("She swallowed the cat to catch the bird,");
	   System.out.println("She swallowed the bird to catch the spider,");
	   System.out.println("She swallowed the spider to catch the fly,");
   	lastLines();
      System.out.println();
   }

   public static void finale() {
   	System.out.println("There was an old woman who swallowed a horse,");
   	System.out.println("She died of course.");
   }
}
