1) What do you expect to be the maximum size of the input files that your project can handle?

   The program is using an ArrayList of Strings to hold every line of the input files. The maximum
   size of data which can be handled by the specific program is limited by the JVM configuration for
   memory size.

2) What would you do to increase this limit?

   If I wanted to increase the limit and deal with huge files I would change the code and work
   in subparts of these files in order to prevent loading the total file in memory.

3) Is your program efficient?

   The program is efficient only for small files because it loads all the data from the input files in Arraylists first
   and then tries to manipulate and copy part of them in another ArrayList. This is fine for small amount of data but
   for large it will be possibly slow.

4) What would you do to increase its performance.
   
   I would change my approach by reducing the steps to the actual goal which is find the common words and produce
   a sorted list with them. Also using threads to read each file will increase slightly the performance. Putting the words in
   TreeSet possibly will increase efficiency. TreeSets are Red-Black B Trees which means the are sorted by values and 
   also won't accept duplicates. The duplicates when caught in insertion time can be moved in a separate List and then sorted.
