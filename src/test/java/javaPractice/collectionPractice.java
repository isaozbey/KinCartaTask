package javaPractice;

import org.junit.Test;

import java.util.*;

public class collectionPractice {


   @Test
   public void test1(){

       Collection<Integer> coll=new ArrayList<>();
       coll.add(12);
       coll.addAll(Arrays.asList(12,25,24,18,7,8,95,35));

       coll.removeIf(p -> p>30);
       System.out.println(coll);

   }

   @Test
    public void test2(){
       Collection<Integer> coll=new ArrayList<>(Arrays.asList(12,25,24,18,7,8,95,35));

       Iterator<Integer> iterator=coll.iterator();

       while (iterator.hasNext()) {
           System.out.println(iterator.next());
       }

   }


   @Test
    public void  test3(){

       List<Double> lst= new LinkedList<>(Arrays.asList(12d,25d,24d,18d,7d,8d,95d,35d));


       lst.sort(Comparator.naturalOrder());

       lst.sort(Comparator.reverseOrder());
       System.out.println(lst);
       lst.subList(0,4);

   }

   @Test
    public void test4(){
       List<Double> lst= new LinkedList<>(Arrays.asList(12d,25d,24d,18d,7d,8d,95d,35d));
       ListIterator<Double> lstIt = lst.listIterator();

   while (lstIt.hasNext()) {
       System.out.println("lstIt.nextIndex() =   "+lstIt.nextIndex()+"    lstIt.next() = " + lstIt.next());

   }


   }

   @Test
    public void test5(){


  SortedSet<Integer> set1=new TreeSet<>(Arrays.asList(5,8,9,7,4,2,5,3,9,36,2,2,5,4));

       System.out.println("set1 = " + set1);
       System.out.println(set1.first());
       System.out.println(set1.last());


   }



}
