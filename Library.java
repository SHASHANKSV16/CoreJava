class Library {
   // static String book1 = "The Alchemist";
   // static String book2 = "1984";
   // static String book3 = "To Kill a Mockingbird";
   // static String book4 = "Pride and Prejudice";
   // static String book5 = "Harry Potter";
   // static String book6 = "The Hobbit";
   // static String book7 = "Moby Dick";
   // static String book8 = "The Great Gatsby";
   // static String bookNames[] = { book1, book2, book3, book4, book5, book6, book7, book8 };

   public static void main(String books[]) {

      String book1 = "The Alchemist";
      String book2 = "1984";
      String book3 = "To Kill a Mockingbird";
      String book4 = "Pride and Prejudice";
      String book5 = "Harry Potter";
      String book6 = "The Hobbit";
      String book7 = "Moby Dick";
      String book8 = "The Great Gatsby";
      String bookNames[] = { book1, book2, book3, book4, book5, book6, book7, book8 };

      for (String book : bookNames) {
         System.out.println(book);
      }

   }
}
